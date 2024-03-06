import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class HomePageTest {
    @Test
    public void homePageMethod() throws InterruptedException {
        // Set the system property for Chrome driver with its path
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movies-list-heading")));
        WebElement sec6=driver.findElement(By.className("movies-list-heading"));
        boolean ispresent=sec6.isDisplayed();
        System.out.println(ispresent);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/h1")));
        WebElement sec7=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/h1"));
        boolean ispresent1=sec7.isDisplayed();
        System.out.println(ispresent1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slick-list']")));
        List<WebElement> mov = driver.findElements(By.xpath("//div[@class='slick-slide']"));
        if(mov.size()>0){
            System.out.println("Movies are displayed");
        }
        else{
            System.out.println("Not displayed");
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("contact-us-paragraph")));
        WebElement sec8=driver.findElement(By.className("contact-us-paragraph"));
        boolean ispresent3=sec8.isDisplayed();
        System.out.println(ispresent3);
        driver.close();




    }
}