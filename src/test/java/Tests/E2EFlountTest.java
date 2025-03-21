package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import Utilities.JsonReader;
import org.testng.annotations.Test;

public class E2EFlountTest extends TestBase {

    HomePage homePage;
    RegisterPage registerPage;

    JsonReader registerData = new JsonReader("RegisterData.json");
    String firstname = registerData.readDataFromJson("firstname");
    String lastname = registerData.readDataFromJson("lastname");
    String email = registerData.readDataFromJson("email");
    String telephone = registerData.readDataFromJson("telephone");
    String password = registerData.readDataFromJson("password");
    JsonReader detailsdelivery = new JsonReader("DetailsDelivery.json");
    String company = detailsdelivery.readDataFromJson("company");
    String address1 = detailsdelivery.readDataFromJson("address1");
    String address2 = detailsdelivery.readDataFromJson("address2");
    String city = detailsdelivery.readDataFromJson("city");
    String postcode = detailsdelivery.readDataFromJson("postcode");
    String countryvalue = detailsdelivery.readDataFromJson("country value");
    String statevalue = detailsdelivery.readDataFromJson("state value");


    @Test
    public void flountTest()
    {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);

        homePage.navigateToHomePage()
                .validateThatHomePageLogoIsDisPlayed()
                .clickMyAccountBtn()
                .clickRegistarBtn()
                .fillData(firstname,lastname,email,telephone,password,password)
                .clickSubscribBtn()
                .clickAgreeBtn()
                .clickCountinueBtn()
                .clickCountinueBtn2()
                .clickDesktopsBtn()
                .clickMacBtn()
                .validateThatMacLabelIsDiplayed()
                .clickAddToCartBtn()
                .validateSucsseLabelIsDiplayed()
                .clickShoppingCartBtn()
                .validateThatShoppingCartLabelIsDisplayed()
                .clickCheckOutBtn()
                .validateThatCheckOutLabelIsDisplayed()
                .fillDetails(firstname,lastname,company,address1,address2,city,postcode,countryvalue,statevalue)
                .clickCountinueBillingDetailsBtn()
                .clickCountinueDeliveryDetailsBtn()
                .clickCountinuedeliveryMethodBtn()
                .clickAgreePaymentMethodBtn()
                .clickCountinuePaymentMethodBtn()
                .clickConfirmOrderBtn()
                .validateThatSucsseOrderIsDisplayed()
                .clickCountinueSucsseBtn()
                .clickMyAccountBtn()
                .clickLOgOutBtn();















    }





}
