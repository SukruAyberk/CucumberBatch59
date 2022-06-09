Feature:US1011 web tablosundaki istenen sutunu yazdir

  @guru @pr2
  Scenario: TC18 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And "Prev Close (Rs)", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir
