package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class task1 {
//       testCase 1
//    goto hrms
//    login and verify that user has logged in

//    testcase2
//    goto hrms and verify that the login btn is present

    public  static WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void loginVerification(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement pasword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        pasword.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();
        System.out.println(" i am logged in");
    }

    @Test
    public  void loginBtnEnable(){
        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        System.out.println(loginBtn.isEnabled());
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
