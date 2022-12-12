package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestNGExample {

    public static String baseURL = "https://rahulshettyacademy.com/";
    public static String browser = "chrome";
    public static WebDriver driver = null;
    public static WebDriverWait wait;

    @BeforeTest
    public static void browserSetup(){
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavin\\Downloads\\chromedriver\\chromedriver.exe");
            // In latest Selenium 4.6.0 version selenium introduce SeleniumManager so we don't need to write above line to invoke browser driver.

            driver = new ChromeDriver();
            // driver object here has access to the methods of Chrome driver which are defined in WebDriver interface.
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bhavin\\Downloads\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhavin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(baseURL);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public static void lanuchBrowser(){
        System.out.println("Page title: "+driver.getTitle());
        System.out.println("Current page url: "+driver.getCurrentUrl());
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        System.out.println("Login page url: "+driver.getCurrentUrl());
        driver.quit();
    }
}
