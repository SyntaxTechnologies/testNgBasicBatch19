package class01;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 3)
    public  void AtestCase(){
        System.out.println("i am test case A");
    }
    @Test(priority = 2)
    public  void BtestCase(){
        System.out.println("i am test case B");
    }

    @Test(priority = 1,groups = "smoke")
    public  void CtestCase(){
        System.out.println("i am test case C");
    }

    @Test
    public  void DtestCase(){
        System.out.println("i am test case D");
    }

}
