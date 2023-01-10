package Com.practicejenkins.generic2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Com.practicejenkins.generic.Readdatafrompropertiesfile;
import Com.practicejenkins.generic.Webdriverutility;

import objectrepository2.Homepage;
import objectrepository2.Loginpage2;

public class BaseClass2 {
	public WebDriver driver;
	public Webdriverutility wutil;
	public Readdatafrompropertiesfile prop=new Readdatafrompropertiesfile();
	@BeforeClass
	public void launchingbrowser()
	{
		driver=new ChromeDriver();
		wutil=new Webdriverutility(driver);
		wutil.maximizewindow();
		wutil.waitforpageload();
	}
	@BeforeMethod
	public void login() throws IOException
	{

		String url=prop.readdatafrompropfile("swagurl");
		String pwd=prop.readdatafrompropfile("swagpwd");
		String un=prop.readdatafrompropfile("swagun");
		driver.get(url);
		Loginpage2 Lp=new Loginpage2(driver);
		Lp.login(un, pwd);
		Lp.loginbutton();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		hp.logout();
		Thread.sleep(3000);
				hp.logout2();
	}
	@AfterClass
	public void closingBrowser()
	{
		driver.close();
	}

}
