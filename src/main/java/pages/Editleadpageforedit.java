package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Editleadpageforedit extends ProjectMethods {
	public Editleadpageforedit() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	private WebElement elecname;

	public Editleadpageforedit typecname(String data) {
		type(elecname, data);
		return this;
	}
	@FindBy(how = How.ID, using = "updateLeadForm_firstName")
	private WebElement elefrname;

	public Editleadpageforedit typefrname(String data) {
		type(elefrname, data);
		return this;
	}
	@FindBy(how = How.ID, using = "updateLeadForm_firstName")
	private WebElement elelastname;

	public Editleadpageforedit typelastname(String data) {
		type(elelastname, data);
		return this;
	}
	@FindBy(how = How.XPATH, using = "(//input[@class='smallSubmit'])[1]")
	private WebElement elesubmit;

	public Editleadpageforedit clicksubmit() {
		click(elesubmit);
		return this;
	}
}
