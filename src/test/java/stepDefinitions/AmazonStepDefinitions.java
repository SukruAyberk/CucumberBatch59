package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazon = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {

        amazon.searchBox.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String actualResult = amazon.resutlText.getText();
        String expectedWord = "Nutella";
        Assert.assertTrue(actualResult.contains(expectedWord));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazon.searchBox.sendKeys("Java" + Keys.ENTER);
    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String actualResult = amazon.resutlText.getText();
        String expectedWord = "Java";
        Assert.assertTrue(actualResult.contains(expectedWord));
    }

    @Then("kullanici iPhone icin arama yapar")
    public void kullaniciIPhoneIcinAramaYapar() {
        amazon.searchBox.sendKeys("iPhone" + Keys.ENTER);
    }

    @And("sonuclarin iPhone icerdigini test eder")
    public void sonuclarinIPhoneIcerdiginiTestEder() {
        String actualResult = amazon.resutlText.getText();
        String expectedWord = "iPhone";
        Assert.assertTrue(actualResult.contains(expectedWord));
    }
}
