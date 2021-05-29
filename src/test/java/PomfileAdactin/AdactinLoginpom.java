package PomfileAdactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonClass.AdactinBase;



public class AdactinLoginpom extends AdactinBase {
	public AdactinLoginpom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement Username;
	@FindBy(id = "password")
	private WebElement Password;
	@FindBy(id = "login")
	private WebElement Loginbtn;
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement NewRegisterBtn;

	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	public WebElement getNewRegisterBtn() {
		return NewRegisterBtn;
	}

		
	

}
