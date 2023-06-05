package practical.Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();   
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.switchTo().window(parentID);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
    }
}
