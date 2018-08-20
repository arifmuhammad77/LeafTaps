package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadpageforedit extends ProjectMethods {
	public ViewLeadpageforedit() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Edit")
	private WebElement eleedit;

	public Editleadpageforedit clickedits() {
		click(eleedit);
		return new Editleadpageforedit();
	}

}
