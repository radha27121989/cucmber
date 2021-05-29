package PomfileAdactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonClass.AdactinBase;

public class HotelSelectionPage extends AdactinBase {
	public HotelSelectionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioButtonClick;
	@FindBy(id = "continue")
	private WebElement continueButton;

	public WebElement getRadioButtonClick() {
		return radioButtonClick;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
