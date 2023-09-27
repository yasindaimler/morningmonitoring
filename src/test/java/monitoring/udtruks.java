package monitoring;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POMForce.LoginPage;

import resourseforce.BaseForce;

public class udtruks extends BaseForce {
	
	
	WebDriver driver;
	Logger log;
	
	@Test
	public void VerifyUDTruks () throws IOException, InterruptedException {
		
		log = LogManager.getLogger(PartsIntegration.class.getName());
		logger = extentReport.createTest("Verify UDTruks");
		logger.assignCategory("<b>UdTruks</b>");
		log.debug("Browser got launched");
		
		driver = installdriver();
		driver.get(prop.getProperty("udturl"));
		log.debug("Navigated to application URL");
		LoginPage login = new LoginPage(driver);
		login.UserNameField().sendKeys(prop.getProperty("udtusername"));
		login.PasswordField().sendKeys(prop.getProperty("udtpassword"));
		login.LoginButton().click();
		log.debug("Login successful");
		Reporter.log("Login Successful");
		Thread.sleep(2000);
		String actualtext = driver.getTitle();
		
		System.out.println(actualtext);
		String expectedtext ="Parts_Catalogue";
		
		AssertJUnit.assertEquals(actualtext, expectedtext);
		
		if (actualtext.equalsIgnoreCase(expectedtext)) {
			System.out.println("UDTruks Workingfine");
		}else {
			System.out.println("UDTruks Not Working");
		}
		
	
		logger.log(Status.INFO, "<b>UDTruks Workingfine</b>");
		Reporter.log("UDTruks Workingfine");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
