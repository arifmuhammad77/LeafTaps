package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Findleadswindow extends ProjectMethods {
	public Findleadswindow() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement elefirstname;

	public Findleadswindow typefirstname(String data) {
		type(elefirstname, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//button[@class='x-btn-text'])[1]")
	private WebElement elefbutton;

	public Findleadswindow clickfbutton() throws Throwable {
		click(elefbutton);
		Thread.sleep(3000);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1])")
	private WebElement eleID;

	public MergeLeadpage clickID() {
		click(eleID);
		switchToWindow(0);
		return new MergeLeadpage();
	}

	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private WebElement ele2ndname;

	public Findleadswindow type2ndfirstname(String data) {
		type(ele2ndname, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//button[@class='x-btn-text'])[1]")
	private WebElement button2;

	public Findleadswindow clickbutton2() throws Throwable {
		click(button2);
		Thread.sleep(3000);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1])")
	private WebElement eleID2;

	public MergeLeadpage clickID2() {
		click(eleID2);
		switchToWindow(0);
		return new MergeLeadpage();
	}
}