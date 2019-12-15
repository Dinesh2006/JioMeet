package pageObjects;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import resources.BaseTest;
import resources.ExtentReporterNG;


import org.openqa.selenium.support.FindBy;

public class PgJioMeet {


	public WebDriver driver;
	public ExtentTest test;
	public static Logger log =LogManager.getLogger(BaseTest.class.getName());
	WebDriverWait wait;
	int userNumber;

	public PgJioMeet(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,30);
	}

	// login page xpaths

	@FindBy(xpath="//input[@id='email']")
	WebElement btn_email;

	@FindBy(xpath="//input[@id='password']")
	WebElement btn_Password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_Login;

	@FindBy(xpath="//div[@id='toast-container']")
	WebElement ErrorMsg;

	// Welcome message on Home page top right corner for succesfully login

	@FindBy(xpath="//div[@class='welcome-text text-black-50']")
	WebElement txt_WelcomeMSG;

    // Logout 
	@FindBy(xpath="//a[text()='Logout']")
	WebElement btn_Logout;

	// Tabs  on homepage
	@FindBy(xpath="//a[@href='/adminportal/manage-users']")
	WebElement tab_ManageUser;

	@FindBy(xpath="//a[@href='/adminportal/manage-rooms']")
	WebElement tab_videorooms;

	@FindBy(xpath="//a[@href='/adminportal/report']")
	WebElement tab_Report;

	// Report Tab Download files
	@FindBy(xpath="(//button[@class='bg-white border-0'])[1]")
	WebElement ReportDwnld1;

	@FindBy(xpath="(//button[@class='bg-white border-0'])[2]")
	WebElement ReportDwnld2;

	@FindBy(xpath="(//button[@class='bg-white border-0'])[3]")
	WebElement ReportDwnld3;

	@FindBy(xpath="(//button[@class='btn btn-primary border rounded ng-star-inserted'])[1]")
	WebElement btn_UsageReportDwnld;


	//Manage User Page Xpaths
	@FindBy(xpath="(//button[@class='btn border-primary rounded btn-primary py-1'])[1]")
	WebElement btn_adduser;

	@FindBy(xpath="(//button[@class='btn border-primary rounded btn-primary py-1'])[2]")
	WebElement btn_bulkupload;

	@FindBy(xpath="(//input[@id='float-input'])[1]")
	WebElement inputTxt_EnternameAddUser;

	@FindBy(xpath="(//input[@id='float-input'])[2]")
	WebElement inputTxt_EnterEmailAddUser;

	@FindBy(xpath="(//input[@id='float-input'])[3]")
	WebElement inputTxt_EnterMobNumAddUser;

	@FindBy(xpath="//button[text()=' Add row ']")
	WebElement btn_AddRow;

	@FindBy(xpath="(//input[@id='float-input'])[4]")
	WebElement inputTxt_EnternameAddUser1;

	@FindBy(xpath="(//input[@id='float-input'])[5]")
	WebElement inputTxt_EnterEmailAddUser1;

	@FindBy(xpath="(//input[@id='float-input'])[6]")
	WebElement inputTxt_EnterMobNumAddUser1;



	@FindBy(xpath="(//li[@class='ui-dropdown-item ui-corner-all'])//span[text()='Normal']")
	WebElement Dropdown_Role;


	@FindBy(xpath="(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[3]")
	WebElement Arrow_Role;

	@FindBy(xpath="(//span[@class='ui-dropdown-trigger-icon ui-clickable pi pi-chevron-down'])[4]")
	WebElement Arrow_Role1;

	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_CreateUser;

	@FindBy(xpath="(//div[@class='ui-helper-hidden-accessible']/parent::div)[2]")
	WebElement chkbox_DeleteUser;

	@FindBy(xpath="//button[@class='bg-white border-0 py-0 ng-star-inserted']")
	WebElement btn_Delete;

	@FindBy(xpath="//button[@class='btn btn-primary rounded mx-3']")
	WebElement btn_Delete1;


	@FindBy(xpath="//td[text()='Main admin 1']/..//button[text()=' Action ']")
	WebElement btn_ActionAdmin;

	@FindBy(xpath="//button[text()='Edit']")
	WebElement btn_ActionAdminEdit;


	@FindBy(xpath="(//h2[@class='count m-0 ng-star-inserted'])[3]")
	WebElement AccountStatus;

	@FindBy(xpath="//a[text()='Dashboard ']")
	WebElement Dashboard;

	@FindBy(xpath="//tbody[@class='ui-table-tbody']//tr")
	WebElement Numberofuser;

	@FindBy(xpath="//span[text()='Update Room']")
	WebElement Updateuser;





	//Manage Video Page Xpaths

	@FindBy(xpath="(//button[@class='btn border-primary rounded btn-primary py-1'])[1]")
	WebElement btn_adduserVideoRoom;

	@FindBy(xpath="(//button[@class='btn border-primary rounded btn-primary py-1'])[2]")
	WebElement btn_bulkuploadVideoRoom;

	@FindBy(xpath="(//input[@id='float-input'])[1]")
	WebElement inputTxt_EnternameVideoRoom;

	@FindBy(xpath="(//input[@id='float-input'])[2]")
	WebElement inputTxt_SIPVideoRoom;



	@FindBy(xpath="(//input[@id='float-input'])[3]")
	WebElement inputTxt_EnternameVideoRoom1;

	@FindBy(xpath="(//input[@id='float-input'])[4]")
	WebElement inputTxt_EnterEmailVideoRoom1;



	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_CreateRoomVideoRoom;

	@FindBy(xpath="(//div[@class='ui-helper-hidden-accessible']/parent::div)[2]")
	WebElement chkbox_DeleteUserVideoRoom;

	@FindBy(xpath="//button[@class='bg-white border-0 py-0 ng-star-inserted']")
	WebElement btn_MVDelete;


	@FindBy(xpath="//button[@class='btn btn-primary rounded mx-3']")
	WebElement btn_MVDelete2;

	@FindBy(xpath="//button[text()=' Action ']")
	WebElement btn_ActionVideo;

	@FindBy(xpath="//button[text()='Edit']")
	WebElement btn_ActionVideoEdit;

	@FindBy(xpath="(//h2[@class='count ng-star-inserted'])[1]")
	WebElement VideoStatus;



	public void verifyErrorMsg() throws InterruptedException {
		Assert.assertTrue(ErrorMsg.isDisplayed(), "Error Message not displayed for wrong Username/Password");
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Successfully displayed error Message for wrong Username/Password ");
	}

	public void enterUsername(String Username) throws InterruptedException {
		Thread.sleep(10000);
		//driver.switchTo().frame(btn_Password);
		Assert.assertTrue(btn_email.isEnabled(), "Password field is not enabled to enter password");
		btn_email.sendKeys(Username);
		test.log(LogStatus.PASS, "Successfully entered password as "+Username);
	}

	public void enterPassword(String password) throws InterruptedException {
		Thread.sleep(10000);
		//driver.switchTo().frame(frame_Password);
		Assert.assertTrue(btn_Password.isEnabled(), "Password field is not enabled to enter password");
		btn_Password.sendKeys(password);
		test.log(LogStatus.PASS, "Successfully entered password as "+password);
	}

	public void clickLoginBtn() {
		Assert.assertTrue(btn_Login.isDisplayed(), "OK button is not displayed");
		btn_Login.click();
		test.log(LogStatus.PASS, "Successfully clicked on OK button");
		//driver.switchTo().defaultContent();
	}

	public void verifyWelcomeMessage() {
		wait.until(ExpectedConditions.visibilityOf(txt_WelcomeMSG));
		Assert.assertTrue(txt_WelcomeMSG.isDisplayed(), "Not returned to Home Page");
		test.log(LogStatus.PASS, "Successfully returned to Home page after Succesful login");
	}


	public void clickManageUserTab() throws InterruptedException {
		Assert.assertTrue(tab_ManageUser.isDisplayed(), "Manage user tab is not dislayed");
		tab_ManageUser.click();
		Thread.sleep(3000);
		btn_adduser.click();
		btn_AddRow.click();
		test.log(LogStatus.PASS, "Successfully clicked on Manage user tab");
		//driver.switchTo().defaultContent();

	}
	public void clickCreateUser() throws InterruptedException {
		btn_CreateUser.click();
		Thread.sleep(7000);
		test.log(LogStatus.PASS, "Successfully clicked on Create user button");
		//driver.switchTo().defaultContent();
	}

	public void DeleteUser() throws InterruptedException {
		chkbox_DeleteUser.click();
		wait.until(ExpectedConditions.visibilityOf(btn_Delete));
		btn_Delete.click();
		wait.until(ExpectedConditions.visibilityOf(btn_Delete1));
		btn_Delete1.click();
		Thread.sleep(10000);
		test.log(LogStatus.PASS, "Successfully Deleted user ");
		//driver.switchTo().defaultContent();
	}
	public void EditUser(String Name2 , String MobNum2) throws InterruptedException {
		btn_ActionAdmin.click();
		wait.until(ExpectedConditions.visibilityOf(btn_ActionAdminEdit));
		btn_ActionAdminEdit.click();
		inputTxt_EnternameAddUser.sendKeys(Name2);
		inputTxt_EnterMobNumAddUser.sendKeys(MobNum2);
		Updateuser.click();

		test.log(LogStatus.PASS, "Successfully Edited the user ");
	}

	public void AddUserTab(String Name , String Email ,String MobNum ) {


		inputTxt_EnternameAddUser.sendKeys(Name);
		inputTxt_EnterEmailAddUser.sendKeys(Email);
		inputTxt_EnterMobNumAddUser.sendKeys(MobNum);
		Arrow_Role.click();
		Dropdown_Role.click();
		//clickRoleDropdown("Normal");


	}


	public void AddUserTab1(String Name1 , String Email1 ,String MobNum1 ) {


		inputTxt_EnternameAddUser1.sendKeys(Name1);
		inputTxt_EnterEmailAddUser1.sendKeys(Email1);
		inputTxt_EnterMobNumAddUser1.sendKeys(MobNum1);
		Arrow_Role1.click();
		Dropdown_Role.click();
		//clickRoleDropdown("Normal");


	}
	//tbody[@class='ui-table-tbody']//tr
	public void clickDashBoard() {
		Assert.assertTrue(Dashboard.isDisplayed(), "DashBoard tab is not displayed");
		Dashboard.click();
		test.log(LogStatus.PASS, "Successfully clicked on Dashboard tab");
		//driver.switchTo().defaultContent();
	}

	public void GetAccountStatus() {
		Assert.assertTrue(AccountStatus.isDisplayed(), "Account Status not displayed");
		Assert.assertEquals(Integer.toString(userNumber),AccountStatus.getText());
		test.log(LogStatus.PASS, "Successfully Checked on Account Status");
	}

	public void GetNumberOfuser() {
		userNumber=driver.findElements(By.xpath("//tbody[@class='ui-table-tbody']//tr")).size();
		test.log(LogStatus.PASS, "Successfully Checked on Account Status");
	}

	public void clickManageVideoRoomTab(String VideoName , String SIP) throws InterruptedException {
		Assert.assertTrue(tab_videorooms.isDisplayed(), "Manage Video Room tab is not dislayed");
		wait.until(ExpectedConditions.visibilityOf(tab_videorooms));
		tab_videorooms.click();
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOf(btn_adduserVideoRoom));
		btn_adduserVideoRoom.click();
		inputTxt_EnternameVideoRoom.sendKeys(VideoName);
		inputTxt_SIPVideoRoom.sendKeys(SIP);
		btn_CreateRoomVideoRoom.click();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Successfully clicked on Manage Video room tab");
	}
	public void VideoDeleteUser() throws InterruptedException {
		chkbox_DeleteUserVideoRoom.click();
		wait.until(ExpectedConditions.visibilityOf(btn_MVDelete));
		btn_MVDelete.click();
		wait.until(ExpectedConditions.visibilityOf(btn_Delete1));
		btn_Delete1.click();
		Thread.sleep(10000);
		test.log(LogStatus.PASS, "Successfully Deleted user ");
		//driver.switchTo().defaultContent();
	}

	public void VideoEditUser(String VideoNameEdit , String SIPEdit) throws InterruptedException {
		btn_ActionVideo.click();
		wait.until(ExpectedConditions.visibilityOf(btn_ActionVideoEdit));
		btn_ActionVideoEdit.click();
		inputTxt_EnternameVideoRoom.sendKeys(VideoNameEdit);
		inputTxt_SIPVideoRoom.clear();
		inputTxt_SIPVideoRoom.sendKeys(SIPEdit);
		wait.until(ExpectedConditions.visibilityOf(Updateuser));
		Updateuser.click();
		Thread.sleep(5000);

		test.log(LogStatus.PASS, "Successfully Edited the user ");
	}

	public void GetVideoStatus() {
		Assert.assertTrue(VideoStatus.isDisplayed(), "Video Status not displayed");
		Assert.assertEquals(Integer.toString(userNumber),VideoStatus.getText());
		test.log(LogStatus.PASS, "Successfully Checked on Video Status");
	}


	public void clickRoleDropdown(String dropdownText) {
		By record=By.xpath("//li[@class='ui-dropdown-item ui-corner-all'])//span[text()='"+dropdownText+"']");
		driver.findElement(record).click();	
	}

	public void clickReportTab() {
		Assert.assertTrue(tab_Report.isDisplayed(), "Report tab is not dislayed");
		tab_Report.click();
		test.log(LogStatus.PASS, "Successfully clicked on Report tab");
		//driver.switchTo().defaultContent();



	}

	public void reportdownload1() throws InterruptedException {

		ReportDwnld1.click();
		Thread.sleep(6000);
		test.log(LogStatus.PASS, "Successfully clicked on Report tab");


	}

	public void reportdownload2() throws InterruptedException {

		ReportDwnld2.click();
		Thread.sleep(6000);
		test.log(LogStatus.PASS, "Successfully clicked on Report tab");
	}

	public void reportdownload3() throws InterruptedException {

		ReportDwnld3.click();
		Thread.sleep(6000);
		btn_UsageReportDwnld.click();
		Thread.sleep(6000);
		
		test.log(LogStatus.PASS, "Successfully clicked on Report tab");
	}
	public void Validatefile(String path) {
		//
		File f = new File(path);
		if(f.exists() && !f.isDirectory()) { 

			test.log(LogStatus.PASS, "File is succesfully downloaded");
		}
	}
	
	public void Logout() throws InterruptedException {

		txt_WelcomeMSG.click();
		Thread.sleep(3000);
		btn_Logout.click();
		test.log(LogStatus.PASS, "Successfully clicked on logout ");


	}




}



