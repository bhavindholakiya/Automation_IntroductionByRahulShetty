package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        WebElement accountMenu = driver.findElement(By.cssSelector("#nav-link-accountList"));

        /* By using Actions class in Selenium we can achieve many user actions such as Cursor Hoever, Right click, Hold and Click, Long press key, etc. */
        Actions a = new Actions(driver);

        // You can cursor hover using moveToElement method then use .build() then use .perform()
        // .build() --> It indicats that action is ready to perform on the desired element.
        // .perform() --> using this method you can perform action on the desired element.
        a.moveToElement(accountMenu).build().perform();

        // Press Shift key then key in text using below command.
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
                .sendKeys("hello test").build().perform();

        // .contextClick() helps you to peform Right Click in Selenium
        a.moveToElement(accountMenu).contextClick().build().perform();

        Thread.sleep(200);
        driver.quit();
    }
}
