Feature: US1010 genel tekrar

  @herokuapp
  Scenario: TC15 herokuapp delete butonu calismali
    Given kullanici "herokuappUrl" anasayfasinda
    Then kullanici addElement butonuna basar
    And kullanici delete butonunu gorunceye kadar bekler
    And delete butonunun gorundugunu test et
    Then kullanici delete butonuna basarak butonu siler
    And delete butonunun gorunmedigini test et
    And sayfayi kapatir