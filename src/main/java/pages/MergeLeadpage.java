package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadpage extends ProjectMethods {
	public MergeLeadpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement elegif1;

	public Findleadswindow clickgif1() {
		click(elegif1);
		switchToWindow(1);
		return new Findleadswindow();
	}

	@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement elegif2;

	public Findleadswindow clickgif2() {
		click(elegif2);
		switchToWindow(1);
		return new Findleadswindow();
	}

	@FindBy(how = How.LINK_TEXT, using = "Merge")
	private WebElement mergebutton;

	public MergeLeadpage clickMergebutton3() throws Throwable {
		click(mergebutton);
		Thread.sleep(3000);
		return this;
	}

	@Override
	public void acceptAlert() {
		super.acceptAlert();
	}
}
