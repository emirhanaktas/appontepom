package appontepom.page;

import appontepom.base.BasePage;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;

import static appontepom.constants.Constants.*;

public class ProfilePage extends BasePage {

    AppiumDriver driver;


    public ProfilePage(AppiumDriver driver){
        super(driver);
    }

    //1.case methodu
    public ProfilePage profileClick() throws InterruptedException {
        Thread.sleep(1000);
        click(PROFILE_TAB);
        Thread.sleep(1000);
        infoLog("Profil tab'e tıklandı!");
        return this;
    }

    //2.case methodu
    public ProfilePage profileSettingClick() throws InterruptedException {
        Thread.sleep(1000);
        click(PROFIL_BUTON);
        Thread.sleep(1000);
        passLog("Profil ayarlarına tıklandı!");
        return this;
    }

    //3.case methodu
    public ProfilePage companyNameEdit() throws InterruptedException {
        clear(COMPANY_NAME);
        Thread.sleep(1000);
        passLog("Şirket ismi silindi!");
        sendKeys(COMPANY_NAME, "Appcent Mobi");
        passLog("Şirket ismi girişi yapıldı!");
        return this;
    }

    //4.case methodu
    public ProfilePage webSiteEdit() throws InterruptedException {
        clear(WEB_SITE);
        Thread.sleep(1000);
        passLog("Web site silindi!");
        sendKeys(WEB_SITE, "www.appcent.mobi");
        passLog("Web site girişi yapıldı!");
        return this;
    }

    //5.case methodu
    public ProfilePage addressEdit() throws InterruptedException {
        clear(ADDRESS);
        Thread.sleep(1000);
        passLog("Adres silindi!");
        sendKeys(ADDRESS, "Kadıköy-Fikirtepe");
        passLog("Adres girişi yapıldı!");
        return this;
    }

    //6.case methodu
    public ProfilePage profileSaveClick(){
        click(PROFILE_SAVE);
        passLog("Kaydet butonuna tıklandı!");
        infoLog("Profil testi tamamlandı!");
        return this;
    }



}
