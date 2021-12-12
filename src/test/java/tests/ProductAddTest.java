package tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.ProductAdding;



public class ProductAddTest extends BaseClass {
	
	XSSFWorkbook wbook;
	XSSFSheet sheet;

	
	@Parameters({"Email","Password"})
	@Test
	public void ProductAd(String Emailval,String Passwordval) {
		ProductAdding productadd = new ProductAdding();
		productadd.ProductAd(Emailval, Passwordval);
		
		
	}
	

}