package practical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Intro {

	public static void main(String[] args) {		

		String baseURL = "https://rahulshettyacademy.com/";
		String browser = "chrome";
		WebDriver driver = null;

		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavin\\Downloads\\chromedriver\\chromedriver.exe");
			// In latest Selenium 4.6.0 version selenium introduce SeleniumManager so we don't need to write above line to invoke browser driver.

			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			// driver object here has access to the methods of Chrome driver which are defined in WebDriver interface.
		} else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bhavin\\Downloads\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhavin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get(baseURL);
		String ActualTitle = driver.getTitle();
		System.out.println("Page Title: "+ActualTitle);
		System.out.println("Current URL: "+driver.getCurrentUrl());
		driver.quit();
	}

}
