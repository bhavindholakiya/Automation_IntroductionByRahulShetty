package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CustomizeXpathAndCssSelectors {
    public static void main(String[] args) throws InterruptedException {
        String baseURL = "https://rahulshettyacademy.com/";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
        System.out.println("browser launched");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println("Navigate to the website");
        driver.findElement(By.linkText("Forgot your password?")).click();
        System.out.println("Forgot password link clicked");
        //Here, used customized xpath with index of the element.
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("John Doe");
        System.out.println("First name entered");

        //Here, used customized CssSelector with index of the element.
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@hotmail.com");
        System.out.println("Email address entered");
        Thread.sleep(1000);

        //Cleared entered email address by customized xpath and clear() method.
        driver.findElement(By.xpath(".//input[@type='text'][2]")).clear();
        System.out.println("Email address cleared.");
        Thread.sleep(1000);
        //Re-enter email address using customized xpath
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("prayag@hotmail.com");
        System.out.println("New email address entered.");
        Thread.sleep(2000);

        driver.quit();
    }
}
