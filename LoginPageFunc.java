import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageFunc {
    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        // Set the system property for Chrome driver with its path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();
        WebElement sec=driver.findElement(By.className("login-button"));
        sec.click();
        Thread.sleep(4000);
        WebElement sec1=driver.findElement(By.id("usernameInput"));
        sec1.sendKeys("rahul");
        WebElement sec2=driver.findElement(By.className("login-button"));
        sec2.click();
        Thread.sleep(4000);
        WebElement sec4=driver.findElement(By.id("passwordInput"));
        sec4.sendKeys("rahul@2021");
        Thread.sleep(4000);
        WebElement sec5=driver.findElement(By.className("login-button"));
        sec5.click();
        driver.close();



    }
}
