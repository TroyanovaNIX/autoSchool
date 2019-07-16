package Module11.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Page {
    public By items = new By.ByCssSelector("span.a-size-base-plus.a-color-base.a-text-normal");
    public By pageTitle = new By.ByXPath("//head//title");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public void selectFirstItem() {
        List<WebElement> listOfItems = driver.findElements(items);
        WebElement firstElement = listOfItems.get(0);
        firstElement.click();
    }

}
