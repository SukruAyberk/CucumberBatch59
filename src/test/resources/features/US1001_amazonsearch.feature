@tumu
Feature: Amazon Search

  @nutella, @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java, @ikisi
  Scenario: TC02 kullanici amazonda Java aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  @iphone
  Scenario: TC02 kullanici amazonda iPhone aratir
    Given kullanici amazon anasayfasinda
    Then kullanici iPhone icin arama yapar
    And sonuclarin iPhone icerdigini test eder
    And sayfayi kapatir