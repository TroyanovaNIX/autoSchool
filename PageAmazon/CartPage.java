import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Page {
    private By cartProductTitle=new By.ByXPath(" //span[@class='a-size-medium sc-product-title a-text-bold']");

    private By cartProductPrice=new By.ByXPath(" //span[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-price-sign']");

    private By deleteLink=new By.ByXPath("//input[@value='Delete']");

    CartPage(WebDriver driver) {
        super(driver);
    }
    public String getCartProductTitle(){
        return driver.findElement(cartProductTitle).getText();
    }
    public String getCartProductPrice(){
        String realPrice=driver.findElement(cartProductPrice).getText().replace("USD ","");
        return realPrice;
    }

    public void deleteLinkClick(){
        driver.findElement(deleteLink).click();
    }
}
