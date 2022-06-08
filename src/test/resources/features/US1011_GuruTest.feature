Feature:US1011 web tablosundaki istenen sutunu yazdir

  @guru
  Scenario: TC18 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And "Prev Close (Rs)", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir
