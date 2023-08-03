package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertion2 {
    public WebDriver driver;

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "path/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test(enabled = false)
    public void validatedashboard() {
        System.out.println("I am varifying the dashboard");
    }

    @Test(enabled = false)
    public void validatelogo() {
        System.out.println("I am varifying the logo");
    }

    @Test(priority = 2, enabled = true)
    public void validatellogout() {
        //  validlogin(); You can the other methods in another method
        System.out.println("I am varifying the logout");
    }

    @Test(priority = 1, enabled = true)
    public void validlogin() {
        driver.navigate().to("https://vulms.vu.edu.pk/LMS_LP.aspx");
        WebElement StudentID = driver.findElement(By.id("txtStudentID"));
        StudentID.sendKeys("bc200416975");
        WebElement Password = driver.findElement(By.id("txtPassword"));
        Password.sendKeys("sysipus*2S");
        WebElement SignIn = driver.findElement(By.id("ibtnLogin"));
        SignIn.click();
        WebElement TEXT = driver.findElement(By.xpath("//li[@class='m-nav__item m--margin-top-10']"));
        if (TEXT.isDisplayed()) {
            String printTEXT = TEXT.getText();
            System.out.println("Text is displayed and the text is " + printTEXT);
        } else {
            System.out.println("Test is failed");
        }
    }
    @AfterMethod
    public void CloseBrowser () {
        driver.quit();
    }
}
