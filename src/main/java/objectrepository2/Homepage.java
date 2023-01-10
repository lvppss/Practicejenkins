package objectrepository2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
private WebElement	product;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
private	WebElement cartlink;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
private WebElement	menubutton;
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getProduct() {
		return product;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getMenubutton() {
		return menubutton;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void home()
	{
		product.click();
		cartlink.click();
	}
	public void logout()
	{
		menubutton.click();
		
	}
	public void logout2()
	{
		logout.click();
	}
	

}
