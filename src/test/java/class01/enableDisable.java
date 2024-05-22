package class01;

import org.testng.annotations.Test;

public class enableDisable {

    @Test
    public  void Atest(){
        System.out.println("i am a test");
    }

//    failing
    @Test(enabled = false)
    public  void Btest(){
        System.out.println("i am b test");
    }


}
