package practical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HandlePageAndInsideTableScrolling {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll page by co-ordinats
        js.executeScript("window.scrollBy(0, 500)");

        // Scroll inside a table view by co-ordinates
        js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,100)");

        // Scroll inside a table view to bottom and left
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
        js.executeScript("document.querySelector('.tableFixHead').scrollLeft=2000");

        /*
         * If you want to scroll a table to left then set co-ordinate accordingly
         * e.g .scrollBy(0,0) -> it will scroll to right at beginning
         * e.g. scrollBy(0)
         */

        // This is how you can calculate amount from the table and verify it.
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;
        for (WebElement e : values) {
            sum += Integer.parseInt(e.getText());
        }
        System.out.println("Total Amount Calculated: " + sum);

        int actualTotal = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(" ")[3]);
        //int actualTotal = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(actualTotal, sum);
        driver.quit();
    }
}
