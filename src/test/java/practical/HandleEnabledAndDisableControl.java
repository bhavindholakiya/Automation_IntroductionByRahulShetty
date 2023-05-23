package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HandleEnabledAndDisableControl {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        // System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("It's Enabled!");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        driver.quit();
    }
}
