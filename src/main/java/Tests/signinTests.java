package Tests;

import baseTest.AppFactory;
import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.signinPage;
import utilities.excelReader;

import java.net.MalformedURLException;

public class signinTests {

    excelReader excReader;
    signinPage signin;
    AppFactory factory;

    @BeforeTest
    public void setup() throws MalformedURLException {

        excReader = new excelReader();
        excReader.readExcelFile();
        factory = new AppFactory();
        factory.initializer();
        signin = new signinPage();
    }

    @Test
    @Epic("Booking.com")
    @Feature("Account Creation")
    @Description("From this Test Case User should be able to create a New Account")
    @Story("When user should create a New Account for login into the application")
    @Severity(SeverityLevel.CRITICAL)
    public void signinAccount() {

        signin.cancelSignIn();
        signin.clickOnSignIn();
        signin.scroll("Settings");
        signin.clickOnCustomerService();
        signin.clickOnAirportTaxi();
        signin.clickOnManageBooking();
        signin.clickOnCancelBooking();
        signin.clickOnThumbsUp();
    }

    @AfterTest
    public void quitDriver(){
        factory.quitDriver();
    }
}
