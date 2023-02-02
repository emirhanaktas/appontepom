package appontepom.test;

import appontepom.base.BaseTest;
import appontepom.page.ProfilePage;
import appontepom.reports.ExtentTestReports;
import org.testng.annotations.*;

public class ProfilePageTest extends BaseTest {

    ProfilePage profilePage;

    @BeforeSuite
    public void setupSuite(){
        ExtentTestReports.beforeTest();
    }

    @AfterSuite
    public void afterSuite(){
        ExtentTestReports.afterTest();
    }


    @BeforeClass
    public void before(){
        profilePage = new ProfilePage(getAppiumDriver());
    }

    @Test
    public void test() throws InterruptedException {

        Thread.sleep(1000);

        profilePage
                .profileClick() //1.case
                .profileSettingClick() //2.case
                .companyNameEdit() //3.case
                .webSiteEdit() //4. case
                .addressEdit() //5.case
                .profileSaveClick(); //6.case
    }

    @AfterClass
    public void after(){
        tearDown();
    }


}
