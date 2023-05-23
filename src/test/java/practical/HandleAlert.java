package practical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlert {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement txtName = driver.findElement(By.name("enter-name"));
        txtName.sendKeys("Bhavin Dholakiya");

        driver.findElement(By.id("alertbtn")).click();

        driver.switchTo().alert().accept();
        System.out.println("Alert Accepted");

        txtName.sendKeys("Prayag Dholakiya");
        driver.findElement(By.id("confirmbtn")).click();

        driver.switchTo().alert().dismiss();
        System.out.println("Alert Dismissed");

        driver.quit();
    }
}
