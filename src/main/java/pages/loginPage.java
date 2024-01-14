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
import java.util.List;

public class loginPage {

    wrappers w = new wrappers();
    public loginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(id = "com.booking:id/identity_account_start")
    public WebElement sign_withEmail;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement userName_txtField;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement continue_btn;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public List<WebElement> password_txtField;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Show password']")
    public List<WebElement> imageEyeIcon;
    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement tittle_header;

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement createAccount_btn;

    @FindBy(id = "com.booking:id/genius_onbaording_bottomsheet_cta")
    public WebElement onboarding_btn;

    @FindBy(id = "com.booking:id/action_primary")
    public WebElement signintosave_btn;

    public void clickOnCreateAccount(){
        w.clickButton(sign_withEmail);
    }

    public void enterEmail(String email){
        w.sendText(userName_txtField,email);
    }

    public void enterPassword(String pass){
        w.waitforElements(w.driver, imageEyeIcon);
        w.waitforElements(w.driver, password_txtField);
        w.sendKeysToFirstElement(password_txtField,pass,0);
    }

    public void enterConfirmPassword(String pass){
        w.sendKeysToFirstElement(password_txtField,pass,1);
    }

    public void clickContinueBtn (){
       w.clickButton(continue_btn);
    }

    public void createAccountBtn(){
        w.clickButton(createAccount_btn);
    }

    public void onbaordingBtn(){
        w.clickButton(onboarding_btn);
    }

    public void clickOnSignintosave(){
        w.clickButton(signintosave_btn);
    }

}
