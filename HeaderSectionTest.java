import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class HeaderSectionTest {
    @Test
    public void testmethod2() throws InterruptedException{
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("website-logo")));
        WebElement sec6=driver.findElement(By.className("website-logo"));
        boolean ispresent=sec6.isDisplayed();
        System.out.println(ispresent);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav-menu-list']")));
        List<WebElement> sec9=driver.findElements(By.xpath("//li[@class='list-item']"));
        if(sec9.size()>0){
            System.out.println("navitems are displayed");
        }
        else{
            System.out.println("not displayed");
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav-menu-list']/li[1]/a")));
        WebElement sec0=driver.findElement(By.xpath("//ul[@class='nav-menu-list']/li[1]/a"));
        String prop=sec0.getText();
        System.out.println(prop);
        sec0.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav-menu-list']/li[2]/a")));
        WebElement sec=driver.findElement(By.xpath("//ul[@class='nav-menu-list']/li[2]/a"));
        String prop1=sec.getText();
        System.out.println(prop1);
        sec.click();
        Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("avatar-img")));
        WebElement sec2=driver.findElement(By.className("avatar-img"));
        sec2.click();
        Thread.sleep(4000);
        driver.close();


    }
}
