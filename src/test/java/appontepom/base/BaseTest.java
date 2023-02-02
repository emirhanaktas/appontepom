package appontepom.base;

import appontepom.reports.ExtentTestReports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends ExtentTestReports {

    static AppiumDriver appiumDriver = null;

    public static WebDriverWait wait;


    @BeforeClass

    public void setup(){

        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "Pixel 4 API 29");
            cap.setCapability("platformName", "Android");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability("platformVersion", "10.0");
            cap.setCapability("appPackage", "mobi.appcent.apponte");
            cap.setCapability("appActivity", "mobi.appcent.apponte.ui.activity.home.HomeActivity");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("noReset", "true");

            appiumDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(appiumDriver,10);

        }catch (MalformedURLException mx){
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");

        }

    }

    public static AppiumDriver getAppiumDriver(){
        return appiumDriver;
    }

    public static void setAppiumDriver(AppiumDriver appiumDriver){
        BaseTest.appiumDriver = appiumDriver;
    }

    public void tearDown(){
        getAppiumDriver().quit();
    }


}
