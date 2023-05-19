package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement drp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(drp);
        select.selectByValue("USD");
        Thread.sleep(1000);
        driver.quit();
    }
}
