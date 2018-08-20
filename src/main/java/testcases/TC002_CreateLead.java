package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC002";
		testDescription = "Login to LeafTaps";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName = "TC002";

	}

	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd, String cName, String fName, String lName) {
		new LoginPage().typeUserName(uName).typePassword(pwd).clickLogin().clickCrm().clickleads()
				.clickCreateleadbutton().typecreateleadform(cName).typecreateleadfname(fName)
				.typecreateleadlname(lName).clicksubmit();
		// .clickLogOut();
	}
}
