package actionWrappers;


import baseTest.AppDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class wrappers {
    public AppiumDriver driver;

    public wrappers() {
        this.driver = (AppiumDriver) AppDriver.getDriver();
    }

    public void waitForElementEnabled(WebDriver d, WebElement element) {
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickButton(WebElement buttonLocator){
        waitForElementEnabled(driver, buttonLocator);
        buttonLocator.click();
    }

}