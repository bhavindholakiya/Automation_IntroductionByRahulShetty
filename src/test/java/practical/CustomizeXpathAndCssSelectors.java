package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CustomizeXpathAndCssSelectors {
    public static void main(String[] args) throws InterruptedException {
        String baseURL = "https://rahulshettyacademy.com/";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();

        //Here, used customized xpath with index of the element.
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("John Doe");

        //Here, used customized CssSelector with index of the element.
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@hotmail.com");
        Thread.sleep(1000);

        //Cleared entered email address by customized xparth and clear() method.
        driver.findElement(By.xpath(".//input[@type='text'][2]")).clear();
        Thread.sleep(1000);
        //Re-enter email address using customized xpath
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("prayag@hotmail.com");
        Thread.sleep(2000);

        driver.quit();
    }
}
