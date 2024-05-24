package review;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anotationsReview {

    @BeforeMethod
    public void beforeMehtod(){
        System.out.println("i am before method");
    }
    @AfterMethod
    public void afterMethod(){

        System.out.println("i am after method");
    }
    @Test(priority = 1,enabled = false)
    public void BtestCase(){
        System.out.println("i am a test case");
    }
    @Test(priority = 2,dependsOnMethods = {"testD"})
    public void AtestCaseB(){
        System.out.println("i am a test caseB");
    }
    @Test
    public void testD(){
        System.out.println(0/0);
    }


}
