package practical.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment5 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
 
        driver.manage().window().maximize();
 
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrame = driver.findElement(By.tagName("body"));
        System.out.println(middleFrame.getText());
        
        driver.quit();
    }
}
