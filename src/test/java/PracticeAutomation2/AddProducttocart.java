package PracticeAutomation2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.practicejenkins.generic2.BaseClass2;
import junit.framework.Assert;
import objectrepository2.Finishpage;
import objectrepository2.Homepage;

public class AddProducttocart extends BaseClass2 {
	@Test(groups="smoke")
	public void productadd()
	{
		Homepage hp=new Homepage(driver);
		hp.home();
		Finishpage fp=new Finishpage(driver);
		fp.checkout();
		fp.information("pravallika","lvp","63256");
		fp.submit();
		fp.finish();
		String actualmsg=driver.findElement(By.xpath("//span[@class='title']")).getText();
		String expectedmsg="CHECKOUT: COMPLETE!";
		Assert.assertEquals(actualmsg,expectedmsg);
		
	}
	@Test(groups="regression")
	public void printallproductprice()
	{
		List<WebElement> E=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		for(WebElement w:E)
		{
			System.out.println(w.getText());
		}
	}

	

}
