Feature: SearchButton
  @Regression
  Scenario: Verify that as a guest user should able to search location,check in&check out date and number of guest
  and also filterd wih bed,bedroom and bathroom then book a reservation

    Given I am at airbnb home page
    And Scroll down in home page
    And Click on search button from the header
    And Click on location box and verify the place holder name
    And Input the location in location box
    And Click on check in box and verify the place holder name
    Then Select the check in date from the calender
    Then Select the check out date from the calender
    And Click on guests box and verify the place holder name
    Then Add the number of guests by clicking pluse symble
    When Click on search option
    Then Verify that user redirected in right page By validating page title
    And Click on filter option from the header and add number of bed,bedroom,bathroom,Amenities(wifi,kitchen) and click on show stays link
    And Select a stays and store the stays title globally
    And Verify that user land in right page
    And Verify the check in,checkout data and number of guest
    And Verify that what kind of offers this place offering from the what this place offers panel
    And Click on reserv link
    And Is this a work trip Enable the button
    And Select the payment type from the dropdown payment option
    And Input Card number,Expiration date,CVV,Zip code in the following field
    And Select country from the country dropdown box
    When Click on Confirm and pay







  @smoke
    Scenario: Verify that as a guest user should able to search location,Flexible check in & check out date and add number of guest
    and also filterd with price,wifi & other things then book a reservation

    Given I am at airbnb home page
    And Scroll down in home page
    And Click on search button from the header
    And Click on location box and verify the place holder name
    And Input the location in location box
    And Click on check in box and verify the place holder name
    Then Click on i'm flexible option and Click on weekend option and select the month
    And Click on guests box and verify the place holder name
    Then Add the number of guests by clicking pluse symble
    When Click on search option
    Then Verify that user redirected in right page By validating page title
    And Click on filter option from the header and add number of bed,bedroom,bathroom,Amenities(wifi,kitchen) and click on show stays link
    And Click on price button
    And Choose the min and max price using the sliders
    And Input the min&max price in the following field
    And Click on save option
    And Select a stays and store the stays title globally
    And Verify that user land in right page
    And Verify the check in,checkout data and number of guest
    And Verify that what kind of offers this place offering from the what this place offers panel
    And Click on reserv link
    And Is this a work trip Enable the button
    And Verify pay in full radion button by defult selected
    And Click on radio button pay part now,part later
    And Select the payment type from the dropdown payment option
    And Input Card number,Expiration date,CVV,Zip code in the following field
    And Select country from the country dropdown box
    When Click on request to book option




  Scenario: verify that user should not able to select check out date before check in date