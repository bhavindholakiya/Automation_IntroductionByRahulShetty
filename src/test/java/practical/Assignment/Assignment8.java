package practical.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment8 {
    public static void main(String[] args) throws InterruptedException {
        // Assignment: Autocomplete Dropdown Assignment
        // This Assignment will help you to get Hands on in Autocomplete/Suggeson dropdowns
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement> countries = driver.findElements(By.xpath("(//li[@class='ui-menu-item'])"));
        
        for (WebElement country : countries) {
            if(country.getText().equalsIgnoreCase("India")){
                country.click();
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
