package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guru = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {
        // gurupage'deki listeyi kullanabilmek manipüle edebilmek için yeni bir listeye atadık
        List<WebElement> tabloBaslikListesi = guru.baslikListesi;
        // listemiz WebElementlerden olusuyor
        // dolayisiyla bu WebElementlerden hangisi istenen sutun basligini tasiyor bilemeyiz

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndexi = i + 1;
                break;
            }
        }

        // for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilastirdim
        // loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve bulundu ise yoluma
        // devam etmek istiyorum

        if (istenenBaslikIndexi != -3) { // bu sarti saglarsa baslik bulundu

            // burada tbody altındaki tüm satırlarda istenen başlık indexine eşit olan cell'i yazdırdık
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler) {
                System.out.println(each.getText());
            }
        } else { // bu sarti saglarsa baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }
    }


}
