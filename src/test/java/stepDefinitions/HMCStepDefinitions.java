package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {

    HMCPage hmcPage = new HMCPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmcPage.loginButton1.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmcPage.username.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButton2.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcPage.hotelManagementButton.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.loginButton2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.username.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hmcPage.username.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hmcPage.password.sendKeys(password);
    }
}
