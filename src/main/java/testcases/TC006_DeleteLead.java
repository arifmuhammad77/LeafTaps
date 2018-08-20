package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Viewleadpage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC006_Deletelead";
		testDescription = "deleting leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName = "TC006";
	}
	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd,String phnumber,String data ) throws Throwable {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrm()
		.clickleads()
		.clickFindleadbutton()
		.clickphonenumbertab()
		.typePhonenum(phnumber)
		.clickfindphonebutton()
		.getIDText()
		.clickfindphonenumber()
		.clickdeletebutton()
		.clickfindphonebutton()
		.clickFlead()
		.typegetid(text)
		.clickFlead();
		new Viewleadpage().verifyerrormgs(data);
			}
	}