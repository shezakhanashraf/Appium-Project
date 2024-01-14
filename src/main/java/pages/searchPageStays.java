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

public class searchPageStays {

    wrappers w = new wrappers();
    public searchPageStays(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    //<--Stays Tab-->

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Search\"]")
    public WebElement search_Btn;
    @FindBy(id = "com.booking:id/facet_entry_point_item_label")
    public WebElement stays_tabBtn;
    @FindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    public WebElement acclocation_txtBtn;

    @FindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    public WebElement acclocation_txtField;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public WebElement topacclocation_btn;

    @FindBy(id = "com.booking:id/facet_date_picker_confirm")
    public WebElement datepicker_btn;

    @FindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    public WebElement occupancy_txtBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[2]")
    public WebElement add_members;

    @FindBy(id = "com.booking:id/group_config_apply_button")
    public WebElement apply_btn;

    @FindBy(id = "com.booking:id/facet_search_box_cta")
    public WebElement search_btn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    public WebElement cancelsignin_btn;

    public void clickOnSearch(){
        w.clickButton(search_Btn);
    }
    public void clickOnStays(){
        w.clickButton(stays_tabBtn);
    }
    public void clickOnAccLocation(){
        w.clickButton(acclocation_txtBtn);
    }

    public void enterAccLocation(String location){
        w.clickButton(acclocation_txtField);
    }

    public void clickOnTopLocation(){
        w.clickButton(topacclocation_btn);
    }

    public void selectDatePicker(){
        w.clickButton(datepicker_btn);
    }
    public void clickOnOccupancy(){
        w.clickButton(occupancy_txtBtn);
    }

    public void clickOnMemberAddition(){
        w.clickButton(add_members);
    }

    public void clickOnApply(){
        w.clickButton(apply_btn);
    }

    public void search(){
        w.clickButton(search_btn);
    }

    public void cancelSignIn(){
        w.clickButton(cancelsignin_btn);
    }
}
