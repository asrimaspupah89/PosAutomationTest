#Author				: Adriana Anggita Daeli
#Date					: 08/05/23
#Description			: Profile feature scenarios

package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.JavascriptExecutor;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.cucumber.java.Before;

public class ShowUserProfileSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open and user already logged in for profile page")
    public void browser_is_open_and_user_already_logged_in_for_profile_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\Arya\\File\\Kelas\\SMT6\\PPL PR\\w11\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	  		
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    
		driver.navigate().to("https://app.bleven.web.id/login");
		driver.findElement(By.id("email")).sendKeys("cholid@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");	
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
    }
	
	@When("user click profile button")
	public void user_click_profile_button() throws InterruptedException {
		driver.findElement(By.id("profileButton")).click();
	}

	@Then("user should be navigated to profile page")
	public void user_should_be_navigated_to_profile_page() throws InterruptedException {
		Thread.sleep(3500);
		driver.close();
        driver.quit();
	}
	
	@When("Able to click edit profile button")
	public void able_to_click_edit_profile_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("editButton")).click();
	}

	@Then("navigate to edit profile page")
	public void navigate_to_edit_profile_page() throws InterruptedException {
		Thread.sleep(3500);
		driver.close();
        driver.quit();
	}
	
	@Then("print message information found")
	public void print_message_information_found() throws InterruptedException {
		
		//check field name
		boolean isNameDisplayed = true;
		try {
			driver.findElement(By.id("name"));
		} catch (NoSuchElementException e) {
			isNameDisplayed = false;
		}
		
		if (isNameDisplayed) {
			System.out.println("Field name is displayed");
		} else {
			System.out.println("Field name is not displayed");
		}
		
		//check field role
		boolean isRoleDisplayed = true;
		try {
			driver.findElement(By.id("role"));
			
		} catch (NoSuchElementException e) {
			isRoleDisplayed = false;
		}
		
		if (isRoleDisplayed) {
			System.out.println("Field role is displayed");
		} else {
			System.out.println("Field role is not displayed");
		}
		
		
		//check field mail
		boolean isMailDisplayed = true;
		try {
			driver.findElement(By.id("mail"));
		} catch (NoSuchElementException e) {
			isMailDisplayed = false;
		}
		
		if (isMailDisplayed) {
			System.out.println("Field email is displayed");
		} else {
			System.out.println("Field email is not displayed");
		}
		
		//check edit button
		boolean isEditButtonDisplayed = true;
		try {
			driver.findElement(By.id("editButton"));
		} catch (NoSuchElementException e) {
			isEditButtonDisplayed = false;
		}
		
		if (isEditButtonDisplayed) {
			System.out.println("Edit button is displayed");
		} else {
			System.out.println("Edit button is not displayed");
		}
		
		
		Thread.sleep(1500);
		driver.close();
		driver.quit();
	}
}