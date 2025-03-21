package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {
        //WebDriver
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

        //locators

    By homePage_Logo = By.xpath("//a[@href=\"https://demo.opencart.com.gr/index.php?route=common/home\"]");
    By myAccount_Btn = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
    By registar_Btn = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
    By login_Btn = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
    By account_Label = By.xpath("//*[@id=\"account-account\"]/ul/li[2]");
    By desktops_Btn = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
    By mac_Btn = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a");
    By mac_Label = By.xpath("//*[@id=\"content\"]/h2");
    By addToCart_Btn = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]");
    By sucsse_Label = By.xpath("//*[@id=\"product-category\"]/div[1]");
    By shoppingCart_Btn = By.xpath("//*[@id=\"product-category\"]/div[1]/a[2]");
    By shoppingCart_Label = By.xpath("//*[@id=\"checkout-cart\"]/ul/li[2]/a");
    By checkOut_Btn = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
    By checkOut_Label = By.xpath("//*[@id=\"checkout-checkout\"]/ul/li[3]/a");
    By firstname_TxtBox = By.id("input-payment-firstname");
    By lastname_TxtBox = By.id("input-payment-lastname");
    By compny_TxtBox = By.id("input-payment-company");
    By address1_TxtBox = By.id("input-payment-address-1");
    By address2_TxtBox = By.id("input-payment-address-2");
    By city_TxtBox = By.id("input-payment-city");
    By postCode_TxtBox = By.id("input-payment-postcode");
    By country_List = By.id("input-payment-country");
    By state_List = By.id("input-payment-zone");
    By countinueBillingDetails_Btn = By.id("button-payment-address");
    By countinueDeliveryDetails_Btn = By.id("button-shipping-address");
    By countinueDeliveryMethod_Btn = By.id("button-shipping-method");
    By agreePaymentMethod_Btn = By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]");
    By countinuePaymentMethod_Btn = By.id("button-payment-method");
    By confirmOrder_Btn = By.id("button-confirm");
    By sucsseOrder_Label = By.xpath("//*[@id=\"common-success\"]/ul/li[4]");
    By countinueSucsse_Btn = By.xpath("//*[@id=\"content\"]/div/div/a");
    By logOut_Btn = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a");







    //Actions

    public HomePage  navigateToHomePage()
    {
        driver.navigate().to("https://demo.opencart.com.gr/");
        return new HomePage(driver);
    }

    public HomePage validateThatHomePageLogoIsDisPlayed()
    {
        Assert.assertTrue(driver.findElement(homePage_Logo).isDisplayed());
        return new HomePage(driver);
    }

    public HomePage clickMyAccountBtn()
    {
        driver.findElement(myAccount_Btn).click();
        return new HomePage(driver);
    }

    public RegisterPage clickRegistarBtn()
    {
        driver.findElement(registar_Btn).click();
        return new RegisterPage(driver);
    }

    public LoginPage clickLoginBtn()
    {
        driver.findElement(login_Btn).click();
        return new LoginPage(driver);
    }

    public HomePage validatThatAccountlabelIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(account_Label).isDisplayed());
        return new HomePage(driver);
    }

    public HomePage clickDesktopsBtn()
    {
        driver.findElement(desktops_Btn).click();
        return new HomePage(driver);
    }

    public HomePage clickMacBtn()
    {
        driver.findElement(mac_Btn).click();
        return new HomePage(driver);
    }

    public HomePage validateThatMacLabelIsDiplayed()
    {
        Assert.assertTrue(driver.findElement(mac_Label).isDisplayed());
        return new HomePage(driver);
    }

    public HomePage clickAddToCartBtn()
    {
        driver.findElement(addToCart_Btn).click();
        return new HomePage(driver);
    }

    public HomePage validateSucsseLabelIsDiplayed()
    {
        Assert.assertTrue(driver.findElement(sucsse_Label).isDisplayed());
        return new HomePage(driver);
    }

    public HomePage clickShoppingCartBtn()
    {
        driver.findElement(shoppingCart_Btn).click();
        return new HomePage(driver);
    }

    public HomePage validateThatShoppingCartLabelIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(shoppingCart_Label).isDisplayed());
        return new HomePage(driver);
    }

    public HomePage clickCheckOutBtn()
    {
        driver.findElement(checkOut_Btn).click();
        return new HomePage(driver);
    }

    public HomePage validateThatCheckOutLabelIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(checkOut_Label).isDisplayed());
        return new HomePage(driver);
    }

    public HomePage fillDetails(String firstname , String lastname , String compny , String address1 , String address2 , String city , String postcode,String value , String statevalue)
    {
        driver.findElement(firstname_TxtBox).sendKeys(firstname);
        driver.findElement(lastname_TxtBox).sendKeys(lastname);
        driver.findElement(compny_TxtBox).sendKeys(compny);
        driver.findElement(address1_TxtBox).sendKeys(address1);
        driver.findElement(address2_TxtBox).sendKeys(address2);
        driver.findElement(city_TxtBox).sendKeys(city);
        driver.findElement(postCode_TxtBox).sendKeys(postcode);
        Select select = new Select(driver.findElement(country_List));
        select.selectByValue(value);
        select = new Select(driver.findElement(state_List));
        select.selectByValue(statevalue);
        return new HomePage(driver);
    }


    public HomePage clickCountinueBillingDetailsBtn()
    {
        driver.findElement(countinueBillingDetails_Btn).click();
        return new HomePage(driver);
    }

    public HomePage clickCountinueDeliveryDetailsBtn()
    {
        driver.findElement(countinueDeliveryDetails_Btn).click();
        return new HomePage(driver);
    }

    public HomePage clickCountinuedeliveryMethodBtn()
    {
        driver.findElement(countinueDeliveryMethod_Btn).click();
        return new HomePage(driver);
    }

    public HomePage clickAgreePaymentMethodBtn()

    {
        driver.findElement(agreePaymentMethod_Btn).click();
        return new HomePage(driver);
    }

    public HomePage clickCountinuePaymentMethodBtn()
    {
        driver.findElement(countinuePaymentMethod_Btn).click();
        return new HomePage(driver);
    }

    public HomePage clickConfirmOrderBtn()
    {
        driver.findElement(confirmOrder_Btn).click();
        return new HomePage(driver);
    }

    public HomePage validateThatSucsseOrderIsDisplayed()
    {
        Assert.assertTrue(driver.findElement(sucsseOrder_Label).isDisplayed());
        return new HomePage(driver);
    }

    public HomePage clickCountinueSucsseBtn()
    {
        driver.findElement(countinueSucsse_Btn).click();
        return new HomePage(driver);
    }
    public HomePage clickLOgOutBtn()
    {
        driver.findElement(logOut_Btn).click();
        return new HomePage(driver);
    }












}
