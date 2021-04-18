import MngDriver;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FunctionalityTest extends MngDriver{

    @Test
    public void SignInTest(){

        driver.get("https://www.gittigidiyor.com");
        pageobjects.PageElements loginPage = new pageobjects.PageElements();
        assertTrue(loginPage.isInitialized());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginPage.fillEmail("testiniumdemo@gmail.com");
        loginPage.fillPassword("demoPassword.21");

        try {
          loginPage.loginVerify.getText();
        } catch (Exception e) {
            System.out.println("The page did not load in time" + e);
        }

    }


    @Test
    public void SearchTest(){

        pageobjects.PageElements productSearch = new pageobjects.PageElements();
        assertTrue(productSearch.isInitialized());

        productSearch.SearchKeyword("bilgisayar");

    }


    @Test
    public void TestSecondPage(){

        pageobjects.PageElements pageTest = new pageobjects.PageElements();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try{
            pageTest.selectedPage.getText().equals("2");
        } catch (Exception e){
            System.out.println("The correct page was not selected" +e);
        }

    }


    @Test
    public void SelectRandomProductTest(){

        pageobjects.PageElements basketTest = new pageobjects.PageElements();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        int randomProduct = 1 + (int)(Math.random() * ((48 - 1) +1));
        basketTest.allProducts.get(randomProduct).click();


    }


    @Test
    public void TestPrices() {

        pageobjects.PageElements productPrice = new pageobjects.PageElements();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            productPrice.listedPrice == productPrice.basketPrice;
        } catch (Exception e) {
            System.out.println("Product prices are not equal.");
        }

    }


     @Test
     public void TestQuantity(){

        pageobjects.PageElements productQuantity = new pageobjects.PageElements();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try{
            productQuantity.pcQuantity.getText().equals("2");
        } catch(Exception e){
            System.out.println("Product quantity is not 2.");
         }

    }


    @Test
    public void DeleteProductTest(){

        pageobjects.PageElements basketCond = new pageobjects.PageElements();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try{
            basketCond.currentBasket.getText() == "Sepetinizde ürün bulunmamaktadır."
        } catch(Exception e){
            System.out.println("Products could not be deleted.");
        }

    }



}
