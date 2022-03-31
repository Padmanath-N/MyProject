package Test_Layer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Base_Package.BaseHRMClass;
import Pom_Package.PomLogin;
import Test_Data.ExcelSheet;

public class Login_Test extends BaseHRMClass {
	
	PomLogin Log;
	
	public Login_Test() {
		super (); 
	}
	
	@BeforeMethod
	public void initsetup () {
		
		initiate();
		screenshots("Login");
		
		Log = new PomLogin();
	}
	
	@Test  (priority=1) 
	public void Title() {
		
		String actual=Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
	}
	
	@DataProvider
	public Object[][] Details() {
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
		
	}
	
	
	@Test  (priority=2, dataProvider="Details") 
	  public void Login (String name, String password) throws InterruptedException 
	  {
	  Log.typeusername(name);
	  Thread.sleep(3000);
	  Log.typepassword(password); 
	  //Log.clickbutton(); 
	  } 
	
	
	  @AfterMethod public void close () 
	  {
	  
	  driver.close(); 
	  }
	 

}
