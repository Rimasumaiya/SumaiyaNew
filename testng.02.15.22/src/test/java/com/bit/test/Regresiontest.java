package com.bit.test;

import org.testng.annotations.Test;

import DB.DBTest;

public class Regresiontest extends baseTest  {
	@Test(dataProvider=DBTest.class,dataProvider="login")	
	public void test5(Object b,Object c)
}
	
	
	@Parameters({"browser","url")
	@Test(groups="ui",priority=1,enabled=false)
	public void test2(String b.String u) {
		
	}

	
	public void test2() {
		 System.out.println("test2");
	  }
	@Test(groups={"ui","backend"})
	  public void test3() {
		 System.out.println("test3");
	  }

}
