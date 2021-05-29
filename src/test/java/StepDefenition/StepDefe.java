package StepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import CommonClass.AdactinBase;
import PomfileAdactin.AdactinHotelBooking;
import PomfileAdactin.AdactinLoginpom;
import PomfileAdactin.AdactinPaymentPage;
import PomfileAdactin.HotelSelectionPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefe extends AdactinBase {
	// adactin Login page

	@Given("User should open the login page")
	public void user_should_open_the_login_page() {
		browserLaunch();
		getUrl("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	static AdactinLoginpom loginpage;

	@When("User should type the valid credentials")
	public void user_should_type_the_valid_credentials() {
		loginpage = new AdactinLoginpom();
		WebElement username = loginpage.getUsername();
		sendKeys(username, "mages123");
		WebElement password = loginpage.getPassword();
		sendKeys(password, "malar123");
	}

	@Then("User should click login button")
	public void user_should_click_login_button() {
		loginpage = new AdactinLoginpom();
		WebElement loginbtn = loginpage.getLoginbtn();
		click(loginbtn);

	}
	// adactin search hotel page

	static AdactinHotelBooking bookingpage;

	@When("User should select the location and hotel")
	public void user_should_select_the_location_and_hotel() {
		bookingpage = new AdactinHotelBooking();
		WebElement hotelLocation = bookingpage.getHotelLocation();
		selectIndex(hotelLocation, 1);
		WebElement hotelName = bookingpage.getHotelName();
		selectIndex(hotelName, 1);
	}

	@When("User should select the room type and number of rooms")
	public void user_should_select_the_room_type_and_number_of_rooms() {
		bookingpage = new AdactinHotelBooking();
		WebElement roomType = bookingpage.getRoomType();
		selectIndex(roomType, 1);
		WebElement roomNumer = bookingpage.getRoomNumer();
		selectIndex(roomNumer, 1);

	}

	@When("User should type adults count and child count")
	public void user_should_type_adults_count_and_child_count() {
		bookingpage = new AdactinHotelBooking();
		WebElement adultCount = bookingpage.getAdultCount();
		selectIndex(adultCount, 1);
		WebElement childCount = bookingpage.getChildCount();
		selectIndex(childCount, 1);
	}

	@Then("User should click search button")
	public void user_should_click_search_button() {
		bookingpage = new AdactinHotelBooking();
		WebElement submitBtn = bookingpage.getSubmitBtn();
		click(submitBtn);
	}

	// adactin select hotel

	static HotelSelectionPage selectionPage;

	@When("User should click the Radiobutton for hotel selection")
	public void user_should_click_the_Radiobutton_for_hotel_selection() {
		selectionPage = new HotelSelectionPage();
		WebElement radioButtonClick = selectionPage.getRadioButtonClick();
		click(radioButtonClick);

	}

	@Then("User should click the continuebutton")
	public void user_should_click_the_continuebutton() {
		WebElement continueButton = selectionPage.getContinueButton();
		click(continueButton);
	}

	// adactin payment page

	static AdactinPaymentPage paymentpage = new AdactinPaymentPage();

	@When("User should type  first name")
	public void user_should_type_first_name() {
		paymentpage = new AdactinPaymentPage();
		WebElement firstName = paymentpage.getFirstName();
		sendKeys(firstName, "Radha");
		WebElement lastName = paymentpage.getLastName();
		sendKeys(lastName, "moha");
	}

	@When("User should type  last name")
	public void user_should_type_last_name() {
		paymentpage = new AdactinPaymentPage();
		WebElement lastName = paymentpage.getLastName();
		sendKeys(lastName, "moha");

	}

	@When("User should type billing address")
	public void user_should_type_billing_address() {
		paymentpage = new AdactinPaymentPage();

	}

	@When("User should type the cardnumber")
	public void user_should_type_the_cardnumber() {
		paymentpage = new AdactinPaymentPage();
		WebElement billingAddress = paymentpage.getBillingAddress();
		sendKeys(billingAddress, "cheaai");

	}

	@When("User should select the cardtype expirydate year and cvv")
	public void user_should_select_the_cardtype_expirydate_year_and_cvv() {
		paymentpage = new AdactinPaymentPage();
		WebElement creditCardumber = paymentpage.getCreditCardumber();
		sendKeys(creditCardumber, "1234567890987654");
		WebElement creditType = paymentpage.getCreditType();
		selectIndex(creditType, 2);
		WebElement expiryDate = paymentpage.getExpiryDate();
		selectIndex(expiryDate, 2);
		WebElement selectYear = paymentpage.getSelectYear();
		selectIndex(selectYear, 12);
		WebElement cvvNumber = paymentpage.getCvvNumber();
		sendKeys(cvvNumber, "123");

	}

	@Then("User should click booknow button")
	public void user_should_click_booknow_button() {
		paymentpage = new AdactinPaymentPage();
		WebElement bookNowButton = paymentpage.getBookNowButton();
		click(bookNowButton);

	}

}
