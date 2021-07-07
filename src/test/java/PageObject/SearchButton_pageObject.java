package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchButton_pageObject {

    public SearchButton_pageObject (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

   @FindBy(how = How.ID,using = "bigsearch-query-detached-query")
    public WebElement setLocation;
    @FindBy(how=How.XPATH,using = "/html/body/div[4]/div/div[1]/div/div/div[1]/div[1]/div/header/div/div[2]/div[2]/div/div/div/form/div/div/div[3]/div[1]/div/div/div[2]")
    public WebElement selectCheckIn;
    @FindBy(how = How.XPATH,using = "//*[@id=\"panel--tabs--0\"]/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[1]")
    public WebElement tbody;













}
