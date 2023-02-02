package appontepom.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentTestReports {

    public static ExtentReports extent = new ExtentReports();


    public static void beforeTest(){

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("profilepage.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

    }

    public static void afterTest(){
        extent.flush();
    }

}
