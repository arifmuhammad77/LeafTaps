package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Viewleadpage extends ProjectMethods{
	
	
	public Viewleadpage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how = How.LINK_TEXT, using = "Delete")
	private WebElement createbutton;

	public Findpage clickdeletebutton() {
		click(createbutton);
		return new Findpage();
	}
	@FindBy(how = How.XPATH, using = "//div[text()='No records to display']")
	private WebElement clkverify;

	public Viewleadpage verifyerrormgs(String data) {
		verifyPartialText(clkverify, text);
		return this;
	}

	@Override
	public void closeBrowser() {
		super.closeBrowser();
	}


}
