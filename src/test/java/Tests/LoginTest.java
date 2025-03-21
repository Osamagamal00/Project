package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.JsonReader;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    HomePage homePage;
    LoginPage loginPage;
    JsonReader loginData = new JsonReader("LoginData.json");
    String email = loginData.readDataFromJson("email");
    String password = loginData.readDataFromJson("password");

   @Test
    public void Test()
    {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.navigateToHomePage();
        homePage.validateThatHomePageLogoIsDisPlayed();
        homePage.clickMyAccountBtn();
        homePage.clickLoginBtn();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginBtn();
        homePage.validatThatAccountlabelIsDisplayed();
        homePage.clickMyAccountBtn();
        homePage.clickLOgOutBtn();


    }

}
