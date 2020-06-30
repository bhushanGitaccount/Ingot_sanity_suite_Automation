package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import step_definitions.BaseClass;

public class Qcom_homePage_Objects extends BaseClass {


    public Qcom_homePage_Objects() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "//span[contains(text(),'Learn')]")
    public WebElement learnTab;

}
