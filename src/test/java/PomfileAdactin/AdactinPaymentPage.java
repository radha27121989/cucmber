package PomfileAdactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonClass.AdactinBase;

public class AdactinPaymentPage extends AdactinBase {
	public AdactinPaymentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement billingAddress;
	@FindBy(id = "cc_num")
	private WebElement creditCardumber;
	@FindBy(id = "cc_type")
	private WebElement creditType;
	@FindBy(id = "cc_exp_month")
	private WebElement expiryDate;
	@FindBy(id = "cc_exp_year")
	private WebElement selectYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id = "book_now")
	private WebElement bookNowButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardumber() {
		return creditCardumber;
	}

	public WebElement getCreditType() {
		return creditType;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

}
