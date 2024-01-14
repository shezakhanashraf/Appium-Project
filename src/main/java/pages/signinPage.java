package pages;

import actionWrappers.wrappers;
import baseTest.AppDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class signinPage {

    wrappers w = new wrappers();
    AppDriver app = new AppDriver();
    public signinPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Sign in\"]")
    public WebElement signin_btn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Contact Customer Service\"]")
    public WebElement customerservice_btn;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Airport taxis\"]/android.widget.RelativeLayout")
    public WebElement airporttaxi_btn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Manage booking\"]")
    public WebElement managebooking_btn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Can I cancel my booking?\"]")
    public WebElement cancelbooking_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.Button[1]")
    public WebElement thumbsup_btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;

    public void scroll(String str){ app.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).index(0)).scrollIntoView" + "(new UiSelector().text" + "(\""+str+"\"))"));}

    public void clickOnSignIn(){
        w.clickButton(signin_btn);
    }

    public void clickOnCustomerService(){
        w.clickButton(customerservice_btn);
    }

    public void clickOnAirportTaxi(){
        w.clickButton(airporttaxi_btn);
    }

    public void clickOnManageBooking(){
        w.clickButton(managebooking_btn);
    }

    public void clickOnCancelBooking(){
        w.clickButton(cancelbooking_btn);
    }

    public void clickOnThumbsUp(){
        w.clickButton(thumbsup_btn);
    }

    public void cancelSignIn(){
        w.clickButton(cancelsignin_btn);
    }
}

