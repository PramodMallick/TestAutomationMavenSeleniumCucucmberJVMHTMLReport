package pages;

import config.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;


public class HomePage extends Base {

    JavascriptExecutor js = ((JavascriptExecutor) driver);

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".utility-nav__cart-icon")
    public WebElement cartIcon;

    @FindBy(css = ".viewcart-header .checkout-page-title")
    public WebElement cartHeader;

    @FindBy(css = ".utility-nav__cart-count.page-utilities__cart-count")
    public WebElement itemCount;

    @FindBy(css = ".cart-item.product")
    public WebElement itemInBag;

    @FindBy(css = "a.sign-out-link[data-test-id='account_menu_logout']")
    public WebElement sigsOut;

    @FindBy(css = ".page-utilities__search-icon")
    public WebElement search;

    @FindBy(css = "input#search")
    public WebElement searchBar;

    @FindBy(xpath = "(//span[contains(text(),'See All Results')])[1]")
    public WebElement searchLink;

    @FindBy(css = ".search-product__header")
    public List<WebElement> products;

    @FindBy(css = "button[data-test-id='add-to-cart'][class*=product-full__add-button],a.btn-add-to-bag")
    public WebElement addToBag;

    @FindBy(css = "a.remove_link ")
    public WebElement removeItem;

    public void clickElementByJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    public void enterText(WebElement element, String txt) {
        js.executeScript("arguments[0].value='" + txt + "'", element);
    }

    public void verifyTitle(String Ac) {
        String Ex = driver.getTitle();
        Assert.assertEquals(Ex, Ac);
    }

    public void getInnerText(WebElement ele, String expValue) {
        String actual = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;", ele);
        Assert.assertEquals(expValue, actual);
    }

    public void navigateToHomePage(String url){
        driver.get(url);
    }

}