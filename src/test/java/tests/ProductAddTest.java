package tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.ProductAdding;
import pages.LoginPage;


public class ProductAddTest extends BaseClass {

	
	@Parameters({"Email","Password"})
	@Test
	public void afterLogin(String Emailval,String Passwordval) {
		test = report.startTest("Check out Test");
		ProductAdding AfterLogin = new ProductAdding();
		AfterLogin.afterlogin(Emailval, Passwordval);
		report.endTest(test);
		
	}

}