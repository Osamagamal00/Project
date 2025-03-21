package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import Utilities.JsonReader;
import org.testng.annotations.Test;

public class E2ETest extends TestBase {

    HomePage homePage;
    RegisterPage registerPage;
    JsonReader registerDAta = new JsonReader("RegisterData.json");
    String firstname = registerDAta.readDataFromJson("firstname");
    String lastname = registerDAta.readDataFromJson("lastname");
    String email = registerDAta.readDataFromJson("email");
    String telephone = registerDAta.readDataFromJson("telephone");
    String password = registerDAta.readDataFromJson("password");
    JsonReader detailsDelivery = new JsonReader("DetailsDelivery.json");
    String company = detailsDelivery.readDataFromJson("company");
    String address1 = detailsDelivery.readDataFromJson("address1");
    String address2 = detailsDelivery.readDataFromJson("address2");
    String city = detailsDelivery.readDataFromJson("city");
    String postCode = detailsDelivery.readDataFromJson("postcode");
    String countryvalue = detailsDelivery.readDataFromJson("country value");
    String statevalue = detailsDelivery.readDataFromJson("state value");

    @Test
    public void Test()
    {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);



        homePage.navigateToHomePage();
        homePage.validateThatHomePageLogoIsDisPlayed();
        homePage.clickMyAccountBtn();
        homePage.clickRegistarBtn();
        registerPage.fillData(firstname,lastname,email,telephone,password,password);
        registerPage.clickSubscribBtn();
        registerPage.clickAgreeBtn();
        registerPage.clickCountinueBtn();
        registerPage.clickCountinueBtn2();
        homePage.clickDesktopsBtn();
        homePage.clickMacBtn();
        homePage.validateThatMacLabelIsDiplayed();
        homePage.clickAddToCartBtn();
        homePage.validateSucsseLabelIsDiplayed();
        homePage.clickShoppingCartBtn();
        homePage.validateThatShoppingCartLabelIsDisplayed();
        homePage.clickCheckOutBtn();
        homePage.validateThatCheckOutLabelIsDisplayed();
        homePage.fillDetails(firstname,lastname,company,address1,address2,city,postCode,countryvalue,statevalue);
        homePage.clickCountinueBillingDetailsBtn();
        homePage.clickCountinueDeliveryDetailsBtn();
        homePage.clickCountinuedeliveryMethodBtn();
        homePage.clickAgreePaymentMethodBtn();
        homePage.clickCountinuePaymentMethodBtn();
        homePage.clickConfirmOrderBtn();
        homePage.validateThatSucsseOrderIsDisplayed();
        homePage.clickCountinueSucsseBtn();
        homePage.clickMyAccountBtn();
        homePage.clickLOgOutBtn();


    }


}
