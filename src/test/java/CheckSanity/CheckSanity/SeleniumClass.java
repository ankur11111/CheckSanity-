package CheckSanity.CheckSanity;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {
	@Test
public void testFirst()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ankur\\Desktop\\Export\\selenium\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	
	FirefoxDriver fd=new FirefoxDriver();
	fd.get("https://www.nobroker.in");
}	
}
