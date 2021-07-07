package StepDefinition;

import Base.Config;
import Base.Test_Data;
import PageObject.SearchButton_pageObject;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class SearchButton_steps extends Config {

    SearchButton_pageObject srch =new SearchButton_pageObject(driver);
    //Scenario 01>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    Faker faker =new Faker();

    @Given("I am at airbnb home page")
    public void iAmAtAirbnbHomePage() {
        Assert.assertEquals(driver.getTitle(), Test_Data.homePageTitle);
        
    }

    @And("Click on location box and verify the place holder name")
    public void clickOnLocationBoxAndVerifyThePlaceHolderName()  {

        Assert.assertEquals(srch.setLocation.getAttribute("placeholder"),Test_Data.expPlaceholder_Location);

    }

    @And("Input the location in location box")
    public void inputTheLocationInLocationBox() {
        srch.setLocation.sendKeys(Test_Data.location);
    }

    @And("Click on check in box and verify the place holder name")
    public void clickOnCheckInBoxAndVerifyThePlaceHolderName() {
        Assert.assertEquals(srch.selectCheckIn.getText(),Test_Data.expPlaceholder_CheckIn_Checkout);
        srch.selectCheckIn.click();
    }

    @Then("Select the check in date from the calender")
    public void selectTheCheckInDateFromTheCalender() {

    }

    @Then("Select the check out date from the calender")
    public void selectTheCheckOutDateFromTheCalender() {

    }

    @And("Click on guests box and verify the place holder name")
    public void clickOnGuestsBoxAndVerifyThePlaceHolderName() {

    }

    @Then("Add the number of guests by clicking pluse symble")
    public void addTheNumberOfGuestsByClickingPluseSymble() {

    }

    @When("Click on search option")
    public void clickOnSearchOption() {

    }

    @Then("Verify that user redirected in right page By validating page title")
    public void verifyThatUserRedirectedInRightPageByValidatingPageTitle() {

    }

    @And("Click on filter option from the header and add number of bed,bedroom,bathroom,Amenities\\(wifi,kitchen) and click on show stays link")
    public void clickOnFilterOptionFromTheHeaderAndAddNumberOfBedBedroomBathroomAmenitiesWifiKitchenAndClickOnShowStaysLink() {

    }

    @And("Select a stays and store the stays title globally")
    public void selectAStaysAndStoreTheStaysTitleGlobally() {

    }

    @And("Verify that user land in right page")
    public void verifyThatUserLandInRightPage() {

    }

    @And("Verify the check in,checkout data and number of guest")
    public void verifyTheCheckInCheckoutDataAndNumberOfGuest() {

    }

    @And("Verify that what kind of offers this place offering from the what this place offers panel")
    public void verifyThatWhatKindOfOffersThisPlaceOfferingFromTheWhatThisPlaceOffersPanel() {

    }

    @And("Click on reserv link")
    public void clickOnReservLink() {

    }

    @And("Is this a work trip Enable the button")
    public void isThisAWorkTripEnableTheButton() {

    }

    @And("Select the payment type from the dropdown payment option")
    public void selectThePaymentTypeFromTheDropdownPaymentOption() {

    }

    @And("Input Card number,Expiration date,CVV,Zip code in the following field")
    public void inputCardNumberExpirationDateCVVZipCodeInTheFollowingField() {

    }

    @And("Select country from the country dropdown box")
    public void selectCountryFromTheCountryDropdownBox() {

    }

    @When("Click on Confirm and pay")
    public void clickOnConfirmAndPay() {
    }


    //Scenario 02>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @And("Scroll down in home page")
    public void scrollDownInHomePage() {

    }

    @And("Click on search button from the header")
    public void clickOnSearchButtonFromTheHeader() {
    }

    @Then("Click on i'm flexible option and Click on weekend option and select the month")
    public void clickOnIMFlexibleOptionAndClickOnWeekendOptionAndSelectTheMonth() {

    }

    @And("Click on price button")
    public void clickOnPriceButton() {

    }

    @And("Choose the min and max price using the sliders")
    public void chooseTheMinAndMaxPriceUsingTheSliders() {

    }


    @And("Input the min&max price in the following field")
    public void inputTheMinMaxPriceInTheFollowingField() {

    }

    @And("Click on save option")
    public void clickOnSaveOption() {

    }

    @And("Verify pay in full radion button by defult selected")
    public void verifyPayInFullRadionButtonByDefultSelected() {

    }

    @And("Click on radio button pay part now,part later")
    public void clickOnRadioButtonPayPartNowPartLater() {

    }

    @When("Click on request to book option")
    public void clickOnRequestToBookOption() {
    }


}
