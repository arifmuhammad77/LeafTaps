package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC004";
		testDescription = "Merginging leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName = "TC004";

	}

	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd,String fname, String lname) throws Throwable {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrm()
		.clickleads()
		.clickmerge()
		.clickgif1()
        .typefirstname(fname)
		.clickfbutton()
		.clickID()
		.clickgif2()
		.type2ndfirstname(lname)
		.clickbutton2()
		.clickID2()
		.clickMergebutton3()
		.acceptAlert();
}
	}
