package TestCases;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.TestListeners;

@Listeners(TestListeners.class)
public class LoginTest extends BaseTest{
    //Pages
    LoginPage loginPage;

    //Variables
    String email = "tikyzude@mailinator.com";
    String password = "Pa$w0rd!";

    //Test Cases
    @Test
    public void loginTest()  {
        loginPage = new LoginPage(driver);

        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.submitLoginForm();

        Assert.assertTrue(false);
    }
    @Test
    public void loginTest2()  {
        loginPage = new LoginPage(driver);

        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.submitLoginForm();

        Assert.assertTrue(true);
    }

    @Test
    public void loginTest3()  {
        loginPage = new LoginPage(driver);

        loginPage.fillEmail(email);
        loginPage.fillPassword(password);
        loginPage.submitLoginForm();

        Assert.assertTrue(true);
    }
}
