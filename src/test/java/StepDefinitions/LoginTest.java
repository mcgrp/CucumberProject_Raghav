package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	WebDriver driver;
	
	@Given("Launch any browser")
	public void launch_any_browser() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Automation Training\\Cucumber_Raghav\\src\\test\\resources\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().window().maximize();
	   
	}

	@And("Launch the URL")
	public void launch_the_url() {
		
		driver.get("https://example.testproject.io/web/");
		
	   
	}

	@When("^User gives (.*) and (.*)$")
	public void user_gives_username_and_password(String userid, String pwd) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(userid);
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(pwd);
	  
	}

	@And("User Clicks on Login button")
	public void user_clicks_on_login_button() throws Throwable {
	 
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
	}

	@Then("Logout button should be displayed")
	public void login_button_should_be_displayed() {
	   Boolean res= driver.findElement(By.id("logout")).isDisplayed();
	   System.out.println(res);
	   if(true)
	   {
		   System.out.println("successfully signed in");
	   }
	   
	   driver.close();
	   driver.quit();
	   
	}


	}


