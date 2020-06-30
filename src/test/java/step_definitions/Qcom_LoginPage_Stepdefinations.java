package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageobjects.Pages;

import static org.junit.Assert.assertEquals;

public class Qcom_LoginPage_Stepdefinations  extends Pages {
    @Given("^user enter Qcom URl$")
    public void user_enter_qcom_url() {
        navigateToQualcommLoginPage();



    }


    @Given("^user enter username$")
    public void user_enter_username()  {
        QcomloginOBJ.Qcom_userName.sendKeys("dev@halight.com");

    }

    @Given("^user enter password$")
    public void user_enter_password()  {
        QcomloginOBJ.Qcom_password.sendKeys("apsodi77");

    }

    @And("^click on qcom login button$")
    public void click_on_qcom_login_button()  {
        QcomloginOBJ.Qcom_submitButton.click();
        System.out.println("Done test case");

    }

    @And("^home page tite should be \"([^\"]*)\"$")
    public void home_page_tite_should_be_something(String expectedTitle) {
        String actualTitle = driver.getTitle();
        System.out.println("This is home page title "+expectedTitle);
        assertEquals(expectedTitle, actualTitle);

        System.out.println("Test case pass");

    }


}
