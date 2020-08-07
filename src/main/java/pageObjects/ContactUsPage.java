package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	WebDriver driver;
	
	public ContactUsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(css="[name='message']")
	WebElement message;
	
	@FindBy(css="[type='submit']")
	WebElement submit;
	
	public WebElement getName()
	{
		return name;
	}
	
	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement getMessage()
	{
		return message;
	}
	
	public WebElement getSubmit()
	{
		return submit;
	}
	
	
}

