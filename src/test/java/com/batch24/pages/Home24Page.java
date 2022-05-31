package com.batch24.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home24Page {
	WebDriver driver;
	
public Home24Page(WebDriver driver) {
	//"this" keyword is used here to distinguish global and local variable "driver"
	//gets driver as parameter from MainClass.java and assigns to the driver 
	//instance in this class
	
this.driver=driver;
PageFactory.initElements(driver, this);
//Intialises WebEliments declared in this class using driver instance. 
}
@FindBy(how = How.XPATH, using = "//*[@id='txtUsername']")
private WebElement username;

@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
private WebElement password;

@FindBy(how = How.NAME, using = "Submit")
private WebElement loginBtn;

@FindBy(how = How.ID, using = "welcome")
private WebElement welcomeText;




public WebElement getWelcomeText() {
	return welcomeText;
}

public void setWelcomeText(WebElement welcomeText) {
	this.welcomeText = welcomeText;
}

public WebElement getLoginBtn() {
	return loginBtn;
}

public void setLoginBtn(WebElement loginBtn) {
	this.loginBtn = loginBtn;
}

public WebElement getPassword() {
	return password;
}

public void setPassword(WebElement password) {
	this.password = password;
}

public WebElement getUsername() {
	return username;
}

public void setUsername(WebElement username) {
	this.username = username;
}


}
