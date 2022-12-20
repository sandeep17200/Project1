package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass{
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement textusername;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement btnlogin;

	public WebElement getTextusername() {
		return textusername;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	

	
	
	
	
	

}
