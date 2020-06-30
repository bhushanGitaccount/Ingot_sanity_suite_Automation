package step_definitions;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import util.Environments;

public class BaseClass {
    public WebDriver driver = Hooks.driver;

    public void navigateToQualcommLoginPage() {
        System.out.println("This is inside base class");
		Environments env = new Environments("qualcomm");
	}


}