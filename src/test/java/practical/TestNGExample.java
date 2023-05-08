package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGExample {

    public static String baseURL = "https://rahulshettyacademy.com/";
    public static String browser = "chrome";
    public static WebDriver driver = null;
    public static WebDriverWait wait;

    @BeforeSuite
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(baseURL);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public static void launchBrowser(){
        System.out.println("Page title: "+driver.getTitle());
        System.out.println("Current page url: "+driver.getCurrentUrl());
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        System.out.println("Login page url: "+driver.getCurrentUrl());
    }

    @Test(priority = 1)
    public static void verifyInvalidUsernameAndPassword(){
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println("Navigated to Locators Practice page.");

        // below the element is located by ID attribute
        driver.findElement(By.id("inputUsername")).sendKeys("bhavin@ekantik.com");
        //wait.until(ExpectedConditions.elementToBeClickable(txtUsername));

        // below element is located by Name attribute
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");

        // below element is located by CssSelector
        // Syntax of CssSelectors are
        // Class Name -> tagname.classname -> button.signInBtn
        // Id -> tagname#id -> input#inputUsername
        // Tagname[attribute='value'] -> input[input='Username']

        driver.findElement(By.cssSelector("button.signInBtn")).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.error")));
        String expectedErrMsgText = "* Incorrect username or password";
        String actualErrMsgText = driver.findElement(By.cssSelector("p.error")).getText();
        Assert.assertEquals(actualErrMsgText, expectedErrMsgText);
        System.out.println("Actual Error message: "+actualErrMsgText);
    }

    @Test(priority = 2)
    public void navigateToForgotPasswordForm(){
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John Doe");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@hotmail.com");
    }

    @AfterSuite
    public void teadDown(){
        driver.quit();
        System.out.println("Browser closed.");
    }
}