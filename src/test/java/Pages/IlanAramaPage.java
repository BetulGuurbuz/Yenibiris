package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import util.ElementHelper;

import java.time.Duration;

public class IlanAramaPage {
    static WebDriver driver;
    util.ElementHelper elementHelper;
    By aramaYazilim = By.cssSelector("[name='q']");
    By araButton = By.cssSelector("button[id='btnSearchSuggestedAdvertisement'] i[class='ybfont-search']");
    By ilanTarihi = By.xpath("//h4[contains(.,'İlan Tarihi  Seçim')]");
    By bugunYayinaGirenler = By.xpath("//label[.='Bugün yayına girenler']");
    By firmaSektoru = By.xpath("//h4[contains(.,'Firma Sektörü  Seçim')]");
    By firmaSektoruBilisim = By.xpath("//label[.='Bilişim - İnternet(9)']");
    By simdiAra = By.cssSelector("[value='ŞİMDİ ARA']");
    By kaldirBugunYayinaGirenler = By.cssSelector("[data-id='Parameter.RecencyOption'] > .ybfont-close");

    public IlanAramaPage(WebDriver driver) {
        IlanAramaPage.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void aramaYazilim() {
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(100));
        driver.findElement(aramaYazilim).sendKeys("Yazılım");
    }

    public void sehirSec() {
        Select select = new Select(driver.findElement(By.cssSelector("#ddlSuggestedCity")));
        select.selectByVisibleText("Ankara");
    }

    public void araButton() {
        driver.findElement(araButton).click();
    }

    public void bugunYayinaGirenler() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,650)", " ");
        driver.findElement(ilanTarihi).click();
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(100));
        driver.findElement(bugunYayinaGirenler).click();
    }

    public void firmaSektoru() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,-200)", " ");
        driver.findElement(firmaSektoru).click();
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(100));
        driver.findElement(firmaSektoruBilisim).click();
    }

    public void simdiAra() {
        driver.findElement(simdiAra).click();
    }

    public void kaldirBugunYayinaGirenler() {
        driver.findElement(kaldirBugunYayinaGirenler).click();
    }
}
