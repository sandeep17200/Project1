package org.test;

import java.util.Date;
import java.util.PriorityQueue;

import javax.annotation.concurrent.ThreadSafe;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG  extends BaseClass{
	
	@BeforeClass
	private void BeforeClass() {
		launchBrowser("chrome");
		implicityWait(10);
		System.out.println("Before Class");

	}
	
	@AfterClass
	 private void AfterClass() {
		quit();
		System.out.println("AfterClass");

	}
	
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("Test Start"+new Date());
		System.out.println("BeforeMethod");

	}
	
	@AfterMethod
	private void AfterMethod() {
		System.out.println("Test Start"+new Date());
		System.out.println("AfterMethod");

	}
	
	@Test(dataProvider="login")
	private void Test2() throws InterruptedException  {
		urlLaunch("https://www.facebook.com/");
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(getCurrentUrl().contains("facebook"),"verify url");
		Loginpage l=new Loginpage();
		sendKeys(l.getTextusername(), "Sandeep");
		s.assertEquals(getAttribute(l.getTextusername()), "Sandeep","verify username");
		sendKeys(l.getPassword(), "1717");
		s.assertEquals(getAttribute(l.getPassword()), "1717","verify password");
		Click(l.getBtnlogin());
		Thread.sleep(2000);
	    s.assertTrue(getCurrentUrl().contains("privacy"),"verify invalid page");
		s.assertAll();
		
		System.out.println("Test2");

	}
	@Test
	private void Test1() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		SoftAssert s=new SoftAssert();
		Registration r=new Registration();
		Click(r.getBtnCreate());
		s.assertEquals(getText(r.txtsignup), "Sign Up");
		sendKeys(r.getTxtFirstNmae(), "Sandeep");
		s.assertEquals(getAttribute(r.getTxtFirstNmae()), "Sandeep","verify firstname");
		sendKeys(r.getTxtLastNmae(), "AP");
		s.assertEquals(getAttribute(r.getTxtLastNmae()), "AP","verify lastname");
		Click(r.getBtnSignup());
		
		
		
		System.out.println("Test1");

	}
	@Test
	private void Test3() {
		System.out.println("Test3");

	}
	
	@DataProvider(name="login")
	private Object[][] data() {
		Object[][] a=new Object[][] {
			{"Sandy","9898"},
			{"Sandydilip","sandeepvijay"},
			{"dilip","9899"},
			{"perusudavam","010101"},
			
		};
		return a;

	}
	

}

