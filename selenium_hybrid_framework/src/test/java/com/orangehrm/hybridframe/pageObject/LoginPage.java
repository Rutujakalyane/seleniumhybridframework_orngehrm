package com.orangehrm.hybridframe.pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name = "txtUsername")
	WebElement username;
	
	@FindBy(name = "txtPassword")
	WebElement userpassword;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void loginOrangeHrm(String uname,String upass) {
	//	username.sendKeys("Admin");
		//userpassword.sendKeys("admin123");
		//loginBtn.click();
		username.sendKeys(uname);
		userpassword.sendKeys(upass);
		loginBtn.click();
	
}
}