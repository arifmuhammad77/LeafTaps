package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC005";
		testDescription = "duplicating leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName = "TC005";
	}
	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd,String email ) throws Throwable {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrm()
		.clickleads()
		.clickFindleadbutton()
		.clickleadEmail()
		.typeleademailaddress(email)
		.clickfindemailbutton()
		.clickfindeid()
		.Clickduplicatebutton()
		.Clickcreatebutton()
		.closeBrowser();
}
	}
