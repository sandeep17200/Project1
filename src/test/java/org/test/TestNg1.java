package org.test;

import java.util.Date;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg1  extends BaseClass{
	
	@BeforeClass
	
	private void beforeclass() {
		launchBrowser("chrome");
		implicityWait(20);
		urlLaunch("http://adactinhotelapp.com/");
        System.out.println("BeforeClass");
		
	}
	
	@AfterClass
	private void afterClass() {
		quit();
		System.out.println("AfterClass");
	}
	
	@BeforeMethod
	private void Beforemethod() {
		System.out.println("TestStart"+new Date());
		System.out.println("BeforeMethod");
	} 
	
	@AfterMethod
	private void AfterMethod() {
		System.out.println("TestEnd"+new Date());
		System.out.println("AfterMethod");

	}

	@Test(dataProvider="login", dataProviderClass =Set.class )
	private void Test1(String user,String pass)   {
		urlLaunch("http://adactinhotelapp.com/");
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(getCurrentUrl().contains("adactinhotelapp"));
		Hotelpage h=new Hotelpage();
		sendKeys(h.gettxtUsername(), user);
//		s.assertEquals(getAttribute(h.gettxtUsername()), "Sandy");
		sendKeys(h.gettxtpassword(), pass);
//		s.assertEquals(getAttribute(h.gettxtpassword()), "9898");
		Click(h.btnlogin);
		Click(h.btnlogin);
		
		System.out.println("test1");
//		s.assertAll();

	}
	@Test
	private void Test2() {
		SoftAssert s=new SoftAssert();
		Hotelpage h=new Hotelpage();
		SelectbyIndex(h.gettxtlocation(), 2);
		s.assertEquals(getAttribute(h.gettxtlocation()), "Melbourne","verify location");
		SelectbyIndex(h.gettxthotels(), 2);
		s.assertEquals(getAttribute(h.gettxthotels()), "Hotel Sunshine","verify hotels");
		SelectbyIndex(h.gettxtroomtype(), 2);
		s.assertEquals(getAttribute(h.gettxtroomtype()), "Double","verify roomtype");
		clear(h.gettxtdatepick());
		sendKeys(h.gettxtdatepick(), "15/12/2022");
		s.assertEquals(getAttribute(h.gettxtdatepick()), "15/12/2022","verify date pick" );
	    clear(h.gettxtdateout());
		sendKeys(h.gettxtdateout(), "16/12/2022");
	    s.assertEquals(getAttribute(h.gettxtdateout()), "16/12/2022","verify date out" );
	    SelectbyIndex(h.gettxtadultroom(), 2);
	    s.assertEquals(getAttribute(h.gettxtadultroom()),"2","verify adult room");
	    SelectbyIndex(h.gettxtchildroom(), 2);
	    s.assertEquals(getAttribute(h.gettxtchildroom()),"2","verify child room");
	    Click(h.getbtnsubmit());
	    s.assertAll();
		
		
		
		
		
		

	}
	@Test
	private void Test3() {
		SoftAssert s=new SoftAssert();
		Hotelpage h=new Hotelpage();
		Click(h.getbtnradio());
		Click(h.getbtncontinue());
		s.assertAll();
		

	}
	
	@Test
	private void Test4() {
		SoftAssert s=new SoftAssert();
		Hotelpage h=new Hotelpage();
		sendKeys(h.gettxtfirstname(), "Sandeep");
        s.assertEquals(getAttribute(h.gettxtfirstname()), "Sandeep","verify first name");
        sendKeys(h.gettxtlastname(), "AP");
        s.assertEquals(getAttribute(h.gettxtlastname()), "AP","verify last name");
        sendKeys(h.gettxtaddress(), "Tambaram");
        s.assertEquals(getAttribute(h.gettxtaddress()), "Tambaram","verify address");
        sendKeys(h.gettxtcreditcard(), "1976459678345634");
        s.assertEquals(getAttribute(h.gettxtcreditcard()), "1976459678345634","verify card type");
        SelectbyIndex(h.gettxtcardtype(), 2);
        s.assertEquals(getAttribute(h.gettxtcardtype()), "VISA","verify card type");
        SelectbyIndex(h.gettxtexpmonth(), 12);
        s.assertEquals(getAttribute(h.gettxtexpmonth()), "December");
        SelectbyIndex(h.gettxtexpyear(), 12);
        s.assertEquals(getAttribute(h.gettxtexpyear()), "2022");
        sendKeys(h.gettxtcvv(), "234");
        s.assertEquals(getAttribute(h.gettxtcvv()), "234","verify cvv");
        Click(h.getbtnbooknow());
        String attribute = getAttribute(h.gettxtorderno());
        System.out.println("Order No"+ attribute);
        
	}
//	
//	@DataProvider(name="login")
//	private Object[][] data() {
//		Object[][] a=new Object[][] {
//			{"Sandy","9898"},
//			{"Sandydilip","sandeepvijay"},
//			{"dilip","9899"},
//			{"perusudavam","010101"},
//			
//		};
//		return a;
//	}
	
	
	
	

}
