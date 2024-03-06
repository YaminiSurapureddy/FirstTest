import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class AccountPageTest {
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("avatar-img")));
        WebElement sec2=driver.findElement(By.className("avatar-img"));
        sec2.click();
        Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account-heading")));
        WebElement sec6=driver.findElement(By.className("account-heading"));
        boolean ispresent=sec6.isDisplayed();
        System.out.println(ispresent);
        System.out.println(sec6.getText());
        WebElement sec7=driver.findElement(By.className("membership-heading"));
        boolean ispresent1=sec7.isDisplayed();
        System.out.println(ispresent1);
        System.out.println(sec7.getText());
        WebElement sec8=driver.findElement(By.xpath("//div[@class='plan-container']/p"));
        boolean ispresent2=sec8.isDisplayed();
        System.out.println(ispresent2);
        System.out.println(sec8.getText());
        WebElement sec9=driver.findElement(By.xpath("//div[@class='membership-details-container']/p[1]"));
        boolean ispresent3=sec9.isDisplayed();
        System.out.println(ispresent3);
        System.out.println(sec9.getText());
        WebElement sec0=driver.findElement(By.xpath("//div[@class='membership-details-container']/p[2]"));
        boolean ispresent4=sec0.isDisplayed();
        System.out.println(ispresent4);
        System.out.println(sec0.getText());
        WebElement sec11=driver.findElement(By.xpath("//div[@class='plan-details-container']/p[1]"));
        boolean ispresent5=sec11.isDisplayed();
        System.out.println(ispresent5);
        System.out.println(sec11.getText());
        WebElement sec12=driver.findElement(By.xpath("//div[@class='plan-details-container']/p[2]"));
        boolean ispresent6=sec12.isDisplayed();
        System.out.println(ispresent6);
        System.out.println(sec12.getText());
        WebElement sec13=driver.findElement(By.className("logout-button"));
        sec13.click();
        Thread.sleep(4000);
        driver.close();






    }
}
