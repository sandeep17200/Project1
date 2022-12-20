package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelpage extends BaseClass {

	public Hotelpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUsername;

	@FindBy(id="password")
	WebElement txtpassword;

	@FindBy(id = "login")
	WebElement btnlogin;

	@FindBy(id = "location")
	WebElement txtlocation;

	@FindBy(id = "hotels")
	WebElement txthotels;

	@FindBy(id = "room_type")
	WebElement txtroomtype;

	@FindBy(id = "room_nos")
	WebElement txtroomnos;

	@FindBy(id = "datepick_in")
	WebElement txtdatepick;

	@FindBy(id = "datepick_out")
	WebElement txtdateout;

	@FindBy(id = "adult_room")
	WebElement txtadultroom;

	@FindBy(id = "child_room")
	WebElement txtchildroom;

	@FindBy(id = "Submit")
	WebElement btnsubmit;

	@FindBy(id = "radiobutton_0")
	WebElement btnradio;

	@FindBy(id = "continue")
	WebElement btncontinue;

	@FindBy(id = "first_name")
	WebElement txtfirstname;

	@FindBy(id = "last_name")
	WebElement txtlastname;

	@FindBy(id = "address")
	WebElement txtaddress;

	@FindBy(id = "cc_num")
	WebElement txtcreditcard;

	@FindBy(id = "cc_type")
	WebElement txtcardtype;

	@FindBy(id = "cc_exp_month")
	WebElement txtexpmonth;

	@FindBy(id = "cc_exp_year")
	WebElement txtexpyear;

	@FindBy(id = "cc_cvv")
	WebElement txtcvv;

	@FindBy(id = "book_now")
	WebElement btnbooknow;

	@FindBy(id = "order_no")
	WebElement txtorderno;

	public WebElement gettxtUsername() {
		return txtUsername;
	}

	public WebElement gettxtpassword() {
		return txtpassword;
	}

	public WebElement getbtnlogin() {
		return btnlogin;
	}

	public WebElement gettxtlocation() {
		return txtlocation;
	}

	public WebElement gettxthotels() {
		return txthotels;
	}

	public WebElement gettxtroomnos() {
		return txtroomnos;
	}

	public WebElement gettxtdatepick() {
		return txtdatepick;
	}

	public WebElement gettxtdateout() {
		return txtdateout;
	}

	public WebElement gettxtadultroom() {
		return txtadultroom;
	}

	public WebElement gettxtchildroom() {
		return txtchildroom;
	}

	public WebElement getbtnsubmit() {
		return btnsubmit;
	}

	public WebElement getbtnradio() {
		return btnradio;
	}

	public WebElement getbtncontinue() {
		return btncontinue;
	}

	public WebElement gettxtfirstname() {
		return txtfirstname;
	}

	public WebElement gettxtlastname() {
		return txtlastname;
	}

	public WebElement gettxtaddress() {
		return txtaddress;
	}

	public WebElement gettxtcreditcard() {
		return txtcreditcard;
	}

	public WebElement gettxtcardtype() {
		return txtcardtype;
	}

	public WebElement gettxtexpmonth() {
		return txtexpmonth;
	}

	public WebElement gettxtexpyear() {
		return txtexpyear;
	}

	public WebElement gettxtcvv() {
		return txtcvv;
	}

	public WebElement getbtnbooknow() {
		return btnbooknow;
	}

	public WebElement gettxtroomtype() {
		return txtroomtype;
	}

	public WebElement gettxtorderno() {
		return txtorderno;
	}

}
