package practical;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationExercise {
    public static void main(String[] args) throws InterruptedException {
        
        String baseURL = "https://app.skilldb.com/login";
        
        //WebDriver driver = new FirefoxDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);

        driver.findElement(By.cssSelector("input#email")).sendKeys("bhavin.dholakiya@openxcell.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("QAwsedrf@23");
        driver.findElement(By.cssSelector("button[class='Polaris-Button'] span[class='Polaris-Button__Text']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='Polaris-TopBar-UserMenu__Details']")));
        System.out.println("logged in successfully");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("My Profile")))).click();
        System.out.println("My Profile link clicked");

        driver.findElement(By.xpath("//span[@class='Polaris-Button__Text'][normalize-space()='Edit Profile']")).click();
        System.out.println("Edit Profile button is clicked");

        /*Thread.sleep(100);
        WebElement drpSal = driver.findElement(By.cssSelector(".Polaris-Select__Input #PolarisSelect1"));
        wait.until(ExpectedConditions.elementToBeClickable(drpSal)).click();

        Select drpSalutation = new Select(drpSal);
        drpSalutation.selectByValue("Prefer to not say");
        System.out.println("Salutation selected.");*/
        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstName"))).sendKeys("Bhavin Openxcell");

        //driver.findElement(By.name("firstName")).sendKeys("Bhavin Openxcell");
        driver.findElement(By.name("middleName")).sendKeys("Bhimjibhai");
        driver.findElement(By.name("lastName")).sendKeys("Prajapati");

        driver.findElement(By.xpath("//span[contains(text(),'Save and next')]")).click();
        System.out.println("Save and Next button clicked");

        Thread.sleep(5000);
        
        driver.quit();
    }
}
