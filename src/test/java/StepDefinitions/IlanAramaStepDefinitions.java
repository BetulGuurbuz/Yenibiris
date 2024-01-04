package StepDefinitions;

import Pages.IlanAramaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class IlanAramaStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    IlanAramaPage ilanAramaPage = new IlanAramaPage(driver);
    @Given("Arama alanina Yazilim yazar")
    public void aramaAlaninaYazilimYazar() {
        ilanAramaPage.aramaYazilim();
    }

    @Given("Sehir alanindan Ankara secer")
    public void sehirAlanindanAnkaraSecer() {
        ilanAramaPage.sehirSec();
    }

    @When("Arama butonuna tiklar")
    public void aramaButonunaTiklar() {
        ilanAramaPage.araButton();
    }

    @When("Bugun yayina giren ilanlari seçer")
    public void bugunYayinaGirenIlanlariSeçer() {
        ilanAramaPage.bugunYayinaGirenler();
    }

    @When("Firma sektoru Bilisim Internet secer")
    public void firmaSektoruBilisimInternetSecer() {
        ilanAramaPage.firmaSektoru();
    }

    @Then("Simdi ara butonuna tiklar")
    public void simdiAraButonunaTiklar() {
        ilanAramaPage.simdiAra();
    }

    @Then("Bugun yayina girenler filtresi kaldirilir")
    public void bugunYayinaGirenlerFiltresiKaldirilir() {
        ilanAramaPage.kaldirBugunYayinaGirenler();
    }
}
