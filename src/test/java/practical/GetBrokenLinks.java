package practical;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class GetBrokenLinks {
    public static void main(String[] args) throws MalformedURLException, IOException {
        /*
         * Broken URL
         * Step 1 - is to get all urls tied up to the links using Selenium
         * Java methods will call URL's and gets you the status code
         * If status code >400 then that url is not working -> link which tied to url is
         * broken
         * a[href*='soapui']
         */

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        SoftAssert a = new SoftAssert();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int resCode = conn.getResponseCode();
            System.out.println("Response Code: " + resCode);
            a.assertTrue(resCode<400, "The link with text "+link.getText()+" is broken with response code "+resCode);
        }
        a.assertAll();
        driver.quit();
    }
}
