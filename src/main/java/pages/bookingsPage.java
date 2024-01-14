package pages;

import actionWrappers.wrappers;
import baseTest.AppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class bookingsPage {

    wrappers w = new wrappers();
    public bookingsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Bookings\"]")
    public WebElement bookings_btn;

    @FindBy(id = "com.booking:id/importBooking")
    public WebElement bookingdetails_btn;

    @FindBy(id = "com.booking:id/textManageCarBooking")
    public WebElement carrentals_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.EditText")
    public WebElement email_textField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[4]/android.widget.EditText")
    public WebElement bookingref_textField;

    @FindBy(xpath = "//android.widget.Button[contains (@text, 'Find my booking')]")
    public WebElement findbooking_Btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;

    @FindBy(id = "com.booking:id/action_bar_root")
    public WebElement screen;


    public void clickOnBooking(){
        w.clickButton(bookings_btn);
    }

    public void clickOnBookingDetails(){
        w.clickButton(bookingdetails_btn);
    }

    public void clickOnCarRental(){
        w.clickButton(carrentals_btn);
    }

    public void enterEmailId(String email){
        w.waitforElement(w.driver, email_textField);
        w.clickButton(email_textField);
        w.sendText(email_textField,email);
    }

    public void enterBookingRef(String bookref){
        w.waitforElement(w.driver, bookingref_textField);
        w.clickButton(bookingref_textField);
        w.sendText(bookingref_textField,bookref);
    }

    public void clickOnFindBooking(){
        w.clickButton(findbooking_Btn);
    }

    public void cancelSignIn(){
        w.clickButton(cancelsignin_btn);
    }

    public void clickOnScreen(){
        w.clickButton(screen);
    }
}
