package class2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    @Test
    public void softassertionvalidaion(){
        String expected="I am rabonas Suga";
        String actual="I am rabonas";

        SoftAssert softassert=new SoftAssert();
        softassert.assertEquals(expected,actual);
        System.out.println("After first assertion");

        softassert.assertTrue(false);
        System.out.println("After second  assertion");

        softassert.assertFalse(true);
        System.out.println("After third assertion");

        softassert.assertFalse(false);
        System.out.println("After forth assertion");

        String expected2="I am rabonas";
        String actual2="I am rabonas";
        softassert.assertEquals(expected2,actual2);
        System.out.println("After fifth assertion");
        softassert.assertAll();






    }
}
