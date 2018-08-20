package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "Editing leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName = "TC003";

	}

	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd, String Fname, String cName,String frname, String lastname) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrm()
		.clickleads()
		.clickFindleadbutton()
		.typeFname(Fname)
		.clickFlead()
		.clickleadID()
		.clickedits()
		.typecname(cName)
		.typefrname(frname)
		.typelastname(lastname)
		.clicksubmit();
	}
}
