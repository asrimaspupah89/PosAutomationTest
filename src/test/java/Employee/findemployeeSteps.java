package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class findemployeeSteps {
	
	WebDriver driver = null;

	@Given("browser is open and login succesfully for find employee")
	public void browser_is_open_and_login_succesfully_for_find_employee(){
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
	
	@When("employee page is open for find employee")
	public void employee_page_is_open_for_find_employee() throws InterruptedException {
		driver.findElement(By.cssSelector("img[alt='Employee Logo']")).click();
//		Thread.sleep(2500);


//		driver.findElement(By.id("employeeB")).click();
	}
	
	@And("able to input data1 employee")
	public void able_to_input_data1_employee() {
//		driver.findElement(By.cssSelector("input[type='search']")).click();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("salma aushaf hafianne");
	}
	@And("able to input data2 employee")
	public void able_to_input_data2_employee() {
//		driver.findElement(By.cssSelector("input[type='search']")).click();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("salm");
	}
	@And("able to input data3 employee")
	public void able_to_input_data3_employee() {
//		driver.findElement(By.cssSelector("input[type='search']")).click();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("120");
	}
	@And("able to input data4 employee")
	public void able_to_input_data4_employee() {
//		driver.findElement(By.cssSelector("input[type='search']")).click();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("12");
	}
	@And("able to input data5 employee")
	public void able_to_input_data5_employee() {
//		driver.findElement(By.cssSelector("input[type='search']")).click();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("salma@example.com");
	}
	@And("able to input data6 employee")
	public void able_to_input_data6_employee() {
//		driver.findElement(By.cssSelector("input[type='search']")).click();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("salma@ex");
	}
	@And("able to input data7 employee")
	public void able_to_input_data7_employee() {
//		driver.findElement(By.cssSelector("input[type='search']")).click();
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("3");
	}
	
	
	@Then("employee searched")
	public void employee_searched() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	
	@And("able to click find bar")
	public void able_to_click_find_bar_for_find_bar() {
		driver.findElement(By.cssSelector("input[type='search']")).click();
	}
	
	@Then("able to input word")
	public void able_to_input_word() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}