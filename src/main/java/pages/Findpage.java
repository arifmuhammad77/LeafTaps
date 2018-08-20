package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Findpage extends ProjectMethods {
	public Findpage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(how=How.XPATH,using="//input[@name='id']")
private WebElement getid;
public Findpage typegetid(String data) {
	type(getid, text);
	return this;
}
	@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")
	private WebElement eleFirstname;

	public Findpage typeFname(String data) {
		type(eleFirstname, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleFlead;

	public Findpage clickFlead() {
		click(eleFlead);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleleadId;

	public ViewLeadpageforedit clickleadID() {
		click(eleleadId);
		return new ViewLeadpageforedit();
	}

	// <----------------------------------------------------------------------------------------------duplicate
	// lead-------------------------------------------------------------------------------------------------------->//

	@FindBy(how = How.XPATH, using = "//span[text()='Email']")
	private WebElement eleemail;

	public Findpage clickleadEmail() {
		click(eleemail);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='emailAddress']")
	private WebElement eleemailaddress;

	public Findpage typeleademailaddress(String data) {
		type(eleemailaddress, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//button[@class='x-btn-text'])[7]")
	private WebElement findbut;

	public Findpage clickfindemailbutton() throws Throwable {
		click(findbut);
		Thread.sleep(3000);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[9]/a")
	private WebElement findeid;

	public ViewLeadpagefordupilcate clickfindeid() {
		click(findeid);
		return new ViewLeadpagefordupilcate();
	}

	// <----------------------------------------------------------------------deletepage---------------------------------------------------------------------------->//
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	private WebElement pnumber;

	public Findpage clickphonenumbertab() {
		click(pnumber);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']")
	private WebElement phnumber;

	public Findpage typePhonenum(String data) {
		type(phnumber, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement findbutton;

	public Findpage clickfindphonebutton() throws Throwable {
		click(findbutton);
		Thread.sleep(3000);	
		return this;
	}
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement getidtext;

	public Findpage getIDText() {
		text = getidtext.getText();
		System.out.println(text);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement findphone;

	public Viewleadpage clickfindphonenumber() {
		click(findphone);
		return new Viewleadpage();
	}
}
