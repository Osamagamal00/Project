package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase  {

    public WebDriver driver ;


    @BeforeMethod
    public void preconditions()
    {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

//    @AfterMethod
//    public void tearDown()
//    {
//        driver.quit();
//    }
}
