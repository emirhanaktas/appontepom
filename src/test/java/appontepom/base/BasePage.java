package appontepom.base;

import appontepom.reports.ExtentTestReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends ExtentTestReports {

    AppiumDriver driver;
    WebDriverWait wait;

    public ExtentTest startTest = extent.createTest("Apponte Test", "Profile Page Test");

    public BasePage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by, String txt){
        findElement(by).sendKeys(txt);
    }

    public void click(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).click();
    }

    public void clear(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).clear();
    }

    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return findElement(by).getText();
    }

    public  void infoLog(String str){
        startTest.log(Status.INFO, str);
    }

    public void passLog(String str){
        startTest.log(Status.PASS, str);
    }

    public void failLog(String str){
        startTest.log(Status.FAIL, str);
    }


}
