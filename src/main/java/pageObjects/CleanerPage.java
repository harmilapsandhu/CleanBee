package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CleanerPage {

	WebDriver driver;
	
	public CleanerPage(WebDriver driver)
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
	
	@FindBy(id="xp")
	WebElement experience;
	
	@FindBy(xpath="//button[@class='signup-homeowner']")
	WebElement submit;
	
	public WebElement getFirstNameCleaner()
	{
		return firstName;
	}
	
	public WebElement getLastNameCleaner()
	{
		return lastName;
	}
	
	public WebElement getEmailCleaner()
	{
		return email;
	}
	
	public WebElement getPhoneCleaner()
	{
		return phone;
	}
	
	public Select getExperienceCleaner()
	{
		Select sel2 = new Select(experience);
		return sel2;
	}
	
	public WebElement getSubmitCleaner()
	{
		return submit;
	}
}
