import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;
public class LoginPageTest {
    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        // Set the system property for Chrome driver with its path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://qamoviesapp.ccbp.tech");
        driver.manage().window().maximize();

        // Locate the username input field element by its id
        WebElement image=driver.findElement(By.className("login-website-logo"));
        boolean imagePresent=image.isDisplayed();
        System.out.println(imagePresent);
        Assert.assertTrue(imagePresent,"No image is Present");
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(By.className("sign-in-heading")).getText(),"Login");
        System.out.println("true");
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(By.className("input-label")).getText(),"USERNAME");
        System.out.println("true");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/div[2]/label")).getText(),"PASSWORD");
        System.out.println("true");
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(By.className("login-button")).getText(),"Login");
        System.out.println("true");
        driver.close();


        // Locate the password input field element by its id

    }

}
