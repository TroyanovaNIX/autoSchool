package Module11.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageAmazon extends Page {
    public By goButton = new By.ByXPath("//input [@type='submit'][ @value='Go']");
    public By allDropdown = new By.ByCssSelector("div.nav-search-scope.nav-sprite");//new By.ByXPath("//div [@class='nav-search-scope nav-sprite']");
    public By allBaby = new By.ByXPath("//select [@id='searchDropdownBox']/option[@value='search-alias=baby-products-intl-ship']");

    public By sell = new By.ByXPath("//a [@class='nav-a'] [@tabindex='52']");
    public By nextPageButton = new By.ByXPath("//a [@class='a-carousel-goto-nextpage']//i [@class='a-icon a-icon-next-rounded']");
    public By someText = new By.ByCssSelector("span.a-color-base");

    public By babyItem = new By.ByXPath("//select [@id='searchDropdownBox']/option [text()='Baby']");
    public By searchTextBox = new By.ByXPath("//div [@class='nav-search-field '] /input[@id='twotabsearchtextbox']");
    public By goButtonOnBabyFilter = new By.ByXPath("//input [@type='submit'][ @value='Go']");


    public MainPageAmazon(WebDriver driver) {
        super(driver);
    }

    public void openPage(String pageURL) {

        driver.get(pageURL);
        driver.manage().window().maximize();
    }

    public boolean isGoButtonPresent() {
        return isElementPresent(goButton);
    }

    public boolean isallDropdownPresent() {
        return isElementPresent(allDropdown);
    }

    public void selectAll() {
        driver.findElement(allDropdown).click();
    }

    public boolean isallBabyPresent() {
        return isElementPresent(allBaby);
    }

    public boolean isnextPageButtonPresent() {
        return isElementPresent(nextPageButton);
    }

    public boolean issellPresent() {
        return isElementPresent(sell);// && driver.findElement(sell).getText().equals("Sell");
    }

    public boolean issomeTextPresent() {
        return isElementPresent(someText);
    }

    public void selectCategory() {
        driver.findElement(babyItem).click();
    }

    public void searchProducts(String subCategory) {
        driver.findElement(searchTextBox).sendKeys(subCategory);
    }

    public void goButtonClick() {
        driver.findElement(goButton).click();
    }

}
