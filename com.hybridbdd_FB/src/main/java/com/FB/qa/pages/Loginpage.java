package com.FB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FB.qa.base.Testbase;

public class Loginpage extends Testbase {

	//Page factory also known as Object repository (OR)
	// In page factory we have to use @FindBy annotation
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/input/html/body/div[1]/div/div/form/div/div[1]/div/input")
	WebElement Email;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/form/div/div[2]/div/input")
	WebElement Password;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/form/div/div[3]")
	WebElement Loginbtn;
	
//	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[4]/a[2]")
//	WebElement signupbtn;
//	
//	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[4]/a[1]")
//	WebElement Forgotactbtn;
	
	
	// Initializing the page objects
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// Action methods for page objects/WebElement
	
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public void login (String em, String pass) {
		Email.sendKeys(em);
		Password.sendKeys(pass);
		Loginbtn.click();
		
	}
	
}
