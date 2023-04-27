package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import utils.Base.BaseTest;

import java.util.List;

import static pages.Locators.*;

public class MyStepdefs extends BaseTest {

    String windowHandle;

    @Given("{string} adresine  git")
    public void adresineGit(String url) {
        driver.get(url);
        windowHandle = driver.getWindowHandle();
    }

    @And("{string} arat")
    public void arat(String text) {
        sendKeys(searchBox, text);
        click(searchButton);
    }

    @Then("bulunan ürünlerden sonuncusunun ismini System.setProperty icine kaydedin")
    public void bulunanÜrünlerdenSonuncusununIsminiSystemSetPropertyIcineKaydedin() {
        List<WebElement> products = driver.findElements(productsName);
        String name = products.get(products.size() - 1).getText();
        System.setProperty("urunAdi", name);
    }

    @And("yeni TAB'da {string}  adresine gidin")
    public void yeniTABDaAdresineGidin(String url) {
        driver.switchTo().newWindow(WindowType.TAB).get(url);
    }

    @Then("login olun")
    public void loginOlun() {
        sendKeys(username, "Admin");
        sendKeys(password, "admin123");
        click(loginButton);
    }

    @And("admin'e tikla")
    public void adminETikla() {
        click(admin);
    }

    @And("username inputuna kaydettiginiz ürün ismini yazin")
    public void usernameInputunaKaydettiginizUrunIsminiYazin() {
        sendKeys(adminUsernameBox, System.getProperty("urunAdi"));
        Assert.assertEquals(System.getProperty("urunAdi"), driver.findElement(adminUsernameBox).getAttribute("value"));
    }

    @And("ekran kaydi alin")
    public void ekranKaydiAlin() {
        getScreenshot("deneme");
    }

    @Then("Diger taba gecin")
    public void digerTabaGecin() {
        driver.switchTo().window(windowHandle);
    }
}
