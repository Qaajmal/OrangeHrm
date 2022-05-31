package com.Orange;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.batch24.pages.Home24Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ajmal {
	WebDriver driver;
	Home24Page obj;
	

	@Given("^user to Orange HRM home page$")
	public void user_to_Orange_HRM_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//***driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)***;
		obj = new Home24Page(driver);
	}

	@When("^user type the Username$")
	public void user_type_the_Username() throws Throwable {
	//driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
    obj.getUsername().sendKeys("Admin");
	}

	@When("^user also type Password$")
	public void user_also_type_Password() throws Throwable {
	//driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	obj.getPassword().sendKeys("admin123");
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
    //driver.findElement(By.name("Submit")).click();
	obj.getLoginBtn().click();	
	}

	@Then("^user verify welcome screen$")
	public void user_verify_welcome_screen() throws Throwable {
    String expected = "Welcome";
    //String actual = driver.findElement(By.id("welcome")).getText();
    String actual = obj.getWelcomeText().getText();
    Assert.assertTrue("welcome is not found ",actual.contains(expected));
    
    
	}
}
