package Pom_Package;

 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Package.BaseHRMClass;

public class PomLogin extends BaseHRMClass {

	// Objective Repository
	
	@FindBy(id="txtUsername") //driver.findElement(By.
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement Loginbtn;
	
	//Initiate page elements
	
	public PomLogin () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void typeusername(String name) {
		
		Username.sendKeys(name);
	}
	
	public void typepassword(String pass) {
		
		Password.sendKeys(pass);
	}
	
	public void clickbutton() {
		
		Loginbtn.click();
	}
	
	public String verify() {
		
		return driver.getTitle();
	}
	
	
	
}
