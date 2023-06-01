package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleiFrames {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement sourceEle = driver.findElement(By.id("draggable"));
        WebElement targetEle = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);
        a.dragAndDrop(sourceEle, targetEle).build().perform();;

        Thread.sleep(2000);
        driver.quit();
    }
}
