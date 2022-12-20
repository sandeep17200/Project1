package org.test;

import org.testng.annotations.DataProvider;

public class Dataproviders {

	@DataProvider(name="login")
	private Object[][] data() {
		Object[][] a=new Object[][] {
			{"Sandy","9898"},
			{"Sandydilip","sandeepvijay"},
			{"dilip","9899"},
			{"perusudavam","010101"}
			
		};
		return a;
	}

}
