import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deletecookie {
	
	
	public WebDriver driver;
	
	// Deleting the specific cookie with cookie name "--utmb"
	@Test
	public void deleteCookieNamedExample()

	{
		driver= new FirefoxDriver();
		String URL="http://www.evz.ro";
		driver.navigate().to(URL);
		driver.manage().deleteCookieNamed("__utmb");

	}
	
	
	// Deleting all the cookies of the domain
	@Test
	public void deleteAllCookiesExample()
	{
		driver= new FirefoxDriver();
		String URL="http://www.evz.ro";
		driver.navigate().to(URL);
		driver.manage().deleteAllCookies();
	}
	

}
