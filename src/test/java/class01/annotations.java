package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }
    @Test
    public void BTestCase(){
        System.out.println("i am test case b");
    }
    @Test
    public  void ATestCase(){
        System.out.println("i am test case a");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("i am after method");
    }


}
