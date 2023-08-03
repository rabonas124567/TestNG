package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertBoolean {
    public WebDriver driver;

    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test()
    public void validlogin(){
        driver.navigate().to("https://vulms.vu.edu.pk/LMS_LP.aspx");
        WebElement StudentID=driver.findElement(By.id("txtStudentID"));
        StudentID.sendKeys("bc200416975");
        WebElement Password=driver.findElement(By.id("txtPassword"));
        Password.sendKeys("sysipus*2S");
        WebElement SignIn=driver.findElement(By.id("ibtnLogin"));
        SignIn.click();
        WebElement TEXT=driver.findElement(By.xpath("//li[@class='m-nav__item m--margin-top-10']"));


        Assert.assertTrue(TEXT.isDisplayed());
        System.out.println("TEXT is present");
    }
    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
    }
}
