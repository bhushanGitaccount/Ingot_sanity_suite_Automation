package util;

import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;


public class Environments {

    public WebDriver driver;
    public String url;



    public Environments(String project) {
        driver = Hooks.driver;

        if(project.equals("moto")){
//            String Env1 = System.getProperty("ENV");
            String Env="dev";//Temp solution
            System.out.println("The test is running on " + Env.toUpperCase() + " environment");
            switch (Env.toLowerCase()) {

                case "dev":
                    driver.get("https://moto2.dev.conduit4.com/lms/");
                    break;

                case "uat":
                    driver.get("https://moto2.uat.conduit4.com/lms/home");
                    break;

            }
        }
       else if(project.equals("speck")) {
            driver = Hooks.driver;


//            String Env1 = System.getProperty("ENV");
            String Env="dev";//Temp solution
            if (Env == null) {
                Env = "qa";
            }
            System.out.println("The test is running on " + Env.toUpperCase() + " environment");
            switch (Env.toLowerCase()) {

                case "dev":
                    driver.get("https://speck.dev.conduit4.com/lms/home");
                    break;
                case "uat":
                    driver.get("https://speck.uat.conduit4.com/lms/home");
                    break;

            }
        }
        else if(project.equals("mrt")) {
            driver = Hooks.driver;


//            String Env1= System.getProperty("ENV");
            String Env="dev";//Temp solution
            if (Env == null) {
                Env = "qa";
            }
            System.out.println("The test is running on " + Env.toUpperCase() + " environment");
            switch (Env.toLowerCase()) {

                case "dev":
                    driver.get("https://hmrt.dev.conduit4.com/lms");
                    break;
                case "uat":
                    driver.get("https://hmrt.uat.conduit4.com/lms/home");
                    break;

            }
        }
        else if(project.equals("qualcomm")) {
            driver = Hooks.driver;


//            String Env1 = System.getProperty("ENV");
            String Env="dev";//Temp solution
            if (Env == null) {
                Env = "qa";
            }
            System.out.println("The test is running on " + Env.toUpperCase() + " environment");
            switch (Env.toLowerCase()) {

                case "dev":

                    System.out.println("---------------Openning Qcom site----------");
                    driver.get("https://qcomna.dev.conduit4.com/lms");
                    break;
                case "uat":
                    driver.get("https://www-uat-discover.conduit4.com");
                    break;

            }
        }
        else if(project.equals("Pulse")) {
            driver = Hooks.driver;


//            String Env1 = System.getProperty("ENV");
            String Env="dev";//Temp solution
            if (Env == null) {
                Env = "qa";
            }
            System.out.println("The test is running on " + Env.toUpperCase() + " environment");
            switch (Env.toLowerCase()) {

                case "dev":
                    driver.get("https://btft.dev.conduit4.com/dashboard/");
                    break;
                case "uat":
                    driver.get("https://btft.uat.conduit4.com/dashboard/");
                    break;

            }
        }
        else if(project.equals("bridgestone")) {
            driver = Hooks.driver;


//            String Env1 = System.getProperty("ENV");
            String Env="dev";//Temp solution
            if (Env == null) {
                Env = "qa";
            }
            System.out.println("The test is running on " + Env.toUpperCase() + " environment");
            switch (Env.toLowerCase()) {

                case "dev":
                    driver.get("https://atmosphere.dev.conduit4.com/lms/");
                    break;
                case "uat":
                    driver.get("https://atmosphere.uat.conduit4.com/");
                    break;
                case "admin":
                    driver.get("https://helios.dev.conduit4.com/tool/admin/multi/");
                    break;

            }
        }





    }

}
