package stepdefs;

import config.Base;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.SolutionsPage;

public class StepDefinitions extends Base {

    private HomePage homePage = new HomePage();
    private SolutionsPage solutionsPage = new SolutionsPage();


//    private ElLoginPage elLoginPage =new ElLoginPage();

    @Given("^I am on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void i_am_on_the_page_on_URL(String arg1, String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        homePage.navigateToHomePage(url);
        homePage.verifyTitle("United Kingdom | Burning Glass Technologies");

    }

//    @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
//    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I click on the \"([^\"]*)\" button$")
//    public void i_click_on_the_button(String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
//
//    @Then("^I should see the \"([^\"]*)\" button$")
//    public void i_should_see_the_button(String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }

    @When("^I navigate to \"([^\"]*)\" page from top menu bar$")
    public void i_navigate_to_page_from_top_menu_bar(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (arg1 == "Solutions")
        {
            WebElement elmAbout = driver.findElement(By.xpath("//a[@class='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only']"));
            elmAbout.click();
        }
        else if(arg1 == "About"){
            WebElement elmAbout = driver.findElement(By.xpath("//a[@class='ubermenu-target ubermenu-item-layout-default ubermenu-item-layout-text_only']"));
            elmAbout.click();

        }
    }

    @Then("^I should have landed in \"([^\"]*)\" page$")
    public void i_should_have_landed_in_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        solutionsPage.verifyTitleText("Solutions");

    }

    @Then("^below sections would be listed in \"([^\"]*)\" page$")
    public void below_sections_would_be_listed_in_page(String arg1, DataTable arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

//        List<String> listOfSetion = arg1.asList();


    }

}
