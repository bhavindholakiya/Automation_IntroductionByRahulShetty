package practical.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7 {
    public static void main(String[] args) {
        /*
         * 1. Print No. of Rows presnet in table
         * 2. Print No. of Columns present in table
         * 3. Print 2nd row's content
         */
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement table = driver.findElement(By.id("product"));

        System.out.println(table.findElements(By.tagName("tr")).size());

        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

        List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

        System.out.println(secondrow.get(0).getText());

        System.out.println(secondrow.get(1).getText());

        System.out.println(secondrow.get(2).getText());

        /*
         * There is another way also
         * System.out.println("No. of row present in table: "+driver.findElements(By.cssSelector("table[name='courses'] tr")).size());
         * 
         * System.out.println("No. of columns present in table: " + driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(1) th")).size());
         * 
         * System.out.println("2nd row content : " +driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());
         */
    }
}
