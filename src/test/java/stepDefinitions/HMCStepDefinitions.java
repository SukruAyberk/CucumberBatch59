package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {

    HMCPage hmc = new HMCPage();

    @Then("login yazisina tiklar")
    public void login_yazisina_tiklar() {
        hmc.loginButton1.click();
    }


    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmc.username.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmc.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmc.loginButton2.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmc.hotelManagementButton.isDisplayed());
    }


    @And("kullanici username {string} girer")
    public void kullaniciUsernameGirer(String username) {
        hmc.username.sendKeys(ConfigReader.getProperty(username));
    }

    @And("kullanici password {string} girer")
    public void kullaniciPasswordGirer(String password) {
        hmc.password.sendKeys(ConfigReader.getProperty(password));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmc.tryAgainText.isDisplayed());
    }
}
