#Author				: Adriana Anggita Daeli
#Date					: 08/05/23
#Description			: Profile feature scenarios

package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditUserProfileSteps {
	
	WebDriver driver = null;

	@Given("browser is open and user already logged in for edit profile page")
	public void browser_is_open_and_user_already_logged_in_for_edit_profile_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\Arya\\File\\Kelas\\SMT6\\PPL PR\\w11\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	  		
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    
		driver.navigate().to("https://app.bleven.web.id/login");
		driver.findElement(By.id("email")).sendKeys("fiora@gmail.com");
		driver.findElement(By.id("password")).sendKeys("fiora");	
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
    }	
	@When("user is on edit profile page")
	public void user_is_on_edit_profile_page() throws InterruptedException {
		driver.findElement(By.id("profileButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("editButton")).click();
		Thread.sleep(2000);
	}
	
	@When("click back button in edit profile page")
	public void click_back_button_in_edit_profile_page() throws InterruptedException {
		Thread.sleep(3500);
		driver.findElement(By.id("backButton")).click();
	}
	
	@Then("user should be navigated to profile page from edit profile page")
	public void user_should_be_navigated_to_profile_page_from_edit_profile_page() throws InterruptedException {
		Thread.sleep(3500);
		driver.close();
        driver.quit();
	}
	
	@And("user fill name and password and click save changes")
	public void user_fill_name_and_password_and_click_save_changes() throws InterruptedException {
		
		//name, old password, new password, and confirm password valid
		driver.findElement(By.id("name")).sendKeys("FioraTes");
		driver.findElement(By.id("pwOld")).sendKeys("fiora");
		driver.findElement(By.id("pwNew")).sendKeys("fioranew");
		driver.findElement(By.id("pwConfirm")).sendKeys("fioranew");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//name valid, rest blank
		driver.findElement(By.id("name")).sendKeys("Fiora");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//name blank, old password, new password, and confirm password valid
		driver.findElement(By.id("pwOld")).sendKeys("fioranew");
		driver.findElement(By.id("pwNew")).sendKeys("fiora");
		driver.findElement(By.id("pwConfirm")).sendKeys("fiora");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//name blank, old password invalid, new password and confirm password valid
		driver.findElement(By.id("pwOld")).sendKeys("fioraninvalid");
		driver.findElement(By.id("pwNew")).sendKeys("fioraa");
		driver.findElement(By.id("pwConfirm")).sendKeys("fioraa");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//name blank, old password and new password valid, and confirm password invalid
		driver.findElement(By.id("pwOld")).sendKeys("fiora");
		driver.findElement(By.id("pwNew")).sendKeys("fioraputri");
		driver.findElement(By.id("pwConfirm")).sendKeys("fioraputra");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//all blank
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//mandatory new password blank
		driver.findElement(By.id("pwOld")).sendKeys("fiora");
		driver.findElement(By.id("pwConfirm")).sendKeys("fioraputri");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//mandatory confirm password blank
		driver.findElement(By.id("pwOld")).sendKeys("fiora");
		driver.findElement(By.id("pwNew")).sendKeys("fioraa");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//mandatory old password blank
		driver.findElement(By.id("pwNew")).sendKeys("fiora");
		driver.findElement(By.id("pwConfirm")).sendKeys("fiora");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		driver.navigate().refresh();
		
		//mandatory new password and confirm password blank
		driver.findElement(By.id("pwOld")).sendKeys("fiora");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		
		//mandatory old password and confirm password blank
		driver.findElement(By.id("pwNew")).sendKeys("fioraa");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
		
		//mandatory old password and new password blank
		driver.findElement(By.id("pwConfirm")).sendKeys("fioraa");
		Thread.sleep(1500);
		driver.findElement(By.id("saveButton")).click();
		Thread.sleep(3500);
	}
	
	@Then("throw message")
	public void throw_message() throws InterruptedException {
		Thread.sleep(3500);
		driver.close();
        driver.quit();
	}
}
