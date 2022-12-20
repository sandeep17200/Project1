package org.test;

import org.testng.annotations.DataProvider;

public class Set {
	@DataProvider(name="login")
	public Object[][] data() {
		Object[][] a=new Object[][] {
			{"sandy","9898"},
			{"sandydilip","sandeepvijay"},
			{"ram","9897"},
			{"perusudavam","010101"},

	};
		return a;
	

}
}
