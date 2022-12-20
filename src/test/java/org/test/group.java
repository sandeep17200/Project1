package org.test;

import org.testng.annotations.Test;

public class group {
	@Test(groups= {"Smoke","Regression"})
	private void Test1() {
		System.out.println("Test1");

	}
	@Test(groups="Regression")
	private void Test2() {
		System.out.println("Test2");

	}
	@Test(groups= {"Sanity","Regression"})
	private void Test3() {
		System.out.println("Test3");

	}
	@Test(groups= {"Smoke","Regression"})
	private void Test4() {
		System.out.println("Test4");

	}
	@Test(groups="Regression")
	private void Test5() {
		System.out.println("Test5");

	}
	@Test(groups= {"Sanity","Regression"})
	private void Test6() {
		System.out.println("Test6");

	}
	@Test()
	private void Test7() {
		System.out.println("Test7");

	}
	@Test(groups="Retest")
	private void Test8() {
		System.out.println("Test8");

	}

}
