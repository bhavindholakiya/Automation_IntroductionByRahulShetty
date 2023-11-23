package WebDriverListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import java.time.Duration;

public class ListenerMainClass {

    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverListener listener = new WebDriverListeners();
        WebDriver decorated = new EventFiringDecorator<>(listener).decorate(driver);
        decorated.get("https://www.google.com/");
        decorated.findElement(By.name("q")).sendKeys("Selenium WebDriver Even Listener");
        decorated.findElement(By.xpath("//form[@role='search']")).submit();
    }
}
