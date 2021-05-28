package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators
	private By emailId = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By signInButton = By.id("btnLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void enterunpw(String username, String pass) {
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}
}
