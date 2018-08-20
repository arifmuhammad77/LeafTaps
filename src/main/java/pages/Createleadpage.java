package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Createleadpage extends ProjectMethods {
	public Createleadpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement createleadform;

	public Createleadpage typecreateleadform(String data) {
		type(createleadform, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement createleadfname;

	public Createleadpage typecreateleadfname(String data) {
		type(createleadfname, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement createleadlname;

	public Createleadpage typecreateleadlname(String data) {
		type(createleadlname, data);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement submit;

	public Viewleadpage clicksubmit() {
		click(submit);
		return new Viewleadpage();
	}
}
