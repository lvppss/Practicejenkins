package objectrepository2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	@FindBy(xpath="//input[@id='user-name']")
private	WebElement username;
	@FindBy(xpath="//input[@id='password']")
private	WebElement password;
	@FindBy(xpath="//input[@id='login-button']")
private WebElement	loginbutton;
	public Loginpage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
	
	

}
