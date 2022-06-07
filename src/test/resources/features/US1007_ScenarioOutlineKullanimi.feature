#amazon sayfasına gidip sirasiyla nutella, java, elma, armut aratip
#sonuclarin arama yaptigimiz kelimeyi icerdigini test et

Feature: US1007 kullanici amazonda istedigi kelimeleri aratir

  @tc12
  Scenario Outline: TC12 amazonda listedeki elementleri aratma
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonucun "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | java          | java                 |
      | elma          | elma                 |
      | armut         | armut                |

  #satir 10'u istenenKelime yaparsak sagdaki kisima gerek yok
  # ama bu şekilde baska bir listeye atmisiz ve o iki listeyi kontrol etmisiz gibi oldu
  # bu sekilde de kullanilebilir