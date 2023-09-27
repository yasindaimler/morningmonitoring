package monitoring;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


import POMForce.HomePage;
import POMForce.LoginPage;
import POMForce.MarketPage;
import resourseforce.BaseForce;
import resourseforce.sendemail;


public class HelpdeskTools  extends BaseForce{
	
	public WebDriver driver;

	Logger log;
	
	@BeforeClass
	public void login() throws IOException, InterruptedException {
		
		log = LogManager.getLogger(HelpdeskTools.class.getName());
		
		driver = installdriver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
		LoginPage login = new LoginPage(driver);
		login.UserNameField().sendKeys(prop.getProperty("username"));
		login.PasswordField().sendKeys(prop.getProperty("password"));
		login.LoginButton().click();
		log.debug("Login successful");
		Reporter.log("Login Successful");

		MarketPage market = new MarketPage(driver);
		market.asiaField().click();
		log.debug("Asia Region Selected");
		Reporter.log("Asia Market Selected");
		Reporter.log("Ascent Application Workingfine");
		Thread.sleep(3000);

		
	}
	
	@Test(priority = 1)
	public void VerifyDiagnosticTool() throws InterruptedException {
		
		logger = extentReport.createTest("Verify Diagnostic Tool");
		logger.assignCategory("Diagnostic Tool");
		
		HomePage hp = new HomePage(driver);
		hp.supportfield().click();
		Thread.sleep(2000);
		hp.DIfield().click();
		Thread.sleep(3000);
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			itr.next();

			String Childwindow = itr.next();
			driver.switchTo().window(Childwindow);
		
		Thread.sleep(3000);
		driver.findElement(By.id("txtdiDetails")).sendKeys("Text");
		String actualPartText = driver.findElement(By.xpath("//*[@id=\"alform\"]/div/div/div/div[1]/div[1]/h3")).getText();
		String expectedPartText = "Raise Ticket";

		AssertJUnit.assertEquals(actualPartText, expectedPartText);
		
		WebElement raiseticket = driver.findElement(By.xpath("//*[@id=\"alform\"]/div/div/div/div[1]/div[1]/h3"));
		if(raiseticket.isDisplayed()) {
			System.out.println("Diganostic Tool Open Workingfine");
		}else {
			System.out.println("Diganostic Tool not Opened");
		}
		logger.log(Status.INFO, "<b>Diganostic Tool Open Workingfine</b>");
		Reporter.log("Diganostic Tool Open Workingfine");
		driver.close();
		
	}
		driver.switchTo().window(parentwindow);
		
		
	}
	
	@Test(priority = 2)
	public void VerifyPartsEngineeringTool () throws InterruptedException {
		
		logger = extentReport.createTest("Verify Parts Engineering Tool");
		logger.assignCategory("<b>Parts Engineering Tool</b>");
		
		HomePage hp = new HomePage(driver);
		hp.supportfield().click();
		Thread.sleep(2000);
		hp.PTEfield().click();
		Thread.sleep(3000);
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(4000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			itr.next();

			String Childwindow = itr.next();
			driver.switchTo().window(Childwindow);
		
		Thread.sleep(3000);
		driver.findElement(By.id("txtpeproblem")).sendKeys("Text");
		String actualPartText = driver.findElement(By.xpath("//*[@id=\"alform\"]/div/div/div/div[1]/div[1]/h3")).getText();
		String expectedPartText = "Raise Ticket";

		AssertJUnit.assertEquals(actualPartText, expectedPartText);
		
		WebElement raiseticket = driver.findElement(By.xpath("//*[@id=\"alform\"]/div/div/div/div[1]/div[1]/h3"));
		if(raiseticket.isDisplayed()) {
			System.out.println("Parts Engineering Tool Open Workingfine");
		}else {
			System.out.println("Parts Engineering Tool not Opened");
		}
		logger.log(Status.INFO, "<b>Parts Engineering Tool Open Workingfine</b>");
		Reporter.log("Parts Engineering Tool Open Workingfine");
		driver.close();
		
	}
		driver.switchTo().window(parentwindow);
		
		
	}
	
	@Test(priority = 3)
	public void VerifyHelpdeskTool() throws InterruptedException {

		logger = extentReport.createTest("Verify Helpdesk Tool");
		logger.assignCategory("<b>Helpdesk Tool");
		
		HomePage hp = new HomePage(driver);
		hp.supportfield().click();
		Thread.sleep(2000);
		hp.Helpdeskfield().click();
		Thread.sleep(3000);
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			itr.next();

			String Childwindow = itr.next();
			driver.switchTo().window(Childwindow);
		
		Thread.sleep(3000);
		
		String actualPartText = driver.findElement(By.xpath("//*[@id=\"tblhistory\"]/tbody/tr[1]/td[1]")).getText();
		String expectedPartText = "SR#/HD/ASIA/JAP/40050";

		AssertJUnit.assertEquals(actualPartText, expectedPartText);
		
		WebElement TicketNumber = driver.findElement(By.xpath("//*[@id=\"tblhistory\"]/tbody/tr[1]/td[1]"));
		if(TicketNumber.isDisplayed()) {
			System.out.println("Helpdesk Tool Open Workingfine");
		}else {
			System.out.println("Helpdesk Tool not Opened");
		}
		logger.log(Status.INFO, "<b>Helpdesk Tool Open Workingfine</b>");
		Reporter.log("Helpdesk Tool Open Workingfine");
		driver.close();
		
	}
		driver.switchTo().window(parentwindow);
	}
	
	@Test(priority = 4)
	public void VerifyWarrantyTool() throws InterruptedException {
		
		logger = extentReport.createTest("Verify Warranty Tool");
		logger.assignCategory("<b>Warranty Tool");
		
		HomePage hp = new HomePage(driver);
		hp.supportfield().click();
		Thread.sleep(2000);
		hp.Warrantyfield().click();
		Thread.sleep(4000);
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			itr.next();

			String Childwindow = itr.next();
			driver.switchTo().window(Childwindow);
		
		Thread.sleep(4000);
		driver.findElement(By.id("txtremarks")).sendKeys("Text");
		String actualPartText = driver.findElement(By.xpath("//*[@id=\"alform\"]/div/div/div/div/div[1]/h3")).getText();
		String expectedPartText = "Request";

		AssertJUnit.assertEquals(actualPartText, expectedPartText);
		
		WebElement raiseticket = driver.findElement(By.xpath("//*[@id=\"alform\"]/div/div/div/div/div[1]/h3"));
		if(raiseticket.isDisplayed()) {
			System.out.println("Warranty Tool Open Workingfine");
		}else {
			System.out.println("Warranty Tool not Opened");
		}
		logger.log(Status.INFO, "<b>Warranty Tool Open Workingfine</b>");
		Reporter.log("Warranty Tool Open Workingfine");
		driver.close();
		
	}
		driver.switchTo().window(parentwindow);
		
	}
	
	@AfterClass
	public void close() throws Exception {
		
		driver.close();
		/*EmailUtils emaiilutils = new EmailUtils();
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\YASINMO\\Desktop\\Automation\\morningmonitoring\\src\\main\\java\\resourseforce\\Gmail.properties"));
		List<String> attachments = new ArrayList<>();
		attachments.add("C:\\Users\\YASINMO\\Desktop\\Automation\\morningmonitoring\\test-output\\emailable-report.html");
		emaiilutils.sendUsingGmail(prop, "Ascent Live and Helpdesktools Test execution Result", "Dear Manju, Kindly find the attached monitoring Report", attachments);
	*/
		//sendemail.sendmail();
	}
	

}
