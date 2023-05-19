package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleDynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement drpDepartureCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        WebElement drpArrivalCity = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));

        Thread.sleep(1000);
        drpDepartureCity.click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(1000);
        drpArrivalCity.click();
        driver.findElement(By.xpath("(//a[@value='STV'])[2]")).click();

        Thread.sleep(1000);
        driver.quit();
    }
}
