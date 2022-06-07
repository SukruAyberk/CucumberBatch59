#hotel my camp sitesinde 3 adet negative test senaryosu olustur
  #1-dogru username yanlis password
  #2-yanlis username dogru password
  #3-yanlis username yanlis password

@smoke @regression @negative
Feature: US1005 yanlis kullanici adi ve sifre ile giris yapamamali

  Background:ortak adimlar
    Given kullanici "HMCUrl" anasayfasinda
    Then login yazisina tiklar

  @hmcnegative1
  Scenario: TC09 negative login test
    And kullanici username "HMCValidUsername" girer
    And kullanici password "HMCWrongPassword" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  @hmcnegative2
  Scenario: TC10 negative login test
    And kullanici username "HMCWrongUsername" girer
    And kullanici password "HMCValidPassword" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  @hmcnegative3
  Scenario:TC11 negative login test
    And kullanici username "HMCWrongUsername" girer
    And kullanici password "HMCWrongPassword" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir