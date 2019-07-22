package Module11.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductPage extends Page {
    public By title = new By.ByCssSelector("span#productTitle");
    public By price = new By.ByXPath("//div [contains(@class,'a-section a-spacing-none a-padding-none')]//span[contains(@class,'a-color-price')]");
    public By addToCartButton = new By.ByXPath("//input[contains(@id,'add-to-cart-button')]");
    public By dropdown = new By.ByCssSelector("#native_dropdown_selected_size_name.a-native-dropdown");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public String getPrice() {
        if (isElementPresent(dropdown)) {
            Select select = new Select(driver.findElement(dropdown));
            List<WebElement> selectList = select.getOptions();
            for (int i = 1; i < selectList.size(); i++) {
                if (selectList.get(i).isEnabled()) {
                    select.selectByIndex(i);
                    break;
                }
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement productPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(price));
        String currentPrice = driver.findElement(price).getText();
        String realPrice = currentPrice.substring(1);
        return realPrice;

    }

    public void addToCartButtonClick() {
        driver.findElement(addToCartButton).click();
    }

}

