package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteprodSteps {
	
	WebDriver driver = null;

	@Given("browser is open and login succesfully for delete product")
	public void browser_is_open_and_login_succesfully_for_delete_product(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Documents\\Arya\\File\\Kelas\\SMT6\\PPL PR\\w11\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	  		
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    
	    //login
	    driver.navigate().to("https://app.bleven.web.id/login");  
	    driver.findElement(By.id("email")).sendKeys("fiora@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("fiora");
	    driver.findElement(By.id("loginbutton")).click();
	}
	
	@When("product page is open for delete product")
	public void product_page_is_open_for_delete_product() throws InterruptedException {
		driver.findElement(By.cssSelector("img[alt='Product Logo']")).click();
		Thread.sleep(5000);

		//driver.findElement(By.id("employeeB")).click();
	}
	
	@And("able to click delete button")
	public void able_to_click_delete_button() throws InterruptedException {
		driver.findElement(By.id("button-0")).click();
		Thread.sleep(5000);
		
	}

	
	@Then("click ok to delete product")
	public void click_ok_to_delete_product() throws InterruptedException {
		 Alert confirmDialog = driver.switchTo().alert();
		 Thread.sleep(2500);

	     confirmDialog.accept();
	     
	}
	
	@Then("click cancel to cancel delete product")
	public void click_cancel_to_cancel_delete_product() throws InterruptedException {
		 Alert confirmDialog = driver.switchTo().alert(); 
		 Thread.sleep(2500);
		 
		confirmDialog.dismiss();
	}

	@Then("cancel deleted")
	public void cancel_deleted() throws InterruptedException {
		Thread.sleep(2500);
		driver.close();
		driver.quit();
	}

	
	@Then("product deleted")
	public void able_to_input_word() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
//	    throw new io.cucumber.java.PendingException();
	}
	
	@And("delete button found")
	public void delete_button_found() {
		driver.findElement(By.id("button-0"));
	}
	
	@Then("print message delete button found")
	public void print_message_delete_button_found() throws InterruptedException {
		System.out.println("Delete Button Found");
		Thread.sleep(1500);
		driver.close();
		driver.quit();
	}
	
}