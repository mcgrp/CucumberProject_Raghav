package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.Loginpage_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_POM {
	WebDriver driver;
	Loginpage_POM pgs;
	Loginpage_POM pgs1;

	@Given("open chrome browser")
	public void open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Training\\Cucumber_Raghav\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	}

	@And("open app URL")
	public void open_app_url() {
		
		driver.get("https://example.testproject.io/web/");
	  
	}

	@When("^User sends (.*) and (.*)$")
	public void user_sends_userid_and_pwd(String uname, String pwrd) {
		
		 pgs = PageFactory.initElements(driver, Loginpage_POM.class);
		 pgs.signIn(uname, pwrd);
	   
	}

	@And("hit login button")
	public void hit_login_button() { 
		
		pgs.submit();
		 
	}

	@Then("Logout button will be displayed")
	public void logout_button_will_be_displayed() {
		
		boolean d = pgs.logout();
		if(d)
		{
			System.out.println("Login is successful");
		}
		driver.close();
		driver.quit();
	  
	}




}
