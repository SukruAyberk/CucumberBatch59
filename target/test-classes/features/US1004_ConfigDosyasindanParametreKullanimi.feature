Feature: US1004 Kullanici parametre ile configuration file'i kullabilmeli

  @config @sirali @pr1
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "youtubeUrl" anasayfasinda
    Then kullanici 2 sn bekler
    And url'in "youtube" icerdigini test eder
    Then sayfayi kapatir