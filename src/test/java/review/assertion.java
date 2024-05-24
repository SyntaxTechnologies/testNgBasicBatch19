package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class assertion {
    //verify on fb that the login btn is present
//    and it says login
    public static WebDriver driver;
    @BeforeMethod
    public void launchFb(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void testCase(){
        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
//        the button says LOGIN
        String loginBtnText = loginBtn.getText();
//        verify that the text is Login ??
//        u will get the expected value from acceptance criteria
        Assert.assertEquals(loginBtnText,"Log i");//fail
        System.out.println("heeloo");
//        verify that the button is displayed
        boolean loginBtnDisplayed = loginBtn.isDisplayed();//pass
        Assert.assertTrue(loginBtnDisplayed);
    }

    @Test
    public void testCaseB(){
        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
//        the button says LOGIN
        String loginBtnText = loginBtn.getText();
//        verify that the text is Login ??
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(loginBtnText,"Log i");//fail
        System.out.println("barkat");
//        verify that the login btn is displayed
        boolean loginState = loginBtn.isDisplayed();
        soft.assertTrue(loginState);//pass

        soft.assertAll();

    }

    @AfterMethod
    public void closeFB(){
        driver.close();
    }
}
