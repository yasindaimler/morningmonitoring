package POMForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"tab\"]/li[5]")
	private WebElement supportfield;
	
	public WebElement supportfield() {
		return  supportfield;
	}
	
	@FindBy(xpath="//*[@id=\"tab\"]/li[6]")
	private WebElement MultiAccessField;
	
	public WebElement MultiAccessField() {
		
		return MultiAccessField;
		
	}
	
	@FindBy(xpath="//*[@id=\"tab\"]/li[5]/ul/li[6]")
	private WebElement DIfield;
	
	public WebElement DIfield() {
		return  DIfield;
	}
	
	@FindBy(xpath="//*[@id=\"tab\"]/li[5]/ul/li[7]")
	private WebElement PTEfield;
	
	public WebElement PTEfield() {
		return  PTEfield;
	}
	
	@FindBy(xpath="//*[@id=\"tab\"]/li[5]/ul/li[8]")
	private WebElement Helpdeskfield;
	
	public WebElement Helpdeskfield() {
		return  Helpdeskfield;
	}
	
	@FindBy(xpath="//*[@id=\"tab\"]/li[5]/ul/li[9]")
	private WebElement Warrantyfield;
	
	public WebElement Warrantyfield() {
		return  Warrantyfield;
	}
	
	

}
