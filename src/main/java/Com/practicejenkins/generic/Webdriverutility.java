package Com.practicejenkins.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutility {
	WebDriver driver;
	Select select;
	
	public Webdriverutility(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void maximizewindow()
{
	driver.manage().window().maximize();
}
public void minimizewindow()
{
	driver.manage().window().minimize();
}
public void waitforpageload()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void dropdownbyindex(WebElement element,int index)
{
Select select=new Select(element);
select.selectByIndex(index);
			
}
public void dropdownbyvisibletext(WebElement element,String text) {
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
public void dropdownbyvalue(WebElement element,String value)
{
	Select select=new Select(element);
	select.selectByValue(value);

	
}
public void acceptAlert()
{
	driver.switchTo().alert().accept();
}
public void dismissalert()
{
	driver.switchTo().alert().dismiss();
}
public void mouseaction(WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
	
	
}

}
