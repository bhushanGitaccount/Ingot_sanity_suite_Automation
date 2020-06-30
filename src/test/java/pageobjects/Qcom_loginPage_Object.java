package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import step_definitions.BaseClass;

public class Qcom_loginPage_Object  extends BaseClass{

    public Qcom_loginPage_Object() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement Qcom_userName;

    @FindBy(id = "password")
    public WebElement Qcom_password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement Qcom_submitButton;







}
