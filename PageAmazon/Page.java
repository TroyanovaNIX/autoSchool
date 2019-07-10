import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class Page {
    WebDriver driver;
    protected Page(WebDriver driver){
        this.driver=driver;
    }
    public boolean isElementPresent(By element){
        try {
            driver.findElement(element);
            return true;
        }
        catch (NoSuchElementException e){
            return false;
        }

    }
}

