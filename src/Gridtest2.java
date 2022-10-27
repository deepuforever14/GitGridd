import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gridtest2 {
	@Test
	public void HomePage() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN11);
		caps.setCapability(CapabilityType.BROWSER_VERSION,true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.55.104:4444"),caps);
		//
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.findElement(By.name("q"));
		driver.close();
	}

}
