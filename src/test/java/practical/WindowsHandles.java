package practical;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandles {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.className("blinkingText")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID = it.next();
        String childID = it.next();
        System.out.println("Parent ID: " + parentID);
        System.out.println("Child ID: " + childID);
        driver.switchTo().window(childID);

        //String email = driver.findElement(By.cssSelector(".im-para.red strong a")).getText();
        String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        System.out.println("Email: " + email);
        
        driver.switchTo().window(parentID);

        driver.findElement(By.id("username")).sendKeys(email);

        Thread.sleep(2000);

        driver.quit();
    }
}
