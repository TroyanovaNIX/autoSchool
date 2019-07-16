import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.*;
public class AddProductToCartTest extends BaseTest {
    private WebDriver driver=getDriver();

    @Parameters({"puzzle","robe","sock"})
    @Test
    public void MyTest(String p1,String p2,String p3)
    {
        checkSelectedProductFromCategory(p1);
        checkSelectedProductFromCategory(p2);
        checkSelectedProductFromCategory(p3);
    }


    public void checkSelectedProductFromCategory(String p1){

        MainPageAmazon mainPageAmazon=new MainPageAmazon(driver);
        mainPageAmazon.openPage("https://www.amazon.com/");
        mainPageAmazon.selectCategory();
        mainPageAmazon.searchProducts(p1);
        mainPageAmazon.goButtonClick();
        ProductsPage productsPage=new ProductsPage(driver);
        Assert.assertEquals(driver.getTitle().contains(p1),true);
        productsPage.selectFirstItem();
        ProductPage productPage=new ProductPage(driver);
        String productTitle=productPage.getTitle();
        String productPrice=productPage.getPrice();
        productPage.addToCartButtonClick();
        MiddleCart middleCart=new MiddleCart(driver);
        middleCart.confirmButtonClick();
        CartPage cartPage=new CartPage(driver);
        Assert.assertEquals(cartPage.getCartProductTitle(),productTitle);
        Assert.assertEquals(cartPage.getCartProductPrice(),productPrice,"prices are not equal");
        cartPage.deleteLinkClick();


    }
    @AfterTest
    public void tearDown(){
        quiteDriver(driver);
    }
}
