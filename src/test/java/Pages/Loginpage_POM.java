package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage_POM {
	
	@FindBy(xpath="//input[@id='name']")
	WebElement userid;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='login']")
	WebElement loginbtn;
	
	
	@FindBy(xpath="//button[@id='logout']")
	WebElement logoutbtn;
	
	public void signIn(String usrid,String pwd)
	{
	   userid.sendKeys(usrid);
	   password.sendKeys(pwd);
	   
	}
	
	public void submit() 
	{
		loginbtn.click();
	}

	public boolean logout() 
	{
		boolean ac = logoutbtn.isDisplayed();
		return ac;
	}
	
	
	

}
