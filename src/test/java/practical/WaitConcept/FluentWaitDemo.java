package practical.WaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("div[id='start'] button")).click();

        /* Wait is an Interface in Selenium same as WebDriver Interface
        * And there are two different class 1) WebDriverWait and 2)FluentWait
        * Both are looks same and behaving also same
        * The main difference is WebDriverWait has pre-defined methods whereas FluentWait doesn't have any pre-defined method for element.
        * */
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(
                new Function<WebDriver, WebElement>() {
                    public WebElement apply(WebDriver driver){
                        if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
                        {
                            return driver.findElement(By.cssSelector("div[id='finish'] h4"));
                        } else
                            return null;
                    }
                }
        );
        System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());

        driver.quit();
    }
}
