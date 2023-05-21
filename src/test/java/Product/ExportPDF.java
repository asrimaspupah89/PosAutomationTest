package Product;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExportPDF {
	WebDriver driver = null;
	
	@Given("user open browser")
	public void user_open_browser() {
	    System.setProperty("webdriver.chrome.driver", "E:/Gv/Matkul/6/Software Testing/Automation/CucumberJava/src/main/resources/chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    
	    driver = new ChromeDriver(options);
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@And("user is on table product page")
	public void user_is_on_table_product_page() {
	    driver.navigate().to("https://app.bleven.web.id/login");
	    driver.findElement(By.id("email")).sendKeys("fiora@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("fiora");
	    driver.findElement(By.tagName("form")).submit();
	    driver.findElement(By.cssSelector("img[alt='Product Logo']")).click();
	}
	
	@When("clicks PDF button on table product")
	public void clicks_PDF_button_on_table_product() {
		driver.findElement(By.xpath("//*[@id=\"table_wrapper\"]/div[1]/div[1]/div/button[1]")).click();
	}
}
