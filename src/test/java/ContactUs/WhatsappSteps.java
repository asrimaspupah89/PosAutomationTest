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
public class WhatsappSteps {
    WebDriver driver = null;

    @Given("browser open")
    public void browser_open(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hafiz_maulana\\Downloads\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    @And("user on login page")
    public void user_on_login_page() {
        driver.navigate().to("https://app.bleven.web.id/login#!");
    }
    @When ("user enterss {word} and {word}")
    public void user_enterss_Username_and_Password(String Username, String Password) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fiora@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fiora");
    }
    @And("clickss on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
    }
    @And("clicks on contactus")
    public void clicks_on_contactus() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/nav/ul/li[8]/a/p")).click();
    }
    @And("clicks on whatsapp button")
    public void clicks_on_whatsapp_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/section/div/div/div[2]/div/div/div[2]/div[1]/div[2]/a/p")).click();
    }
    @Then ("go to whatsapp")
    public void go_to_whatsapp() {
        driver.findElement(By.xpath("//*[@id=\"action-button\"]")).isDisplayed();
    }
}


