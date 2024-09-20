package com.cucumberFramework.pageObjects;

import com.cucumberFramework.helper.WaitHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class entrataHomePage {

	private WebDriver driver;

	@FindBy(xpath="(//a[@href='/sign-in'])[1]")
	public WebElement signIn;

	@FindBy(xpath="(//a[@href='https://sso.entrata.com/entrata/login']")
	public WebElement propertyManagerLogin;

	@FindBy(xpath="//input[@id='entrata-username']")
	public WebElement userName;

	@FindBy(xpath="//input[@id='entrata-password']")
	public WebElement passWord;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;

	@FindBy(xpath="(//div[starts-with(@id,'w-dropdown-toggle')]/div[text()='Products'])[1]")
	public WebElement Products;

	@FindBy(xpath="//nav[starts-with(@id,'w-dropdown-list')]/div/div[1]/div/nav/div/a")
	public List<WebElement> ResidentPay;

	@FindBy(xpath="(//h1[text()='ResidentPay'])[1]")
	public WebElement residentaialPayText;

	@FindBy(xpath="//a[@href='https://entrata.com/products/property-management']")
	public WebElement propertyManagement;

	@FindBy(xpath="(//h1[text()='Property Management'])[1]")
	public WebElement propertyManagementTextValidation;

	@FindBy(xpath="//span[text()='Access Control']")
	public WebElement accessControl;

	@FindBy(xpath="//a[@href='https://entrata.webflow.io/products/access-control']")
	public WebElement accessControlLearnMore;

	@FindBy(xpath="(//h1[text()='Entrata Access Connect'])[1]")
	public WebElement entrataAccessConnect;

	WaitHelper waitHelper;

	public entrataHomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}

	public void userClicksOnSignInButton(){

		Assert.assertEquals(signIn.getText(),"Sign In");
		this.signIn.click();
	}

	public void propertyManagerLoginButton(){

		Assert.assertEquals(propertyManagerLogin.getText(),"Property Manager Login");
		this.propertyManagerLogin.click();
	}

	public void enterUserName(String userName){

		this.userName.sendKeys(userName);
	}

	public void enterPassword(String password){

		this.passWord.sendKeys(password);
	}

	public void userHitsSignInButton() {

		Assert.assertEquals(submit.getText(),"Sign In");
		this.submit.click();
	}

	public void productHover(){
		Actions action = new Actions(driver);
		action.moveToElement(Products).build().perform();
	}

	public void residentialPayClick(){
			for (WebElement ele : ResidentPay){
					if(ele.getText().equalsIgnoreCase("ResidentPay")){
						Assert.assertEquals(ele.getText(),"ResidentPay");
						ele.click();
					}
			}
	}

	public void residentialPayPageValidation(){
		Assert.assertEquals(residentaialPayText.getText(),"ResidentPay");
	}

	public void propertyManagementCLick(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",propertyManagement);
		js.executeScript("arguments[0].click();", propertyManagement);
		Assert.assertEquals(propertyManagementTextValidation.getText(),"Property Management");
	}

	public void setAccessControlClick(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",accessControl);
		js.executeScript("arguments[0].click();", accessControl);

		js.executeScript("arguments[0].scrollIntoView(true);",accessControlLearnMore);
		js.executeScript("arguments[0].click();", accessControlLearnMore);

	}

	public void entrataAccessConnectTitleValidation(){
		Assert.assertEquals(entrataAccessConnect.getText(),"Entrata Access Connect");
	}
}
