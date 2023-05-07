package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open()
	{
		driver = Driver.getInstance();

	}
	
	@And("user is on login page")
	public void user_is_on_login_page() 
	{    
		driver.navigate().to("https://app.bleven.web.id/login");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);	
		
	}
	
	@When("user enters fiora@gmail.com and fiora")
	public void user_enters_fiora_gmail_com_and_fiora() 
	{
		driver.findElement(By.id("email")).sendKeys("fiora@gmail.com");
		driver.findElement(By.id("password")).sendKeys("fiora");	
			
	}

	@When("user enters cholid@gmail.com and tes")
	public void user_enters_cholid_gmail_com_and() 
	 
	{
		driver.findElement(By.id("email")).sendKeys("cholid@gmail.com");
		driver.findElement(By.id("password")).sendKeys("tes");	
			
	}

	@And("clicks on login button")
	public void clicks_on_login_button() 
	{
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Sudah ada di home page");
	}
	
	
}

