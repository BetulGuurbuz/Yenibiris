package StepDefinitions;

import Pages.UyeOlPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class UyeOlStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    UyeOlPage uyeOlPage = new UyeOlPage(driver);

    @Given("Kullanici anasayfadadir")
    public void kullaniciAnasayfadadir() {
        uyeOlPage.anaSayfa();
    }

    @Given("Anasayfadaki Uye ol linkine tiklar")
    public void anasayfadakiUyeOlLinkineTiklar() {
        uyeOlPage.uyeOl();
    }

    @When("Ad-soyad-eposta-sifre bilgisini girer")
    public void adSoyadEpostaSifreBilgisiniGirer() {
        uyeOlPage.yeniUyelik();
    }

    @When("Hizmet sozlesmesini onaylar")
    public void hizmetSozlesmesiniOnaylar() {
        uyeOlPage.hizmetSozlesme();
    }

    @Then("Uye ol linkine tiklar")
    public void uyeOlLinkineTiklar() {
        uyeOlPage.uyeOlLinkButton();
    }
}
