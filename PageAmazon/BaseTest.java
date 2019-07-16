import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract  class BaseTest {

    public static WebDriver getDriver() {
        System.out.println(System.getProperty("user.dir"));
       // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        return driver;
    }

    public static void quiteDriver(WebDriver driver)
    {
        driver.quit();
    }

}

