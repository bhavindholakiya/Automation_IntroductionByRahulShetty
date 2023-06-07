package practical;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCalendar {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*"); 
		 * WebDriver driver = new ChromeDriver(options);
		 */
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(1000);
		WebElement calendar = driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']"));
		js.executeScript("arguments[0].scrollIntoView();", calendar);
		wait.until(ExpectedConditions.elementToBeClickable(calendar)).click();

		// Keep on Click next button until desire month not found.
		while (!driver.findElement(By.className("flatpickr-current-month")).getText().contains("October")) {
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}

		// Once desired month found, get desired date and click it.
		List<WebElement> allDates = driver.findElements(By.cssSelector(".flatpickr-day "));
		for (int i = 0; i < allDates.size(); i++) {
			String getDate = allDates.get(i).getText();
			if (getDate.equalsIgnoreCase("23")) {
				allDates.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
