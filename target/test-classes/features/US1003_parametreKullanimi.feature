Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre @sirali @pr1
  Scenario: TC06_ kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonucun "Java" icerdigini test eder
    Then sayfayi kapatir