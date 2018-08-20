package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadpagefordupilcate extends ProjectMethods {
	public ViewLeadpagefordupilcate() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement duplicate;

	public Duplicatesubmit Clickduplicatebutton() {
		click(duplicate);
		return new Duplicatesubmit();
	}
	
}
