package pageobjects;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import step_definitions.BaseClass;
import util.Credentials;

public class Pages extends BaseClass {

    public Credentials credentials;

    public Actions actions;

    public LoginPage loginPage;


    public Pages(){

        credentials = new Credentials();

        actions = new Actions(driver);

        loginPage = new LoginPage();

        PageFactory.initElements(driver,this);
    }

    public LoginPage loginPage() {
        return loginPage;
    }


    public Actions actions() {
        return actions;
    }

    public Credentials credentials() {
        return credentials;
    }

}
