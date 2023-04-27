package pages;

import org.openqa.selenium.By;

public class Locators {

    public static final By searchBox = By.xpath("//input[@name='search']");
    public static final By searchButton = By.cssSelector("#search button");
    public static final By productsName = By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//div[@class='caption']//a");
    public static final By username = By.xpath("//input[@name='username']");
    public static final By password = By.xpath("//input[@name='password']");
    public static final By loginButton = By.xpath("//button[@type='submit']");
    public static final By admin = By.xpath("//span[text()='Admin']");
    public static final By adminUsernameBox = By.cssSelector(".oxd-form-row input");



}
