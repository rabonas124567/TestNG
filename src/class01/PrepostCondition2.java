package class01;

import org.testng.annotations.*;

public class PrepostCondition2 {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("I am BeforeSuite");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("I am BeforeTest");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("I am BeforeClass");
    }
    @BeforeMethod
    public void beforemethod() {
        System.out.println("I am BeforeMethod");
    }



    @Test
    public void firstmethod() {
        System.out.println("I am Test");
    }
    @Test
    public void secondmethod() {
        System.out.println("I am Test");
    }


    @AfterMethod
    public void aftermethod() {
        System.out.println("I am AfterMethod");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("I am afterclass");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("I am AfterTest");
    }
    @AfterSuite
    public void afteresuite(){
        System.out.println("I am BeforeSuite");
    }
}
