

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CommonClass.AdactinBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefealltypes extends AdactinBase {

	@Given("User should open the login page")
	public void user_should_open_the_login_page() {
		browserLaunch();
		getUrl("https://adactinhotelapp.com/");

	}
	@When("user ete without header")
	public void user_ete_without_header(io.cucumber.datatable.DataTable dataTable) {
		List<String> al = dataTable.asList();
		WebElement fe = driver.findElement(By.id("username"));
		WebElement fe1 = driver.findElement(By.id("password"));
		fe.sendKeys(al.get(0));
		fe1.sendKeys(al.get(1));
	}

	@Then("User should click login button")
	public void user_should_click_login_button() {
		WebElement log = driver.findElement(By.id("login"));
		click(log);

	}

	/*
	 * scenario outline
	 * 
	 * @When("User enter valid {string} and {string}") public void
	 * user_enter_valid_and(String s1, String s2) { WebElement user =
	 * driver.findElement(By.id("username")); sendKeys(user, s1); WebElement pass =
	 * driver.findElement(By.id("password")); sendKeys(pass, s2);
	 * System.out.println(pass.getAttribute("value")); }
	 */
	/*
	 * Using double quotes
	 * 
	 * @When("User enter valid username {string} and password{string}") public void
	 * user_enter_valid_username_and_password(String s1, String s2) { WebElement
	 * user = driver.findElement(By.id("username")); sendKeys(user, s1 ); WebElement
	 * pass = driver.findElement(By.id("password")); sendKeys(pass, "s2"); }
	 */
	/*
	 * hot coding
	 * 
	 * @When("User enter valid username and password") public void
	 * user_enter_valid_username_and_password() { WebElement user =
	 * driver.findElement(By.id("username")); sendKeys(user, "mages123"); WebElement
	 * pass = driver.findElement(By.id("password")); sendKeys(pass, "malar123");
	 * 
	 * }
	 */
	/*
	 * @When("User enter valid username and invalid passworld") public void
	 * user_enter_valid_username_and_invalid_passworld() { WebElement user =
	 * driver.findElement(By.id("username")); sendKeys(user, "mages123"); WebElement
	 * pass = driver.findElement(By.id("password")); sendKeys(pass, "pass");
	 * 
	 * }
	 */
	
	

}
