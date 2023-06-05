package practical.Assignment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
 
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
 
        String[] itemName = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
 
        doLogin(driver, "rahulshettyacademy", "learning");
        addItems(driver, itemName);
        Thread.sleep(2000);
        driver.quit();
    }
 
    public static void doLogin(WebDriver driver, String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[value='user']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
        Select userType = new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
        userType.selectByValue("consult");
        driver.findElement(By.cssSelector("#terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));
    }
 
    public static void addItems(WebDriver driver, String[] itemName){
        int count = 0;
        List<WebElement> items = driver.findElements(By.cssSelector("h4[class='card-title']"));
 
        for(int i=0; i< items.size(); i++){
            String name = items.get(i).getText();
            List<String> itemList = Arrays.asList(itemName);
            if (itemList.contains(name)){
                count++;
                driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
                if (count == itemName.length){
                    break;
                }
            }
        }
        driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
    }
}
