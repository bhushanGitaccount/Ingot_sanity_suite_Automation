package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.Pages;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Qcom_HomePage_Stepdefination extends Pages {
//    private WebDriverWait longWebDriverWait = new WebDriverWait(driver, longwaitTime);
    private WebDriverWait webDriverWait = new WebDriverWait(driver, 20);

    @Given("^user should click on learn tab$")
    public void user_should_click_on_learn_tab()  {
        System.out.println("Inside home page ");
        WebElement learntab= QcomHomepageOBJ.learnTab;
        webDriverWait.until(ExpectedConditions.invisibilityOf(learntab));
        learntab.click();

    }

    @Then("^user able to see product courses$")
    public void user_able_to_see_product_courses() {

    }

    @Then("^user able to see certification tab$")
    public void user_able_to_see_certification_tab() {

    }

}
