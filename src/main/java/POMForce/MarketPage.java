package POMForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPage {
	

	
	
WebDriver driver;
	
	public  MarketPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="africa")
	private WebElement africaField;
	
	public WebElement africaField() {
		
		return africaField;
		
	}
	
	@FindBy(id="nafta")
	private WebElement naftaField;
	
	public WebElement naftaField() {
		
		return naftaField;
		
	}
	
	@FindBy(id="russia")
	private WebElement russiaField;
	
	public WebElement russiaField() {
		
		return russiaField;
		
	}
	
	@FindBy(id="latinamerica")
	private WebElement latinamericaField;
	
	public WebElement latinamericaField() {
		
		return latinamericaField;
		
	}
	
	@FindBy(id="oceania")
	private WebElement oceaniaField;
	
	public WebElement oceaniaField() {
		
		return oceaniaField;
		
	}
	
	@FindBy(id="me")
	private WebElement meField;
	
	public WebElement meField() {
		
		return meField;
		
	}
	
	@FindBy(id="asia")
	private WebElement asiaField;
	
	public WebElement asiaField() {
		
		return asiaField;
		
	}
	
	@FindBy(id="europe")
	private WebElement europeField;
	
	public WebElement europeField() {
		
		return europeField;
		
	}
	
	@FindBy(id="regionpartn")
	private WebElement regionpartnField;
	
	public WebElement regionpartnField() {
		
		return regionpartnField;
		
	}



}
