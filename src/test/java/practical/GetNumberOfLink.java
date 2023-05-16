package practical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetNumberOfLink {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Number of links found: " + links.size());

        for (int i = 0; i <= links.size(); i++) {
            System.out.println(links.get(i).getAttribute("href"));
        }

        driver.quit();
    }
}
