package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeOwnerPage {

	WebDriver driver;
	
	public HomeOwnerPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="accomodation")
	WebElement accomodation;
	
	@FindBy(css="[class='signup-homeowner']")
	WebElement submit;
	
	
	public WebElement getFirstName()
	{
		return firstName;
	}
	
	public WebElement getLastName()
	{
		return lastName;
	}
	
	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement getPhone()
	{
		return phone;
	}
	
	public Select getAccomodation()
	{
		Select sel = new Select(accomodation);
		return sel;
	}
	
	public WebElement getSubmit()
	{
		return submit;
	}
}
