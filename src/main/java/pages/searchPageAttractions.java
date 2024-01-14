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

public class searchPageAttractions {

    wrappers w = new wrappers();
    AppDriver app = new AppDriver();
    public searchPageAttractions(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    //<--Attractions Tab-->
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[4]")
    public WebElement attractions_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")
    public WebElement going_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText")
    public WebElement going_txtField;

    @FindBy(xpath = "//*[contains (@text, 'New York, New York State United States')]")
    public WebElement usa_btn;

    @FindBy(xpath = "//*[contains (@text, 'Select your dates')]")
    public WebElement date_textBtn;

    @FindBy(xpath = "//*[contains (@text, '28 April 2023')]")
    public WebElement date_select;

    @FindBy(xpath = "//*[contains (@text, 'Apply')]")
    public WebElement applyatt_Btn;

    @FindBy(xpath = "//*[contains (@text, 'Search')]")
    public WebElement searchatt_Btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;

    public void scroll(String str){
        app.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).index(0)).scrollIntoView" + "(new UiSelector().text" + "(\""+str+"\"))"));}

    public void clickOnAttractionsTab(){
        w.clickButton(attractions_btn);
    }

    public void searchForDestination(){
        w.clickButton(going_btn);
    }

    public void enterDestination(String destination){
        w.sendText(going_txtField,destination);
    }

    public void selectUSA(){
        w.clickButton(usa_btn);
    }

    public void clickOnDatePicker(){
        w.clickButton(date_textBtn);
    }

    public void pickDate(){
        w.clickButton(date_select);
    }

    public void clickOnApply(){
        w.clickButton(applyatt_Btn);
    }

    public void clickOnSearch(){
        w.clickButton(searchatt_Btn);
    }

    public void cancelSignIn(){
        w.clickButton(cancelsignin_btn);
    }
}
