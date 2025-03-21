package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import Utilities.JsonReader;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase{

    HomePage homePage;
    RegisterPage registerPage;
    JsonReader registerdata = new JsonReader("RegisterData.json");
    String firstname = registerdata.readDataFromJson("firstname");
    String lastname = registerdata.readDataFromJson("lastname");
    String email = registerdata.readDataFromJson("email");
    String telephone = registerdata.readDataFromJson("telephone");
    String password = registerdata.readDataFromJson("password");
//    String passwordConfirm = registerdata.readDataFromJson("PasswordConfirm");

    @Test
    public void Test()
    {
        homePage =new HomePage(driver);
        registerPage = new RegisterPage(driver);



        homePage.navigateToHomePage();
        homePage.validateThatHomePageLogoIsDisPlayed();
        homePage.clickMyAccountBtn();
        homePage.clickRegistarBtn();
        registerPage.validateThatAccountLabelIsDisPlayed();
        registerPage.fillData(firstname,lastname,email,telephone,password,password);
        registerPage.clickSubscribBtn();
        registerPage.clickAgreeBtn();
        registerPage.clickCountinueBtn();
        registerPage.validateThatCongratulationsLabelisDisPlayed();
        registerPage.clickCountinueBtn2();





    }
}
