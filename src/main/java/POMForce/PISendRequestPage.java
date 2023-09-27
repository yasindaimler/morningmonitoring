package POMForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PISendRequestPage {
	
	
	WebDriver driver;
	
	public PISendRequestPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="txtsiebel")
	private WebElement txtsiebelField;
	
	public WebElement txtsiebelField() {
		
		return txtsiebelField;
		
	}
	
	
	@FindBy(id="txtShortId")
	private WebElement txtShortIdField;
	
	public WebElement txtShortIdField() {
		
		return txtShortIdField;
		
	}
	
	@FindBy(id="txtUId")
	private WebElement txtUIdField;
	
	public WebElement txtUIdField() {
		
		return txtUIdField;
		
	}
	
	@FindBy(id="txtPassword")
	private WebElement txtPasswordField;
	
	public WebElement txtPasswordField() {
		
		return txtPasswordField;
		
	}
	
	@FindBy(id="Vin_Number")
	private WebElement Vin_NumberField;
	
	public WebElement Vin_NumberField() {
		
		return Vin_NumberField;
		
	}
	
	@FindBy(id="txtCode")
	private WebElement txtCodeField;
	
	public WebElement txtCodeField() {
		
		return txtCodeField;
		
	}
	
	@FindBy(id="btnexport")
	private WebElement btnexportField;
	
	public WebElement btnexportField() {
		
		return btnexportField;
		
	}
	

}
