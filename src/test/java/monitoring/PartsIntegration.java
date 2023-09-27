package monitoring;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POMForce.EPCPage;
import POMForce.PISendRequestPage;
import POMForce.PartsCataloguePage;
import resourseforce.BaseForce;

public class PartsIntegration extends BaseForce{
	
	
	WebDriver driver;
	Logger log;
	
	@Test(priority = 1)
	public void VerifyForceAscent () throws IOException, InterruptedException {
		
		
		log = LogManager.getLogger(PartsIntegration.class.getName());
		logger = extentReport.createTest("Verify Force Ascent");
		logger.assignCategory("<b>Force Ascent</b>");
		
		driver = installdriver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("forceurl"));
		log.debug("Navigated to application URL");
		PISendRequestPage requestpage = new PISendRequestPage(driver);
		requestpage.txtsiebelField().sendKeys(prop.getProperty("siebelid"));
		requestpage.txtShortIdField().sendKeys(prop.getProperty("shortid"));
		requestpage.txtUIdField().sendKeys(prop.getProperty("uid"));
		requestpage.txtPasswordField().sendKeys(prop.getProperty("forcepassword"));
		requestpage.btnexportField().click();
		log.debug("Login successful");
		Reporter.log("Login Successful");
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			itr.next();

			String Childwindow = itr.next();
			driver.switchTo().window(Childwindow);
			Thread.sleep(3000);
			WebElement elements = driver.findElement(By.id("spn_notice_accept_btn"));
			if (elements.isDisplayed()) {
				elements.click();
			} else {
				System.out.println("Accept Button Not Found");
			}
			Thread.sleep(3000);
			PartsCataloguePage pc = new PartsCataloguePage(driver);
			pc.txtChasisNoOneField().sendKeys("FEC90");
			pc.txtChasisNoTwoField().sendKeys("0500007");
			pc.btnSelectEPCField().click();

			EPCPage epc = new EPCPage(driver);
			
			driver.findElement(By.xpath("//*[@id=\"idMainGroup_11\"]/div[1]")).click();
			driver.findElement(By.id("SubAgg11.110")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"bom_row_0\"]/td[2]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"bom_row_1\"]/td[2]/input")).click();
			epc.addtoCartBOMField().click();
			Thread.sleep(3000);
			epc.AlertpopupOKField().click();
			driver.findElement(By.xpath("//*[@id=\"add_cart\"]/a/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnSendtoForce")).click();
			Thread.sleep(2000);
			
			boolean closebutton = driver.findElement(By.id("txtAlertsubmit1")).isDisplayed();
			AssertJUnit.assertTrue(closebutton);
			
			WebElement closeapplication = driver.findElement(By.id("txtAlertsubmit1"));
			if (closeapplication.isDisplayed()) {
				closeapplication.click();
				System.out.println("Close Application Displayed Force Ascent Working Fine");
			} else {
				System.out.println("Force Ascent Not Working");
			}
			

			logger.log(Status.INFO, "<b>Close Application Displayed FDP Ascent Working Fine</b>");
			Reporter.log("Close Application Displayed FDP Ascent Working Fine");
		}

		driver.switchTo().window(parentwindow);
		driver.close();

		
	}
	
	
	@Test(priority = 2)
	public void VerifyfdpAscent() throws InterruptedException, IOException {
		

		log = LogManager.getLogger(HelpdeskTools.class.getName());
		logger = extentReport.createTest("Verify FDP Ascent");
		logger.assignCategory("<b>FDP Ascent</b>");
		
		driver = installdriver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("fdpurl"));
		log.debug("Navigated to application URL");
		PISendRequestPage requestpage = new PISendRequestPage(driver);
		requestpage.txtsiebelField().sendKeys(prop.getProperty("fdpsiebelid"));
		requestpage.txtShortIdField().sendKeys(prop.getProperty("fdpshortid"));
		requestpage.txtUIdField().sendKeys(prop.getProperty("fdpuid"));
		requestpage.txtPasswordField().sendKeys(prop.getProperty("fdppassword"));
		requestpage.btnexportField().click();
		log.debug("Login successful");
		Reporter.log("Login Successful");
		
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			itr.next();

			String Childwindow = itr.next();
			driver.switchTo().window(Childwindow);
			Thread.sleep(3000);
			WebElement elements = driver.findElement(By.id("spn_notice_accept_btn"));
			if (elements.isDisplayed()) {
				elements.click();
			} else {
				System.out.println("Accept Button Not Found");
			}
			Thread.sleep(3000);
			PartsCataloguePage pc = new PartsCataloguePage(driver);
			pc.txtChasisNoOneField().sendKeys("FEC90");
			pc.txtChasisNoTwoField().sendKeys("0500007");
			pc.btnSelectEPCField().click();

			EPCPage epc = new EPCPage(driver);
			
			driver.findElement(By.xpath("//*[@id=\"idMainGroup_11\"]/div[1]")).click();
			driver.findElement(By.id("SubAgg11.110")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"bom_row_0\"]/td[2]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"bom_row_1\"]/td[2]/input")).click();
			epc.addtoCartBOMField().click();
			Thread.sleep(3000);
			epc.AlertpopupOKField().click();
			driver.findElement(By.xpath("//*[@id=\"add_cart\"]/a/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("btnSendtoForce")).click();
			Thread.sleep(2000);
			
			boolean closebutton = driver.findElement(By.id("txtAlertsubmit1")).isDisplayed();
			AssertJUnit.assertTrue(closebutton);
			
			WebElement closeapplication = driver.findElement(By.id("txtAlertsubmit1"));
			if (closeapplication.isDisplayed()) {
				closeapplication.click();
				System.out.println("Close Application Displayed FDP Ascent Working Fine");
			} else {
				System.out.println("FDP Ascent Not Working");
			}
			logger.log(Status.INFO, "<b>Close Application Displayed FDP Ascent Working Fine</b>");
			Reporter.log("Close Application Displayed FDP Ascent Working Fine");

		}

		driver.switchTo().window(parentwindow);
		driver.close();
	}
	
	
	
	

}
