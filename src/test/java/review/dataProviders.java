package review;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviders {

    @DataProvider(name="cred1")
    public Object[][] data (){
        Object[][] loginData = {
                {"Admin", "12345", "Invalid credentials"},
                {"ABCD", "Hum@nhrm123", "Invalid credentials"},
                {"Admin", "", "Password cannot be empty"},
                {"", "Hum@nhrm123", "Username cannot be empty"}
        };
        return loginData;
    }
    @DataProvider(name="cred2")
    public Object[][] data2 (){
        Object[][] loginData = {
                {"arman", "nelo", "rreyy"},
                {"jessy", "pinkman", "abra"},
                {"femind", "hen", "era"},
                {"sfsf", "ret", "tr"}
        };
        return loginData;
    }
    @Test(dataProvider = "cred1")
    public  void TestA1(String username, String Pass, String Msg){
        System.out.println(username);
        System.out.println(Pass);
        System.out.println(Msg);
    }

    @Test(dataProvider = "cred2")
    public  void TestA(String username, String Pass, String Msg){
        System.out.println(username);
        System.out.println(Pass);
        System.out.println(Msg);
    }
}
