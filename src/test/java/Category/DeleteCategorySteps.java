package Category;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinition.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteCategorySteps {

WebDriver driver = null;
	
	
	@Given("user found category matched")
	public void user_found_category_matched() 
	{    
		driver = Driver.getInstance();
		System.out.println("Hasil tampil");
	}
	@When("user click delete")
	public void user_click_delete() 
	{    
		driver.findElement(By.className("delete-row")).click();
		Alert confirmationDialog = driver.switchTo().alert();
		 
		confirmationDialog.accept();
		
	}

	@Then("category deleted")
	public void user_is_showed_result() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	

}
