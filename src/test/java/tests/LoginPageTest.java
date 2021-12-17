package tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;


public class LoginPageTest extends BaseClass {

	XSSFWorkbook wbook;
	XSSFSheet sheet;

	@Parameters({"Email","WrongPassword"})
	@Test
	public void NegetiveLoginTest(String Emailval,String Passwordval) {

		test = report.startTest("Negetive Login Test");
		LoginPage Login = new LoginPage();
		Login.login(Emailval, Passwordval);
		Login.NegetiveLogin();
		report.endTest(test);
	}

	@Parameters({"Email","Password"})
	@Test
	public void PositiveLoginTest(String Emailval,String Passwordval) {

		test = report.startTest("Positive Login Test");
		LoginPage Login = new LoginPage();
		Login.login(Emailval, Passwordval);
		Login.PositiveLogin();
		report.endTest(test);

	}


}