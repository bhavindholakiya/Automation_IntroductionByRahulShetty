package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleUpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement drp = driver.findElement(By.id("divpaxinfo"));
        drp.click();
        Thread.sleep(1000);

        WebElement btnPlusAdlt = driver.findElement(By.id("hrefIncAdt"));
        /*int i = 1;
        while (i < 4) {
            btnPlusAdlt.click();
            i++;
        } */

        for(int i = 1; i < 5; i++){
            btnPlusAdlt.click();
        }
        
        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(1000);
        System.out.println("Selected value is "+drp.getText());
        driver.quit();
    }
}
