package pages;

import config.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElLoginPage extends Base {

    JavascriptExecutor js = ((JavascriptExecutor) driver);

    public ElLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
    public WebElement signInBtn;

    @FindBy(css = "#sign-in-component__EMAIL_ADDRESS")
    public WebElement userId;

    @FindBy(css = "input[data-test-id='gnav_login_form_password']")
    public WebElement password;

    @FindBy(css = "input[value='Sign In']")
    public WebElement sigsInButton;

    @FindBy(css = "li[id*=no_account]")
    public WebElement error;

    public void click(WebElement ele) {
        ele.click();
    }

    public void input_text(String userID, String pass) {
        userId.sendKeys(userID);
        password.sendKeys(pass);
    }
}