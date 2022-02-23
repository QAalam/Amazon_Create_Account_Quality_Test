package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountcreatepage {

	public WebDriver driver;
	
	
	public accountcreatepage (WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	
	WebElement signinBtn;
	
	public void getSigninBtn() {
		
		signinBtn.click();
		
		
	}
	
	@FindBy(xpath= "(//a[@id='createAccountSubmit'])")
	
	WebElement createaccountBtn;
	
	public void getcreateaccountBtn() {
		
		createaccountBtn.click();
		
	}
	
	@FindBy(xpath="(//input[@type='text'])")
	
	WebElement usernameBx;
	
	public void getusernameBx(String name) {
		
		usernameBx.sendKeys(name);
		
	}
	
	@FindBy(xpath="//input[@type='email']")
	
	WebElement useremailBx;
	
	public void getuseremailBx(String email) {
		
		useremailBx.sendKeys(email);
		
	}
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	
	WebElement passwordBx;
	
	public void getpasswordBx(String password ) {
		
		passwordBx.sendKeys(password);
		
	}
	 
	@FindBy(xpath="(//input[@type='password'])[2]")
	
	WebElement repassBx;
	
	public void getrepassBx(String repass) {
	
	repassBx.sendKeys(repass);
	
	
	}
	
	
	@FindBy(xpath="//input[@id='continue']")
	
	WebElement continueBtn;
	
	public void getcontinueBtn() {
		
		continueBtn.click();
	
		
	}
	
	
	
	
	
	
	
}
