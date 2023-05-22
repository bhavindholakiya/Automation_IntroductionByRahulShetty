package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HandleCheckbox {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        driver.findElement(By.id("checkBoxOption1")).click();

        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); // Should Print True

        driver.findElement(By.id("checkBoxOption1")).click();

        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); // Should Print false

        driver.findElements(By.cssSelector("input[value='checkbox']")).size();

        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected(), "Checkbox1 is selected");

        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected(), "Checkbox1 is not selected");

        System.out.println(
                "Number of checkbox present : " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        /*
         * driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         * System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).
         * isSelected());
         * driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
         * System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).
         * isSelected());
         */

        driver.quit();

    }
}
