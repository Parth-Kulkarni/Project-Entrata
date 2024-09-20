package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.entrataHomePage;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class entrartaStepDefinition extends TestBase {

	entrataHomePage entrataHome = new entrataHomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^I click on the Sign In button$")
	public void IclickontheSignInbutton() throws Throwable{
		waitHelper = new WaitHelper(driver);
		entrataHome.userClicksOnSignInButton();
	}

	@Then("^I click on Property Manager Login button$")
	public void IclickonPropertyManagerLoginbutton() throws Throwable{
		waitHelper = new WaitHelper(driver);
		entrataHome.propertyManagerLoginButton();
	}

	@Then("^I enter username \"([^\"]*)\"$")
	public void Ienterusername(String username) throws Throwable{
		waitHelper = new WaitHelper(driver);
		entrataHome.enterUserName(username);
	}

	@Then("^I enter password \"([^\"]*)\"$")
	public void Ienterpassword(String password) throws Throwable{
		entrataHome.enterPassword(password);
	}

	@Then("^I click on SignIn button$")
	public void IclickonSignInbutton() throws Throwable{
		entrataHome.userHitsSignInButton();
	}

	@Given("^I hover on Products section$")
	public void IhoveronProductssection() throws Throwable{
		entrataHome.productHover();
	}

	@Then("^I click on Residential Pay which is under Products section$")
	public void IclickonResidentialPaywhichisunderProductssection() throws Throwable{
		entrataHome.residentialPayClick();
	}

	@And("^I validate whether I am on the Residential Page$")
	public void IvalidatewhetherIamontheResidentialPage() throws Throwable{
		entrataHome.residentialPayPageValidation();
	}

	@Given("^I click on Property Management section$")
	@And("^I validate whether I am on the Property Management Page$")
	public void IclickonPropertyManagementsection() throws Throwable{
		entrataHome.propertyManagementCLick();
	}

	@Then("^I click on Access Control button$")
	public void IclickonAccessControlbutton() throws Throwable{
		entrataHome.setAccessControlClick();
	}

	@Then("^I validate whether I am on Entrata Access Connect page$")
	public void IvalidatewhetherIamonEntrataAccessConnectpage() throws Throwable{
		entrataHome.entrataAccessConnectTitleValidation();
	}

	
}