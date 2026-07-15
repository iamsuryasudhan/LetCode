package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;





public class Base {

	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void launchbrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();	
			
			driver.get("https://letcode.in");
			System.out.println("Test running on" +browserName)	;
					
		driver.quit();
	}
	}
}
	
	
	
	
	
	

