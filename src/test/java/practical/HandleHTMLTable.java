package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandleHTMLTable {

    WebDriver driver;
    WebDriverWait wait;
    String country = "United Kingdom";
    By countrySort = By.cssSelector(".column-2.sorting");
    By noNextButton = By.cssSelector(".paginate_button.next.disabled");
    By nextButton = By.cssSelector("#tablepress-1_next");
    @BeforeTest
    public void DriverSetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void getCountry(){
        driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/tables/");
        driver.findElement(countrySort).click();
        String population = getPopulation(country);
        Assert.assertNotEquals(population, "-1", "The country was not found on list");
        System.out.println("The population of "+country+" is " +population);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    public String getPopulation(String country){
        boolean foundCountry = false;

        while (!foundCountry){
            List<WebElement> CountryListedOnFirstPage = driver.findElements(By.xpath("//table[@id='tablepress-1']//td[normalize-space()='"+country+"']"));
            List<WebElement> disableNextButton = driver.findElements(noNextButton);

            if(CountryListedOnFirstPage.size() > 0) {
                foundCountry = true;
            } else if (disableNextButton.size() == 0) {
                click(nextButton);
            } else {
                return "-1";
            }
        }
        return driver.findElement(By.xpath("//td[normalize-space()='"+country+"']/following-sibling::td")).getText();
    }

    public void click(By by){
        driver.findElement(by).click();
    }
}