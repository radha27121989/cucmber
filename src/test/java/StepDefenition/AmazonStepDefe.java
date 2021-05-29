package StepDefenition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.math.JVMRandom;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import CommonClass.AdactinBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmazonStepDefe extends AdactinBase {

	@Given("User should open the browser")
	public void user_should_open_the_browser() {
		browserLaunch();

	}

	@When("User should enter the url")
	public void user_should_enter_the_url() {
		getUrl("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement bestSellerbtn = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		bestSellerbtn.click();

	}

	// hot new Releases

	@Given("User should click Hot new Releases text")
	public void user_should_click_Hot_new_Releases_text() {
		WebElement hotReleases = driver.findElement(By.xpath("//a[text()='Hot New Releases']"));
		hotReleases.click();

	}

	@When("User should display the books")
	public void user_should_display_the_books() {
		System.out.println("hot releases");
		List<WebElement> books1 = driver
				.findElements(By.xpath("//div[@class='p13n-sc-truncate-desktop-type2 p13n-sc-truncated']"));
		for (WebElement x : books1) {

			System.out.println(x.getText());

		}

	}
	// moves and Shakers

	@Given("User should click Movers and Shakers text")
	public void user_should_click_Movers_and_Shakers_text() {
		WebElement movers = driver.findElement(By.xpath("//a[text()='Movers and Shakers']"));
		movers.click();

	}

	@When("User should display the book")
	public void user_should_display_the_book() {
		System.out.println("movers");
		List<WebElement> books2 = driver
				.findElements(By.xpath("//div[@class='p13n-sc-truncate-desktop-type2 p13n-sc-truncated']"));
		for (WebElement x : books2) {

			System.out.println(x.getText());

		}

	}

	// most wished for
	@Given("User should click Most wished for text")
	public void user_should_click_Most_wished_for_text() {
		WebElement wished = driver.findElement(By.xpath("//a[text()='Most Wished For']"));
		wished.click();

	}

	@When("User should display the list of books")
	public void user_should_display_the_list_of_books() {
		System.out.println("wished");
		List<WebElement> books3 = driver
				.findElements(By.xpath("//div[@class='p13n-sc-truncate-desktop-type2 p13n-sc-truncated']"));
		for (WebElement x : books3) {

			System.out.println(x.getText());

		}

	}
	// most gifted

	@Given("User should click mosted gifted text")
	public void user_should_click_mosted_gifted_text() {
		WebElement gifted = driver.findElement(By.xpath("//a[text()='Most Gifted']"));
		gifted.click();

	}

	@When("User shounld display the list of books")
	public void user_shounld_display_the_list_of_books() {
		System.out.println("gifted");
		List<WebElement> books3 = driver
				.findElements(By.xpath("//div[@class='p13n-sc-truncate-desktop-type2 p13n-sc-truncated']"));
		for (WebElement x : books3) {

			System.out.println(x.getText());

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
