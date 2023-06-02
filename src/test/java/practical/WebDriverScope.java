package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WebDriverScope {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // 1. Get number of links count present in entire page.
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("Available Links: "+Links.size());

        //2. Get number of links present inside only Footer section.
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        List<WebElement> footerLinks = footerDriver.findElements(By.tagName("a"));
        System.out.println("Footer links : "+footerLinks.size());

        //3. Get Number of links present inside 1st block in Footer section.
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        List<WebElement> couponsLink = columnDriver.findElements(By.tagName("a"));
        System.out.println("Links under 1st section in footer: "+couponsLink.size());

        //4. Click each link in present inside 1st block in Footer section.
        for (int i = 1; i < couponsLink.size(); i++) {
            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
            Thread.sleep(2000L);
        }

        //5. Get each link window title and print 
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        driver.quit();
    }
}
