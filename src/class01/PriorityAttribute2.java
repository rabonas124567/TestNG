package class01;

import org.testng.annotations.Test;

public class PriorityAttribute2 {
    @Test(priority = 1)
    public void loginmethod(){
        System.out.println("I am loginmethod");
    }

    @Test(priority = 2)
    public void lauchbrowsermethod(){
        System.out.println("I am lauchbrowsermethod");
    }

    @Test(priority = 3)
    public void navigatemethod(){
        System.out.println("I am navigatemethod");
    }

    @Test(priority = 4)
    public void clasemethod(){
        System.out.println("I am clasemethod");
    }
}
