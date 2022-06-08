package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HeroPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappStepDefinitions {

    HeroPage hero = new HeroPage();


    @Then("kullanici addElement butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
        hero.addElementButonu.click();
    }

    @Then("kullanici delete butonunu gorunceye kadar bekler")
    public void kullanici_delete_butonunu_gorunceye_kadar_bekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(hero.deleteButonu));
    }

    @Then("delete butonunun gorundugunu test et")
    public void delete_butonunun_gorundugunu_test_et() {
        Assert.assertTrue(hero.deleteButonu.isDisplayed());
    }

    @Then("kullanici delete butonuna basarak butonu siler")
    public void kullanici_delete_butonuna_basarak_butonu_siler() {
        hero.deleteButonu.click();
    }

    @Then("delete butonunun gorunmedigini test et")
    public void delete_butonunun_gorunmedigini_test_et() {
        Assert.assertTrue(hero.deleteElementsList.isEmpty());
    }


}
