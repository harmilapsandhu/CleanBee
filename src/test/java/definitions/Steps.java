package definitions;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CleanerPage;
import pageObjects.HomeOwnerPage;
import pageObjects.LandingPage;
import resources.Base1;


public class Steps extends Base1{
	
	LandingPage lp;
	
	@Given("Initialize the browser")
	public void initialize_the_browser() throws IOException {
	    
		driver = Initialize();
		lp = new LandingPage(driver);
	}
	
	
	@When("^User clicks Home Owner SignUp and enters (.+) and (.+) and (.+) and (.+) and (.+) then clicks SignUp$")
	public void user_clicks_home_owner_signup_and_enters_and_and_and_then_clicks_signup(String FirstName, String LastName, String Email, String PhoneNumber, String HouseType) {
	    
		HomeOwnerPage ho = lp.getHomeOwner();
		ho.getFirstName().sendKeys(FirstName);
		ho.getLastName().sendKeys(LastName);
		ho.getEmail().sendKeys(Email);
		ho.getPhone().sendKeys(PhoneNumber);
		ho.getAccomodation().selectByValue(HouseType);
		ho.getSubmit().click();
	}
	
	
	@Then("Verify Alert pop up and click OK")
	public void verify_alert_pop_up_and_click_ok() {
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	
	//Cleaner Code
	@Given("Initialize the browser Cleaner")
	public void initialize_the_browser_cleaner() throws IOException {
	    
		driver = Initialize();
		lp = new LandingPage(driver);
	}

	
	@When("^User clicks Cleaner SignUp and enters (.+) and (.+) and (.+) and (.+) and (.+) then clicks SignUp$")
	public void user_clicks_cleaner_signup_and_enters_and_and_and_then_clicks_signup(String FirstName, String LastName, String Email, String PhoneNumber, String Experience) {
	    
		CleanerPage cl = lp.getCleaner();
		cl.getFirstNameCleaner().sendKeys(FirstName);
		cl.getLastNameCleaner().sendKeys(LastName);
		cl.getEmailCleaner().sendKeys(Email);
		cl.getPhoneCleaner().sendKeys(PhoneNumber);
		cl.getExperienceCleaner().selectByValue(Experience);
		cl.getSubmitCleaner().click();
	}
	
	
	@Then("Verify Alert pop up and click OK Cleaner")
	public void verify_alert_pop_up_and_click_ok_cleaner() {
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
}
