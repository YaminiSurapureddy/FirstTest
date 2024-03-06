import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class SearchPageTest {
    @Test
    public void testmethod() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        WebElement sec1=driver.findElement(By.id("usernameInput"));
        sec1.sendKeys("rahul");
        WebElement sec4=driver.findElement(By.id("passwordInput"));
        sec4.sendKeys("rahul@2021");
        Thread.sleep(4000);
        WebElement sec5=driver.findElement(By.className("login-button"));
        sec5.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='search-empty-button']")));
        WebElement sec6=driver.findElement(By.xpath("//button[@class='search-empty-button']"));
        sec6.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
        WebElement sec7=driver.findElement(By.id("search"));
        sec7.sendKeys("titanic");
        WebElement sec9=driver.findElement(By.xpath("//button[@class='search-button']"));
        sec9.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='search-movies-container']")));
        List<WebElement> sec0=driver.findElements(By.xpath("//li[@class='movie-icon-item']"));
        if(sec0.size()>0){
            System.out.println("movies are displayed: "+sec0.size());
        }
        else{
            System.out.println("not displayed");
        }

        driver.close();



    }
}
