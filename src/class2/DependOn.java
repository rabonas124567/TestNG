package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DependOn {
    public WebDriver driver;

    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","path/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test()
    public void login(){
        System.out.println("This is my login Test");
        driver.navigate().to("https://vulms.vu.edu.pk/LMS_LP.aspx");
        WebElement StudentID=driver.findElement(By.id("txtStudentID"));
        StudentID.sendKeys("bc200416975");
        WebElement Password=driver.findElement(By.id("txtPassword"));
        Password.sendKeys("sysipus*2S");
        WebElement SignIn=driver.findElement(By.id("ibtnLogin"));
        SignIn.click();
    }

    @Test(priority = 2,dependsOnMethods ="login",enabled = false)
    public void varifyText() {
        System.out.println("This is my varifyText Test");
        WebElement TEXT = driver.findElement(By.xpath("//li[@class='m-nav__item m--margin-top-10']"));
        String printTEXT = TEXT.getText();
    }


    @Test(dependsOnMethods ="login")
    public void signout(){
         login();
        System.out.println("This is my signout test ");
        WebElement signout=driver.findElement(By.xpath("//li[@data-dropdown-toggle='click']"));
        signout.click();
        WebElement signoutclick=driver.findElement(By.xpath(" //a[@id='lnkLogout']"));
        signoutclick.click();
    }
   @AfterMethod
    public void closebrowser(){
        driver.quit();
    }

}
