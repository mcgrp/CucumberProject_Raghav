package StepDefinitions;

import java.time.Duration;
import java.time.OffsetTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver;
	
	

	@Given("launch Chromedriver")
	public void launch_chromedriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Training\\Cucumber_Raghav\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}

	@And("Launch the url for google")
	public void launch_the_url_for_google() {
		
		driver.get("https://www.google.com/");
	
	   
	}

	@When("User provides facebook in the searchbox")
	public void user_provides_facebook_in_the_searchbox() {
	    
		driver.findElement(By.name("q")).sendKeys("facebook");
	}

	@And("clicks enter key")
	public void clicks_enter_key() {
	   
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("search results should display")
	public void search_results_should_display() {
	 
		driver.getPageSource().contains("Facebook");
	}




}
