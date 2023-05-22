package practical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAutoSuggestionDropDown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> countryList = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement country : countryList) {
            if (country.getText().equalsIgnoreCase("india")) {
                country.click();
                System.out.println("Country selected!");
                break;
            } else {
                System.out.println("Country not found");
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
