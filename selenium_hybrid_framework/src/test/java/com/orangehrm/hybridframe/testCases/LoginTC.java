package com.orangehrm.hybridframe.testCases;

import org.testng.annotations.Test;


import com.orangehrm.hybridframe.TestBase.TestBase;
import com.orangehrm.hybridframe.pageObject.LoginPage;

public class LoginTC extends TestBase {
	@Test
	public void loginOrangeHrmTest() {
		LoginPage login = new LoginPage(driver);
	//	login.loginOrangeHrm(configData.getUserName(),configData.getUserPassword());
		login.loginOrangeHrm(xlsxData.getStringCellData("login", 0, 0),
				xlsxData.getStringCellData("login", 0, 1));
		
	}
	

}
