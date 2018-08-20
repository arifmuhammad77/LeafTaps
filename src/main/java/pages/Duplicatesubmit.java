package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Duplicatesubmit extends ProjectMethods {
	public Duplicatesubmit() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@class='smallSubmit']")
	private WebElement createbutton;

	public Duplicatesubmit Clickcreatebutton() {
		click(createbutton);
		return new Duplicatesubmit();
	}

	@Override
	public void closeBrowser() {
		super.closeBrowser();
	}
}
