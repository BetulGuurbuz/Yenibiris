package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.time.Duration;

public class UyeOlPage {
    static WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;
    By uyeOl = By.xpath("//ul[@id='navbar-collapse-top-menu']//a[.='ÜYE OL']");
    By uyelikAd = By.cssSelector("#FirstName");
    By uyelikSoyad = By.cssSelector("#LastName");
    By uyelikEposta = By.cssSelector("#Email");
    By uyelikSifre = By.cssSelector("#Password");
    By hizmetSozlesmesi = By.xpath("//label[@for='chk_registerContract']");
    By uyeOlButton = By.cssSelector("#btnRegister");

    public UyeOlPage(WebDriver driver) {
        UyeOlPage.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }

    public void anaSayfa() {
        driver.get("https://www.yenibiris.com/");
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(100));
    }

    public void uyeOl() {
        driver.findElement(uyeOl).click();
    }

    public void yeniUyelik() {
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,100)", " ");
        driver.findElement(uyelikAd).sendKeys("Adiniz");
        driver.findElement(uyelikSoyad).sendKeys("Soyadiniz");
        driver.findElement(uyelikEposta).sendKeys("mailadresiniz@gmail.com");
        driver.findElement(uyelikSifre).sendKeys("Sifreniz");
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(100));
    }

    public void hizmetSozlesme() {
        driver.findElement(hizmetSozlesmesi).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='chk_registerContract'] > span")));
    }

    public void uyeOlLinkButton() {
        driver.findElement(uyeOlButton).click();
    }
}
