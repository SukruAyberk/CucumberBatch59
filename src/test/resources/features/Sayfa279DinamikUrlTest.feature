Feature: Sayfa279 Dinamik Url

  Scenario Outline: TC16 dinamik url testi
    Given kullanici "<sayfaUrl>" anasayfasinda
    And urlnin "<sayfaUrl>" oldugunu test eder
    Then sayfayi kapatir
    Examples:
      | sayfaUrl     |
      | amazonUrl    |
      | herokuappUrl |
      | HMCUrl       |
      | youtubeUrl   |
