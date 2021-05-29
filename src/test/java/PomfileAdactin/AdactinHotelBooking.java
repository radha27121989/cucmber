package PomfileAdactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonClass.AdactinBase;



public class AdactinHotelBooking extends AdactinBase {
	public AdactinHotelBooking() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement HotelLocation;
	@FindBy(id = "hotels")
	private WebElement HotelName;
	@FindBy(id = "room_type")
	private WebElement RoomType;
	@FindBy(id = "room_nos")
	private WebElement RoomNumer;
	@FindBy(id = "datepick_in")
	private WebElement CheckInDate;
	@FindBy(id = "datepick_out")
	private WebElement CheckOutDate;
	@FindBy(id = "adult_room")
	private WebElement AdultCount;
	@FindBy(id = "child_room")
	private WebElement ChildCount;
	@FindBy(id = "Submit")
	private WebElement SubmitBtn;
	@FindBy(id = "Reset")
	private WebElement ResetBtn;

	public WebElement getHotelLocation() {
		return HotelLocation;
	}

	public WebElement getHotelName() {
		return HotelName;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNumer() {
		return RoomNumer;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getAdultCount() {
		return AdultCount;
	}

	public WebElement getChildCount() {
		return ChildCount;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public WebElement getResetBtn() {
		return ResetBtn;
	}

}
