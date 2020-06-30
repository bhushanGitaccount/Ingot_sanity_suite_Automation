package pageobjects;
import step_definitions.BaseClass;

public class Pages extends BaseClass {


   public Qcom_loginPage_Object QcomloginOBJ;
   public Qcom_homePage_Objects QcomHomepageOBJ;

    public Pages(){

        QcomloginOBJ = new Qcom_loginPage_Object();
        QcomHomepageOBJ =new Qcom_homePage_Objects();


    }
}
