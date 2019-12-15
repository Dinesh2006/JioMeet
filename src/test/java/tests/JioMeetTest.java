package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pageObjects.PgJioMeet;

import resources.BaseTest;
import resources.ExcelUtility;

public class JioMeetTest extends BaseTest{

	@Test
	public void Login() throws IOException, InterruptedException
	{
		String nameofCurrMethod = new Object() {} .getClass().getEnclosingMethod().getName();
		ExcelUtility util=new ExcelUtility();
		ArrayList<String> data=util.getData(nameofCurrMethod);
		driver.get(prop.getProperty("url"));
		PgJioMeet l=new PgJioMeet(driver,test);
		l.enterUsername(data.get(1));
		l.enterPassword(data.get(2));
		l.clickLoginBtn();
	}
		


	@Test 
	public void LoginError() throws IOException, InterruptedException {
		String nameofCurrMethod = new Object() {} .getClass().getEnclosingMethod().getName();
		ExcelUtility util=new ExcelUtility();
		ArrayList<String> data=util.getData(nameofCurrMethod);
		driver.get(prop.getProperty("url"));
		PgJioMeet l=new PgJioMeet(driver,test);
		l.enterUsername(data.get(1));
		l.enterPassword(data.get(2));
		l.clickLoginBtn();
		l.verifyErrorMsg();
	}
	
	@Test 
	public void ManageAddUser() throws IOException, InterruptedException {
		String nameofCurrMethod = new Object() {} .getClass().getEnclosingMethod().getName();
		ExcelUtility util=new ExcelUtility();
		ArrayList<String> data=util.getData(nameofCurrMethod);
		driver.get(prop.getProperty("url"));
		PgJioMeet l=new PgJioMeet(driver,test);
		l.enterUsername(data.get(1));
		l.enterPassword(data.get(2));
		l.clickLoginBtn();
		l.verifyWelcomeMessage();
		l.clickManageUserTab();
		l.AddUserTab(data.get(3),data.get(4),data.get(5));
	
		l.AddUserTab1(data.get(6),data.get(7),data.get(8));
	
		l.clickCreateUser();
		l.DeleteUser();
		l.EditUser(data.get(9),data.get(10));
		l.GetNumberOfuser();
		l.clickDashBoard();
		l.GetAccountStatus();
		
		
	}
	
	@Test 
	public void ManageVideoUser() throws IOException, InterruptedException {
		String nameofCurrMethod = new Object() {} .getClass().getEnclosingMethod().getName();
		ExcelUtility util=new ExcelUtility();
		ArrayList<String> data=util.getData(nameofCurrMethod);
		driver.get(prop.getProperty("url"));
		PgJioMeet l=new PgJioMeet(driver,test);
		l.enterUsername(data.get(1));
		l.enterPassword(data.get(2));
		l.clickLoginBtn();
		l.verifyWelcomeMessage();
		l.clickManageVideoRoomTab(data.get(11),data.get(12));
		l.VideoDeleteUser();
		l.VideoEditUser(data.get(13),data.get(14));
		l.GetNumberOfuser();
		l.clickDashBoard();
		l.GetVideoStatus();
		
	}

	@Test 
	public void Report() throws IOException, InterruptedException {
		String nameofCurrMethod = new Object() {} .getClass().getEnclosingMethod().getName();
		ExcelUtility util=new ExcelUtility();
		ArrayList<String> data=util.getData(nameofCurrMethod);
		driver.get(prop.getProperty("url"));
		PgJioMeet l=new PgJioMeet(driver,test);
		l.enterUsername(data.get(1));
		l.enterPassword(data.get(2));
		l.clickLoginBtn();
		l.verifyWelcomeMessage();
		l.clickReportTab();
		l.reportdownload1();
		l.Validatefile("C:\\Users\\Dinesh\\Downloads\\user_list_15Dec19");
		l.reportdownload2();
		l.Validatefile("C:\\Users\\Dinesh\\Downloads\\Video_room_list_15Dec19");
		l.reportdownload3();
		l.Validatefile("C:\\Users\\Dinesh\\Downloads\\CallSummary_01Dec19_15Dec19");
		
		
		

}
	
	@Test 
	public void Sanity() throws IOException, InterruptedException {
		String nameofCurrMethod = new Object() {} .getClass().getEnclosingMethod().getName();
		ExcelUtility util=new ExcelUtility();
		ArrayList<String> data=util.getData(nameofCurrMethod);
		driver.get(prop.getProperty("url"));
		PgJioMeet l=new PgJioMeet(driver,test);
		l.enterUsername(data.get(1));
		l.enterPassword(data.get(2));
		l.clickLoginBtn();
		l.verifyWelcomeMessage();
		l.clickManageUserTab();
		l.AddUserTab(data.get(3),data.get(4),data.get(5));
		l.AddUserTab1(data.get(6),data.get(7),data.get(8));
		l.clickCreateUser();
		l.clickManageVideoRoomTab(data.get(11),data.get(12));
		l.clickReportTab();
		l.reportdownload1();
		l.reportdownload2();
		l.reportdownload3();
		l.Logout();
		
		
}}