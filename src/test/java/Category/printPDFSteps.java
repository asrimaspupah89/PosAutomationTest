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
public class PrintPDfSteps {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hafiz_maulana\\Downloads\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://app.bleven.web.id/login#!");
    }
    @When ("user enters {word} and {word}")
    public void user_enters_Username_and_Password(String Username, String Password) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fiora@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fiora");
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
    }
    @And("clicks on category")
    public void clicks_on_category() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/aside/div/nav/ul/li[4]/a/p")).click();
    }
    @Then("user get pdf")
    public void user_get_pdf() {
        driver.findElement(By.xpath("//*[@id=\"table_wrapper\"]/div[1]/div[1]/div/button[1]")).click();
    }
}


