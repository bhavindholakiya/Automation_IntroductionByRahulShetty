package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Jems Bond");
        driver.findElement(By.name("email")).sendKeys("jems.bond1023@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
        driver.findElement(By.id("exampleCheck1")).click();
        Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        select.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("08/11/1995");
        driver.findElement(By.cssSelector(".btn-success")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
    }
}
