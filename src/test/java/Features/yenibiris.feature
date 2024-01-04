Feature: Yenibiris senaryo ornekleri
  @UyeOl
  Scenario:Yeni uyelik islemleri
    Given Kullanici anasayfadadir
    Given Anasayfadaki Uye ol linkine tiklar
    When Ad-soyad-eposta-sifre bilgisini girer
    When Hizmet sozlesmesini onaylar
    Then Uye ol linkine tiklar

    @Arama
    Scenario: Ilan arama
      Given Kullanici anasayfadadir
      Given Arama alanina Yazilim yazar
      Given Sehir alanindan Ankara secer
      When Arama butonuna tiklar
      When Bugun yayina giren ilanlari seçer
      When Firma sektoru Bilisim Internet secer
      Then Simdi ara butonuna tiklar
      Then Bugun yayina girenler filtresi kaldirilir

