package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Config {

    public static WebDriver driver;
    //Setup browsers
    public static WebDriver initDriver(String driverType){
        if(driverType.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (driverType.equalsIgnoreCase("ff")){
           WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if (driverType.equalsIgnoreCase("edg")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return driver;
    }







}
