package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {
    //Driver
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators

    By email_TxtBox = By.id("input-email");
    By password_TxtBox = By.id("input-password");
    By login_Btn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");


    //Actions

    public LoginPage enterEmail(String email)
    {
        driver.findElement(email_TxtBox).sendKeys(email);
        return new LoginPage(driver);
    }

    public LoginPage enterPassword(String password)
    {
        driver.findElement(password_TxtBox).sendKeys(password);
        return new LoginPage(driver);
    }
    public HomePage clickLoginBtn()
    {
        driver.findElement(login_Btn).click();
        return new HomePage(driver);
    }

}
