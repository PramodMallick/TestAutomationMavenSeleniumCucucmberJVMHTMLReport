package pages;

import config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SolutionsPage extends Base {

    JavascriptExecutor js = ((JavascriptExecutor) driver);

//    @FindBy(css = ".utility-nav__cart-icon")
//    public WebElement cartIcon;

    public SolutionsPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyTitleText(String expectedTitleText){

        WebElement elm = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(elm.getText(),expectedTitleText);
    }


}
