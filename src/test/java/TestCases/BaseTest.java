package TestCases;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import utilities.WebDriverListeners;

import java.time.Duration;

public class BaseTest {
    //Globals
    public static WebDriver driver;
    SoftAssert softAssert;
    protected Faker faker;

    @BeforeMethod
    public void setup(){
        WebDriverListeners myListeners = new WebDriverListeners();
         driver = new EventFiringDecorator(myListeners).decorate(driver);
    }

    @BeforeMethod
    public void endTest(){
        driver = new ChromeDriver();
        faker = new Faker();
        softAssert = new SoftAssert();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void startTest(){
        softAssert.assertAll();
        driver.close();
    }

    @AfterSuite
    public void finish() {
        driver.quit();
    }
}
