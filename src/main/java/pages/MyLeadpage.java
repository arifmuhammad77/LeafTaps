package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadpage extends ProjectMethods {
	public MyLeadpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement createleads;

	public Createleadpage clickCreateleadbutton() {
		click(createleads);
		return new Createleadpage();
	}
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindleads;
	
	public Findpage clickFindleadbutton() {
		click(eleFindleads);
		return new Findpage();
	}
	@FindBy(how = How.LINK_TEXT, using = "Merge Leads")
	private WebElement elemerge;
	
	public MergeLeadpage clickmerge() {
		click(elemerge);
		return new MergeLeadpage();
	}
}
