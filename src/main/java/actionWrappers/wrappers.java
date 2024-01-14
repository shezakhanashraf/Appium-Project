package actionWrappers;
import baseTest.AppDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class wrappers {
    public AppiumDriver driver;

    public wrappers() {
        this.driver = (AppiumDriver) AppDriver.getDriver();
    }

    public void waitforElement(WebDriver d, WebElement elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(elem));
    }

    public void waitforElements(WebDriver d, List<WebElement> elem){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfAllElements(elem));
    }

    public WebElement waitForElementEnabled(WebDriver d, WebElement element) {
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(100));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickButton(WebElement buttonLocator) {
        waitForElementEnabled(driver, buttonLocator);
        buttonLocator.click();
    }

    public void sendText(WebElement element, String text) {
        waitForElementEnabled(driver, element);
        element.clear();
        element.sendKeys(text);
    }

    public void sendKeysToFirstElement(List<WebElement> elements, String text, int num) {
        if (!elements.isEmpty()) {
            WebElement element = waitForElementEnabled(driver, elements.get(num));
            if (element != null) {
                element.clear();
                element.sendKeys(text);
            } else {
                // Handle the case where the element is not enabled
                System.out.println("Element is not enabled");
            }
        } else {
            // Handle the case where the list is empty
            System.out.println("Element list is empty");
        }
    }
}
