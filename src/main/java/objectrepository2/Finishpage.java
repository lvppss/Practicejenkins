package objectrepository2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finishpage {
	@FindBy(xpath="//button[@id='checkout']")
private WebElement	checkout;
	@FindBy(xpath="//input[@placeholder='First Name']")
private	WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
private WebElement	lastname;
	@FindBy(xpath="//input[@id='postal-code']")
private WebElement	pincode;
	@FindBy(xpath="//input[@type='submit']")
private WebElement	submit;
	@FindBy(xpath="//button[@data-test='finish']")
private WebElement	finish;
	public Finishpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getFinish() {
		return finish;
	}
	public void checkout()
	{
		checkout.click();
	}
	public void information(String fn,String ln,String pn)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		pincode.sendKeys(pn);
	}
	public void submit()
	{
		submit.click();
	}
	public void finish()
	{
		finish.click();
		
	}
	

}
