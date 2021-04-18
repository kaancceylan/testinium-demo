package pageobjects;
import PageObj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class PageElements extends PageObj {

    @FindBy(how = How.CLASS_NAME, using = "gekhq4-5 grTfZj")
    public WebElement loginOrSignUp;

    @FindBy(how = How.ID, using = "L-UserNameField")
    public WebElement emailField;

    @FindBy(how = How.ID, using = "L-PasswordField")
    public WebElement passwordField;

    //Switch frame to get recaptcha box
    //driver.switchTo().frame("a-uvw346uohmtf");
    //Find recaptcha box and click
    //@FindBy(how = How.XPATH, using = "???")
    //public WebElement captchaBtn;

    @FindBy(how = How.ID, using = "gg-login-enter")
    public WebElement loginBtn;

    @FindBy(how = How.CLASS_NAME, using = "gekhq4-4 egoSnI")
    //get text from loginVerify, equals to "Hesabım"
    public WebElement loginVerify;

    @FindBy(how = How.CLASS_NAME, using = "sc-4995aq-0 sc-14oyvky-0 itMXHg")
    public WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "qjixn8-0 sc-1bydi5r-0 hKfdXF")
    public WebElement searchBtn;

    //2nd page of the search results
    @FindBy(how = How.XPATH, using = "//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a")
    public WebElement secondPageBtn;
    //check that the second page is loaded

    @FindBy(how = How.CLASS_NAME, using = "current")
    public WebElement selectedPage;

    //Products container
    @FindBy(how = How.CLASS_NAME, using = "catalog-view clearfix products-container")
    public List <WebElement> allProducts;
    //get a randomnumber between 1-48
    //pass it to click() to select the product


    @FindBy(how = How.ID, using = "add-to-basket")
    public WebElement addToBasketBtn;

    @FindBy(how = How.ID, using = "sp-price-discountPrice")
    public WebElement listedPrice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header_wrapper\"]/div[4]/div[3]/a")
    public WebElement myBasket;

    @FindBy(how = How.CLASS_NAME, using = "extra-discounted")
    public WebElement basketPrice;

    @FindBy(how = How.CLASS_NAME, using = "amount")
    public WebElement pcQuantity;

    @FindBy(how = How.CLASS_NAME, using = "btn-delete btn-update-item")
    public WebElement deleteBtn;

    @FindBy(how = How.CLASS_NAME, using = "gg-w-22 gg-d-22 gg-t-21 gg-m-18")
    public WebElement currentBasket;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void getLoginPage(loginOrSignUp){
        this.loginOrSignUp.click();
    }

    public void fillEmail(String emailField){
        this.emailField.clear();
        this.emailField.sendKeys(emailField);
    }

    public void fillPassword(String passwordField){
        this.passwordField.clear();
        this.passwordField.sendKeys(passwordField);
    }

    //public void clickCaptcha(captchaBtn){
    //    this.captchaBtn.click();
    //}

    public void loginSubmit(loginBtn){
        this.loginBtn.click();
    }

    public void SearchKeyword(String searchThis){
        this.searchBox.clear();
        this.searchBox.sendKeys(searchThis);
    }

    public void ExecuteSearch(searchBtn){
        this.searchBtn.click();
    }

    public void getSecondPage(secondPageBtn){
        this.secondPageBtn.click();
    }

    public void addToBasket(addToBasketBtn){
        this.addToBasketBtn.click();
    }

    public void getListedPrice(listedPrice){
        this.listedPrice.getText();
    }

    public void goToBasket(myBasket){
        this.myBasket.click();
    }

    public void changeQuantity(pcQuantity){
        pcQuantity.getAttribute("value='2'");
    }

    public void emptyBasket(deleteBtn){
        this.deleteBtn.click();
    }

}
