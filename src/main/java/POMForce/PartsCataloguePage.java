package POMForce;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartsCataloguePage {
	
WebDriver driver;
	
	public  PartsCataloguePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="txtChasisNoOne")
	private WebElement txtChasisNoOneField;
	
	public WebElement txtChasisNoOneField() {
		
		return txtChasisNoOneField;
		
	}
	
	@FindBy(id="txtChasisNoTwo")
	private WebElement txtChasisNoTwoField;
	
	public WebElement txtChasisNoTwoField() {
		
		return txtChasisNoTwoField;
		
	}
	
	@FindBy(id="rdvinService")
	private WebElement rdvinServiceField;
	
	public WebElement rdvinServiceField() {
		
		return rdvinServiceField;
		
	}
	
	@FindBy(id="txtVINno")
	private WebElement txtVINnoField;
	
	public WebElement txtVINnoField() {
		
		return txtVINnoField;
		
	}
	
	@FindBy(id="rdVModelService")
	private WebElement rdVModelServiceField;
	
	public WebElement rdVModelServiceField() {
		
		return rdVModelServiceField;
		
	}
	
	@FindBy(id="txtVModel")
	private WebElement txtVModelField;
	
	public WebElement txtVModelField() {
		
		return txtVModelField;
		
	}
	
	@FindBy(id="txtModelClassification")
	private WebElement txtModelClassificationField;
	
	public WebElement txtModelClassificationField() {
		
		return txtModelClassificationField;
		
	}
	
	@FindBy(id="txtAreaPNC")
	private WebElement txtAreaPNCField;
	
	public WebElement txtAreaPNCField() {
		
		return txtAreaPNCField;
		
	}
	
	@FindBy(id="txtAreaPartnumber")
	private WebElement txtAreaPartnumberField;
	
	public WebElement txtAreaPartnumberField() {
		
		return txtAreaPartnumberField;
		
	}
	
	@FindBy(id="txtMainGroup")
	private WebElement txtMainGroupField;
	
	public WebElement txtMainGroupField() {
		
		return txtMainGroupField;
		
	}
	
	@FindBy(id="txtSubGroup")
	private WebElement txtSubGroupField;
	
	public WebElement txtSubGroupField() {
		
		return txtSubGroupField;
		
	}
	
	@FindBy(id="txtPartDescription")
	private WebElement txtPartDescriptionField;
	
	public WebElement txtPartDescriptionField() {
		
		return txtPartDescriptionField;
		
	}
	
	@FindBy(id="idagg")
	private WebElement idaggField;
	
	public WebElement idaggField() {
		
		return idaggField;
		
	}
	
	@FindBy(id="idgrap")
	private WebElement idgrapField;
	
	public WebElement idgrapField() {
		
		return idgrapField;
		
	}
	
	@FindBy(name="tab4")
	private WebElement tab4Field;
	
	public WebElement tab4Field() {
		
		return tab4Field;
		
	}
	
	@FindBy(id="pagetext")
	private WebElement pagetextField;
	
	public WebElement pagetextField() {
		
		return pagetextField;
		
	}
	
	@FindBy(id="btnSelectEPC")
	private WebElement btnSelectEPCField;
	
	public WebElement btnSelectEPCField() {
		
		return btnSelectEPCField;
		
	}
	
	@FindBy(id="btnClearEPC")
	private WebElement btnClearEPCField;
	
	public WebElement btnClearEPCField() {
		
		return btnClearEPCField;
		
	}
	
	@FindBy(id="spn_notice_accept_btn")
	private WebElement AcceptField;
	
	public WebElement AcceptField() {
		
		return AcceptField;
		
	}
	
	@FindBy(id="add_cart")
	private WebElement add_cartField;
	
	public WebElement add_cartField() {
		
		return add_cartField;
		
	}
	
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li")
	private WebElement SubModulesField;
	
	public WebElement SubModulesField() {
		
		return SubModulesField;
		
	}
	
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[3]")
	private WebElement AVMField;
	
	public WebElement AVMField() {
		
		return AVMField;
		
	}
	
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[2]")
	private WebElement SPNField;
	
	public WebElement SPNField() {
		
		return SPNField;
		
	}
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[4]")
	private WebElement FVPField;
	
	public WebElement FVPField() {
		
		return FVPField;
		
	}
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[5]")
	private WebElement ReferenceField;
	
	public WebElement ReferenceField() {
		
		return ReferenceField;
		
	}
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[6]")
	private WebElement AccessoriesField;
	
	public WebElement AccessoriesField() {
		
		return AccessoriesField;
		
	}
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[7]")
	private WebElement CampaignField;
	
	public WebElement CampaignField() {
		
		return CampaignField;
		
	}
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[8]")
	private WebElement ModelComparisonField;
	
	public WebElement ModelComparisonField() {
		
		return ModelComparisonField;
		
	}
	
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[9]")
	private WebElement SBOMDownloadField;
	
	public WebElement SBOMDownloadField() {
		
		return SBOMDownloadField;
		
	}
	
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[10]")
	private WebElement AllMakePartsField;
	
	public WebElement AllMakePartsField() {
		
		return AllMakePartsField;
		
	}
	
	@FindBy(xpath ="//*[@id=\"contwindow\"]/div[1]/div/div/div[1]/ul[2]/li/div/ul/li/div/a[11]")
	private WebElement ReportField;
	
	public WebElement ReportField() {
		
		return ReportField;
		
	}
	
	@FindBy(id ="allmakeparts")
	private WebElement allmakepartsField;
	
	public WebElement allmakepartsField() {
		
		return allmakepartsField;
		
	}
	

}
