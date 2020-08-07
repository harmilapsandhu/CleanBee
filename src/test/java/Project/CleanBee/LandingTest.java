package Project.CleanBee;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CleanerPage;
import pageObjects.ContactUsPage;
import pageObjects.HomeOwnerPage;
import pageObjects.LandingPage;
import resources.Base1;

public class LandingTest extends Base1 {

	public WebDriver driver;
	LandingPage lp;
	
	
	@BeforeMethod
	public void InvokeBrowser() throws IOException
	{
		driver = Initialize();
		lp = new LandingPage(driver);
	}
	
	@Test(dataProvider="getDataHomeOwner")
	public void HomeOwner(String firstName, String lastName, String eMail, String phone, String houseType) throws InterruptedException
	{
		HomeOwnerPage ho = lp.getHomeOwner();
		ho.getFirstName().sendKeys(firstName);
		ho.getLastName().sendKeys(lastName);
		ho.getEmail().sendKeys(eMail);
		ho.getPhone().sendKeys(phone);
		ho.getAccomodation().selectByValue(houseType);
		ho.getSubmit().click();
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver, 2);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	@Test(dataProvider="getDataCleaner")
	public void Cleaner(String firstName, String lastName, String eMail, String phone, String experience) throws InterruptedException
	{
		CleanerPage cp = lp.getCleaner();
		cp.getFirstNameCleaner().sendKeys(firstName);
		cp.getLastNameCleaner().sendKeys(lastName);
		cp.getEmailCleaner().sendKeys(eMail);
		cp.getPhoneCleaner().sendKeys(phone);
		cp.getExperienceCleaner().selectByValue(experience);
		cp.getSubmitCleaner().click();
		@SuppressWarnings("deprecation")
		WebDriverWait w = new WebDriverWait(driver, 2);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void Privacy()
	{
		lp.getPrivacy().click();
	}
	
	@Test
	public void Terms()
	{
		lp.getTerms().click();
	}
	
	@Test
	public void ContactUs()
	{
		ContactUsPage cont = lp.getContactUs();
		cont.getName().sendKeys("Harmilap Sandhu");
		cont.getEmail().sendKeys("harmilapsandhu@gmail.com");
		cont.getMessage().sendKeys("We have not inherited Thulê from our Ancestors\r\n" + 
				"We have borrowed it from our Children");
		cont.getSubmit().click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getDataHomeOwner()
	{
		Object[][] data = new Object[3][5];
		data[0][0] = "Harmilap";
		data[0][1] = "Sandhu";
		data[0][2] = "harmil43sandhu@gmail.com";
		data[0][3] = "2111156131";
		data[0][4] = "condo";
		
		data[1][0] = "Bandhanjeet";
		data[1][1] = "Sidhu";
		data[1][2] = "2sid34bandhanjeet@gmail.com";
		data[1][3] = "3111231111";
		data[1][4] = "house";
		
		data[2][0] = "Andy";
		data[2][1] = "Khatter";
		data[2][2] = "2and23hatter@yahoo.com";
		data[2][3] = "4111451111";
		data[2][4] = "condo";
		
		return data;
		
	}
		
		@DataProvider
		public Object[][] getDataCleaner()
		{
			Object[][] dataCleaner = new Object[3][5];
			dataCleaner[0][0] = "Wayne";
			dataCleaner[0][1] = "Rooney";
			dataCleaner[0][2] = "3shrekballer@gmail.com";
			dataCleaner[0][3] = "4111111111";
			dataCleaner[0][4] = "Beginner";
			
			dataCleaner[1][0] = "Alex";
			dataCleaner[1][1] = "Ferguson";
			dataCleaner[1][2] = "3rednoserei2ndeer@gmail.com";
			dataCleaner[1][3] = "5111111121";
			dataCleaner[1][4] = "Intermediate";
			
			dataCleaner[2][0] = "Andy";
			dataCleaner[2][1] = "Khatter";
			dataCleaner[2][2] = "3andykhatte3r@yahoo.com";
			dataCleaner[2][3] = "6111111131";
			dataCleaner[2][4] = "Mastered";
			
			return dataCleaner;
	}
}


