package com.FB.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FB.qa.base.Testbase;
import com.FB.qa.pages.Loginpage;

public class Loginpagetest extends Testbase {
	
	Loginpage loginpage;
	
	// To call super class (Testbase) constructor we need create constructor and using super keyword,
	// we can call constructor of super class
	// we calling super class constructor to get the properties of constructor
	
	public Loginpagetest() {
		super();
	}
	
	@BeforeMethod
	public void setup () {
		initiate();
		loginpage = new Loginpage();
	}
	
	@Test(priority =1)
	public void loginpagetitletest() {
		String title =loginpage.validatepagetitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority =2)
	public void logintest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
