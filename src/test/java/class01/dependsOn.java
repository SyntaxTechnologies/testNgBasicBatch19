package class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void  login(){
        System.out.println(10/0);
    }

    @Test(dependsOnMethods = {"login"})
    public void dashBoard(){
        System.out.println("i am dashbaord");
    }
}
