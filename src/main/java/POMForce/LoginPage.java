package POMForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(id="txtUserName")
	private WebElement UserNameField;
	
	public WebElement UserNameField() {
		
		return UserNameField;
		
	}
	
	@FindBy(id="txtpassword")
	private WebElement PasswordField;
	
	public WebElement PasswordField() {
		
		return PasswordField;
		
		
	}
	
	@FindBy(id="btnLogin")
	private WebElement LoginButton;
	
	public WebElement LoginButton() {
		
		return LoginButton;
		
	}


}
