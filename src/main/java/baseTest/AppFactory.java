package baseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.configReader;

import java.net.MalformedURLException;
import java.net.URL;
public class AppFactory {

    public static AppiumDriver driver;

    public static configReader confgReader;

    String currentUsersHomeDir = System.getProperty("user.dir");

    public void initializer() throws MalformedURLException {

        DesiredCapabilities cap= new DesiredCapabilities();

        confgReader = new configReader();

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, confgReader.getAutomationName());
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, confgReader.getPlatformName());
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, confgReader.getPlatformVersion());
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, confgReader.getDeviceName());
        cap.setCapability(MobileCapabilityType.APP, currentUsersHomeDir + confgReader.getApkPath());
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,confgReader.getAppActivity());
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,confgReader.getAppPackage());
        cap.setCapability("autoGrantPermissions",true);
        //cap.setCapability("appWaitActivity","com.booking.startup.HomeActivity");
        //cap.setCapability("appWaitPackage","com.booking");
        cap.setCapability("appWaitDuration","15000");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15000);
        cap.setCapability(MobileCapabilityType.FULL_RESET, true);
        cap.setCapability(MobileCapabilityType.NO_RESET, false);
        //cap.setCapability("–session-override",true);

        System.out.println(confgReader.getAutomationName());

        URL url= new URL(confgReader.getAppiumServerURL());

        System.out.println(url +"Ashir");

        driver= new AppiumDriver(url,cap);

        AppDriver.setDriver(driver);
    }

    public void quitDriver(){
       if (driver != null ){
            driver.quit();
        }
    }
}
