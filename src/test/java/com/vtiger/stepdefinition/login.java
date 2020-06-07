package com.vtiger.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.HeaderPage;
import com.vtiger.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends BaseTest {
	


	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		openURL();
	}

	@When("^User enters valid user id and password$")
	public void user_enters_valid_user_id_and_password() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.Login();
	}

	@Then("^User should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable {
		 System.out.println("check home page"); 
	}

	@Then("^Logout link should be visible$")
	public void logout_link_should_be_visible() throws Throwable {
		HeaderPage hp=new HeaderPage(driver);
		hp.clickonLogout();
	}
	
	@Then("^close application$")
	public void close_application() throws Throwable {
	    
	}

	@When("^User enters invalid \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_enters_invalid_and(String userid, String pwd) throws Throwable {
	  
		LoginPage lp=new LoginPage(driver);
		lp.InvalidLogin(userid, pwd);
		
	}

	@Then("^User should be on login page with error msg\\.$")
	public void user_should_be_on_login_page_with_error_msg() throws Throwable {
		
		LoginPage lp=new LoginPage(driver);
		lp.verifyerrormsg();
	    
	}

	@Then("^message should be \"([^\"]*)\"$")
	public void message_should_be(String arg1) throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.verifyerrormsg();
	}

	@Then("^tittle should be matched$")
	public void tittle_should_be_matched() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.verifytittle();
	}

	@Then("^logo should be displayed$")
	public void logo_should_be_displayed() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.verifylogo();
	}
	
	


	
}
