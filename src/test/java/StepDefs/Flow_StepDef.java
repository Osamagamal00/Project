package StepDefs;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Utilities.JsonReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Flow_StepDef {


    WebDriver driver;
    HomePage homePage;
    RegisterPage registerPage;
    LoginPage loginPage;

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




    @Before
    public void preconditions()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);


    }
    @After
    public void tearDown()
    {
        driver.quit();

    }

    @Given("User Navigate to register page")
    public void userNavigatesToRegisterPage()
    {
        homePage.navigateToHomePage()
                .clickMyAccountBtn()
                .clickRegistarBtn();

    }


    @When("User Fill Data")
    public void userFillData() {
        registerPage.fillData(firstname,lastname,email,telephone,password,password)
                .clickSubscribBtn()
                .clickAgreeBtn()
                .clickCountinueBtn();
    }

    @Then("User register sucssefully")
    public void userRegisterSucssefully() {
        registerPage.validateThatCongratulationsLabelisDisPlayed();
    }

    @Given("User navigate to login page")
    public void userNavigateToLoginPage() {
        homePage.navigateToHomePage()
                .clickMyAccountBtn()
                .clickLoginBtn();
    }

    @When("User enter user name and password")
    public void userEnterUserNameAndPassword() {

        loginPage.enterEmail(email)
                .enterPassword(password)
                .clickLoginBtn();


    }

    @Then("User validate that login sucssefully")
    public void userValidateThatLoginSucssefully() {
        homePage.validatThatAccountlabelIsDisplayed();
    }

    @And("User go to home and buy product")
    public void userGoToHomeAndBuyProduct() {
        homePage.clickDesktopsBtn()
                .clickMacBtn()
                .validateThatMacLabelIsDiplayed()
                .clickAddToCartBtn()
                .validateSucsseLabelIsDiplayed()
                .clickShoppingCartBtn()
                .validateThatShoppingCartLabelIsDisplayed()
                .clickCheckOutBtn()
                .validateThatCheckOutLabelIsDisplayed()
                .fillDetails(firstname,lastname,company,address1,address2,city,postCode,countryvalue,statevalue)
                .clickCountinueBillingDetailsBtn()
                .clickCountinueDeliveryDetailsBtn()
                .clickCountinuedeliveryMethodBtn()
                .clickAgreePaymentMethodBtn()
                .clickCountinuePaymentMethodBtn()
                .clickConfirmOrderBtn();

    }

    @Then("User validate Purchase process succfully and log out")
    public void userValidatePurchaseProcessSuccfully() {
        homePage.validateThatSucsseOrderIsDisplayed()
                .clickMyAccountBtn()
                .clickLOgOutBtn();
    }
}
