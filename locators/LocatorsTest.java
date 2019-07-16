import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.*;


public class LocatorsTest extends BaseTest {
    private WebDriver driver=getDriver();
    @Test
    public void LocatorsPresent(){
        MainPageAmazon mainPageAmazon=new MainPageAmazon(driver);
        mainPageAmazon.openPage("https://www.amazon.com/");
        Assert.assertTrue(mainPageAmazon.isGoButtonPresent());
        Assert.assertTrue(mainPageAmazon.isallDropdownPresent());
        Assert.assertTrue(mainPageAmazon.isnextPageButtonPresent());
        Assert.assertTrue(mainPageAmazon.issellPresent());
        Assert.assertTrue(mainPageAmazon.issomeTextPresent());
        mainPageAmazon.selectAll();
        Assert.assertTrue(mainPageAmazon.isallBabyPresent());


        quiteDriver(driver);
    }

}
