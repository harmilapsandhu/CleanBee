package pageObjects;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By HomeOwner = withTagName("button").below(By.xpath("//p[text()=' Time Is Money']"));
	
	@FindBy(css="[routerlink='/clean-signup']")
	WebElement Cleaner;
	
	@FindBy(linkText="Privacy")
	WebElement Privacy;
	
	@FindBy(linkText="Terms")
	WebElement Terms;
	
	@FindBy(xpath="//a[@href='#/contact']")
	WebElement ContactUs;
	
	
	public HomeOwnerPage getHomeOwner()
	{
		driver.findElement(HomeOwner).click();
		HomeOwnerPage ho = new HomeOwnerPage(driver);
		return ho;
	}
	
	public CleanerPage getCleaner()
	{
		Cleaner.click();
		CleanerPage cp = new CleanerPage(driver);
		return cp;
	}
	
	public WebElement getPrivacy()
	{
		return Privacy;
	}
	
	public WebElement getTerms()
	{
		return Terms;
	}
	
	public ContactUsPage getContactUs()
	{
		ContactUs.click();
		ContactUsPage cont = new ContactUsPage(driver);
		return cont;
	}
}
