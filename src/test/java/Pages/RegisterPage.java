package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {
    //WebDriver
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By account_Label = By.xpath("//*[@id=\"content\"]/h1");
    By firstName_TxtBox = By.id("input-firstname");
    By lastName_TxtBox = By.id("input-lastname");
    By email_TxtBox = By.id("input-email");
    By telephone_TxtBox = By.id("input-telephone");
    By password_TxtBox = By.id("input-password");
    By confirmPassword_TxtBox = By.id("input-confirm");
    By subscrib_Btn = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
    By agree_Btn = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
    By countinue_Btn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
    By congratulations_label = By.xpath("//*[@id=\"content\"]/p[1]");
    By countinue_Btn2 = By.xpath("//*[@id=\"content\"]/div/div/a");


    //Actions

    public RegisterPage validateThatAccountLabelIsDisPlayed()
    {
        Assert.assertTrue(driver.findElement(account_Label).isDisplayed());
        return new RegisterPage(driver);
    }

    public RegisterPage fillData(String firstname,String lastname , String email , String telephone , String password,String passwordConfirm)
    {
        driver.findElement(firstName_TxtBox).sendKeys(firstname);
        driver.findElement(lastName_TxtBox).sendKeys(lastname);
        driver.findElement(email_TxtBox).sendKeys(email);
        driver.findElement(telephone_TxtBox).sendKeys(telephone);
        driver.findElement(password_TxtBox).sendKeys(password);
        driver.findElement(confirmPassword_TxtBox).sendKeys(passwordConfirm);
        return new RegisterPage(driver);
    }

    public RegisterPage clickSubscribBtn()
    {
        driver.findElement(subscrib_Btn).click();
        return new RegisterPage(driver);
    }

    public RegisterPage clickAgreeBtn()
    {
        driver.findElement(agree_Btn).click();
        return new RegisterPage(driver);
    }

    public RegisterPage clickCountinueBtn()
    {
        driver.findElement(countinue_Btn).click();
        return new RegisterPage(driver);
    }

    public RegisterPage validateThatCongratulationsLabelisDisPlayed()
    {
        Assert.assertTrue(driver.findElement(congratulations_label).isDisplayed());
        return new RegisterPage(driver);
    }

    public HomePage clickCountinueBtn2()
    {
        driver.findElement(countinue_Btn2).click();
        return new HomePage(driver);
    }






}
