package Category;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import StepDefinition.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchCategorySteps {
WebDriver driver = null;
	
	
	@Given("user is on home page")
	public void user_is_on_login_page() 
	{    
		driver = Driver.getInstance();
		driver.navigate().to("https://app.bleven.web.id/home");
	}
	@And("user click category button")
	public void user_is_on_category_page() 
	{    
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/div[4]/div/div/nav/ul/li[4]/a")).click();
	}

	@When("user enters {string}")
	public void user_enters_and(String keyword) 
	{
		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys(keyword);
		
		
	}
	

	@Then("user is showed category matched {string}")
	public void user_is_showed_result(String keyword) throws InterruptedException
	{
		java.util.List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
        // Loop through the rows and check if the row matches your criteria
        boolean rowExists = false;
        for (WebElement row : rows) {
            if (row.getText().contains(keyword)) {
                rowExists = true;
                break;
            }
        }

        // Print out the result
        Assert.assertTrue(rowExists);
		
		Thread.sleep(5000);
	}
	
	@Then("show category does not exist {string}")
	public void showed_result(String keyword) throws InterruptedException
	{
		java.util.List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
        // Loop through the rows and check if the row matches your criteria
        boolean rowExists = false;
        for (WebElement row : rows) {
            if (row.getText().contains(keyword)) {
                rowExists = true;
                break;
            }
        }

        // Print out the result
        Assert.assertFalse(rowExists);
		
		Thread.sleep(5000);
	}
	
}
