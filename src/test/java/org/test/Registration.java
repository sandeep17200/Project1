package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends BaseClass {
	
	public Registration() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btnCreate;
	
	@FindBy(xpath="//div[text()='Sign Up']")
	WebElement txtsignup;
	
	@FindBy(name="firstname")
	WebElement txtFirstNmae;
	
	@FindBy(name="lastname")
	WebElement txtLastNmae;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement btnSignup;

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public WebElement getTxtFirstNmae() {
		return txtFirstNmae;
	}

	public WebElement getTxtLastNmae() {
		return txtLastNmae;
	}

	public WebElement getBtnSignup() {
		return btnSignup;
	}
	
	
	
	

}
