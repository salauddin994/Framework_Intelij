package StepDefinition;

import Base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends Config {

    public static String url;
    public static String baseURL =System.getProperty("env");
    public static String browserType =System.getProperty("browser");


    //defult browser/env setup
    public static String defUrl="qa";
    public static String defBrowser="ch";

    //open browser
    @Before
    public void openBrowser(){

        //defult browser/env setup
        if(Strings.isNullOrEmpty(baseURL)){
            baseURL=defUrl;
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType=defBrowser;
        }

        //Dynamic setup

        driver=initDriver(browserType);
        switch (baseURL){
            case "qa":
                url="https://www.airbnb.com/";
                break;
            case "stage":
                url="http://stage.taltektc.com/home";
                break;

            case "prod":
                url="http://taltektc.com/home";
                break;
        }
        driver.get(url);

    }


    @After
    public void tearDown(Scenario scenario){

            try {
                if (scenario.isFailed()){
                    final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot,"image/png",scenario.getName());

                }
            }
            catch (Exception e){
                System.out.println(e);
            }

//            driver.quit();
    }




}
