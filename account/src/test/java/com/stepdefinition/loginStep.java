 package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.loginBase;
import com.pageobjectmodel.accountcreatepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep extends loginBase {
	
	accountcreatepage page;
	
	
	@Given("I am on amazon homepage")
	public void i_am_on_amazon_homepage() {

	   getDriver();
	   
	   page = PageFactory.initElements(driver, accountcreatepage.class);
	   
	   
	   
	}
	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {

		//driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	   
		page.getSigninBtn();
	}

	@When("I click on create your amazon account")
	public void i_click_on_create_your_amazon_account() {

	  // driver.findElement(By.xpath("(//a[@id='createAccountSubmit'])")).click();
	   
		page.getcreateaccountBtn();
		
	}

	@When("I put my valid {string}")
	public void i_put_my_valid(String name) {
	   
	   //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(string);
		page.getusernameBx(name);
		
	}

	@When("I put a valid {string}")
	public void i_put_a_valid(String email) {
	   
	   //driver.findElement(By.xpath("//input[@type='email']")).sendKeys(string);
	   
	   page.getuseremailBx(email);
		
	}

	@When("I put a valid password as {string}")
	public void i_put_a_valid_password_as(String password) {
	   
	   //driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(string);
	   
		page.getpasswordBx(password);
		
	   
	}

	@When("I reenter the valid {string}")
	public void i_reenter_the_valid(String repass) {
	   
	  //driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(string);
	  
	  page.getrepassBx(repass);
	  
		
	}
	@When("I click on continue button")
	public void i_click_on_continue_button() {
	    
		//driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		page.getcontinueBtn();
		
	}

	@Then("I land on puzzle page")
	public void i_land_on_puzzle_page() {
		
	   Assert.assertEquals(driver.getTitle(),"Authentication required"); 
	   
	}

}
