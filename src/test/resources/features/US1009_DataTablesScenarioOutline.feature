Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And soyisim bolumune "<lastname>" yazar
    And position bolumune "<position>" yazar
    And office bolumune "<office>" yazar
    And extension bolumune "<extension>" yazar
    And startDate bolumune "<startDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunda "<firstname>" oldugunu test eder
    And sayfayi kapatir

    Examples:
      | firstname | lastname | position | office  | extension | startDate  | salary |
      | Ayberk    | Gurfidan | QA       | Isparta | UI        | 2021-10-11 | 10000  |
      | Gamzenur  | Guclu    | Dev      | Mugla   | UI        | 2021-10-11 | 11000  |
      | Eren      | Pekbas   | QA       | Denizli | UI        | 2021-10-11 | 12000  |
      | Halil     | Sarac    | QA       | Antalya | UI        | 2021-10-11 | 13000  |
      | Selcuk    | Mizrakli | QA       | Alanya  | UI        | 2021-10-11 | 10500  |

