import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MiddleCart extends Page {
    public By confirmButton=new By.ByXPath("//a[@id='hlb-view-cart-announce']");

    MiddleCart(WebDriver driver){
        super(driver);
    }

    public void confirmButtonClick(){
        driver.findElement(confirmButton).click();
    }
}
