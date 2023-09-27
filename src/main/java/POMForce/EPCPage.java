package POMForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EPCPage {
	


	WebDriver driver;

	public EPCPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "vtype")
	private WebElement vtypeField;

	public WebElement vtypeField() {

		return vtypeField;

	}

	@FindBy(id = "lblPNCsrchpopup")
	private WebElement lblPNCsrchpopupField;

	public WebElement lblPNCsrchpopupField() {

		return lblPNCsrchpopupField;

	}

	@FindBy(id = "epc_result_history")
	private WebElement epc_result_historyField;

	public WebElement epc_result_historyField() {

		return epc_result_historyField;

	}

	@FindBy(id = "addtoCartBOM")
	private WebElement addtoCartBOMField;

	public WebElement addtoCartBOMField() {

		return addtoCartBOMField;

	}

	@FindBy(id = "add_cart")
	private WebElement add_cartField;

	public WebElement add_cartField() {

		return add_cartField;

	}

	@FindBy(id = "drpExportName")
	private WebElement drpExportNameField;

	public WebElement drpExportNameField() {

		return drpExportNameField;

	}

	@FindBy(id = "txtAreaPNC")
	private WebElement txtAreaPNCField;

	public WebElement txtAreaPNCField() {

		return txtAreaPNCField;

	}

	@FindBy(id = "txtAreaPartNo")
	private WebElement txtAreaPartNoField;

	public WebElement txtAreaPartNoField() {

		return txtAreaPartNoField;

	}

	@FindBy(id = "txtdesc")
	private WebElement txtdescField;

	public WebElement txtdescField() {

		return txtdescField;

	}

	@FindBy(id = "btnclearPNCSearch")
	private WebElement btnclearPNCSearchField;

	public WebElement btnclearPNCSearchField() {

		return btnclearPNCSearchField;

	}

	@FindBy(id = "chassislabel")
	private WebElement chassislabelField;

	public WebElement chassislabelField() {

		return chassislabelField;

	}

	@FindBy(xpath = "//*[@id=\"contwindow\"]/div[1]/div/div[1]/div/ul[2]/li/button[7]")
	private WebElement DownloadField;

	public WebElement DownloadField() {

		return DownloadField;

	}
	
	@FindBy(xpath = "//*[@id=\"partdetdownload\"]/div/div/div[3]/div/input")
	private WebElement DownloadpopupField;

	public WebElement DownloadpopupField() {

		return DownloadpopupField;

	}
	
	@FindBy(id = "epc_result_history")
	private WebElement epcresulthistoryField;

	public WebElement epcresulthistoryField() {

		return epcresulthistoryField;

	}
	
	@FindBy(id = "add_cart")
	private WebElement addcartField;

	public WebElement addcartField() {

		return addcartField;

	}
	
	@FindBy(id = "addtoCartBOM")
	private WebElement addtoCartBOMField1;

	public WebElement addtoCartBOMField1() {

		return addtoCartBOMField;

	}
	
	
	@FindBy(xpath = "//*[@id=\"myModal1\"]/div/div/div[2]/div/div[1]/div/ul[2]/li[2]/a[1]")
	private WebElement viewcartdownloadField;

	public WebElement viewcartdownloadField() {

		return viewcartdownloadField;

	}
	
	
	@FindBy(id = "fixed-form-container")
	private WebElement MyCartField;

	public WebElement MyCartField() {

		return MyCartField;

	}
	
	@FindBy(id = "txtAlertsubmit")
	private WebElement AlertpopupOKField;

	public WebElement AlertpopupOKField() {

		return AlertpopupOKField;

	}
	
	@FindBy(xpath = "//*[@id=\"rppopup\"]/div/div/div[2]/div[2]/input")
	private WebElement RPaddCartField;

	public WebElement RPaddCartField() {

		return RPaddCartField;

	}
	
	@FindBy(xpath = "//*[@id=\"rppopup\"]/div/div/div[1]/div")
	private WebElement RPpopupCloseField;

	public WebElement RPpopupCloseField() {

		return RPpopupCloseField;

	}
	
	@FindBy(xpath = "//*[@id=\"partdetdownload\"]/div/div/div[1]/div")
	private WebElement DownloadpopupCloseField;

	public WebElement DownloadpopupCloseField() {

		return DownloadpopupCloseField;

	}
	
	@FindBy(id = "btn_interlink")
	private WebElement btn_interlinkField;

	public WebElement btn_interlinkField() {

		return btn_interlinkField;

	}
	
	@FindBy(xpath = "//*[@id=\"myModal1\"]/div/div/div[1]/div")
	private WebElement ViewCartCloseField;

	public WebElement ViewCartCloseField() {

		return ViewCartCloseField;

	}



}
