package Module11.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends Page {
    public By title = new By.ByCssSelector("span#productTitle");
    public By price = new By.ByXPath("//div [contains(@class,'a-section a-spacing-none a-padding-none')]//span[contains(@class,'a-color-price')]");
    public By addToCartButton = new By.ByXPath("//input[contains(@id,'add-to-cart-button')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public String getPrice() {
        String currentPrice = driver.findElement(price).getText();
        String realPrice = currentPrice.substring(1);
        return realPrice;

    }

    public void addToCartButtonClick() {
        driver.findElement(addToCartButton).click();
    }

}
