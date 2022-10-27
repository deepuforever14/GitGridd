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

public class Gridtest {
	@Test
	public void HomePage() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN11);
		//caps.setCapability(CapabilityType.BROWSER_VERSION,true);
		//caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.55.104:4444"),caps);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q"));
		
	}

}
