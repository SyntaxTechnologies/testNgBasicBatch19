package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class hardAssertion {
    public  static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(groups = "smoke")
    public void loginVerification(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement pasword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        pasword.sendKeys("asdasdad");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();
//        verify that the Invalid credentials is displayed
        String actualErrorMsg = driver.findElement(By.id("spanMessage")).getText();

        Assert.assertEquals( actualErrorMsg,"Invalid credentials");

        System.out.println("helooooooooooooooooooooooooooooooooooooooooooooooooo");

//        verify that the login button is  is enabled
        WebElement button= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        Assert.assertTrue(button.isEnabled());

    }


}