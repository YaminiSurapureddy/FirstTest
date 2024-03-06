import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class MovieDetailsPage {
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slick-list']")));
        Thread.sleep(4000);
        WebElement sec6=driver.findElement(By.xpath("//div[@data-index='0']"));
        sec6.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='similar-movies-list-container']")));
        List<WebElement> sec7=driver.findElements(By.xpath("//ul[@class='similar-movies-list-container']/li"));
        if(sec7.size()>0){
            System.out.println("movies are displayed");
        }
        else{
            System.out.println("not displayed");
        }
        WebElement sec8=driver.findElement(By.xpath("//ul[@class='nav-menu-list']/li[2]/a"));
        sec8.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-movies-container']")));
        WebElement sec9=driver.findElement(By.xpath("//div[@class='search-movies-container']/li[1]"));
        sec9.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='similar-movies-list-container']")));
        List<WebElement> sec0=driver.findElements(By.xpath("//ul[@class='similar-movies-list-container']/li"));
        if(sec0.size()>0){
            System.out.println("movies are displayed");
        }
        else{
            System.out.println("not displayed");
        }
        driver.close();

    }
}
