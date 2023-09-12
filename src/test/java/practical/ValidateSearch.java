package practical;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateSearch {
    public static void main(String[] args) {
        try {
            String PRODUCT = "HP";

            // Browser Set Up and navigate
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://ca.ingrammicro.com/");// difference btw and naviogate/get

            // Checkpoint
            String expected_title = "Computer and Technology Products - Services for Business to Business Needs - Ingram Micro";
            String actual_title = driver.getTitle();
            Assert.assertEquals(actual_title, expected_title, "Title is correct");

            // Search for item
            WebElement txtbx_search = driver.findElement(By.id("searchBox_Global_v2"));
            txtbx_search.sendKeys(PRODUCT);

            driver.findElement(By.id("search-submit-anchor-v2")).click();

            // Check point
            expected_title = "Product Search";
            actual_title = driver.getTitle();
            Assert.assertEquals(actual_title, expected_title, "Product search Title is correct");

            // a[contains(@rel,'#product-title-' )]

            // Fetch all the links Title
            List<WebElement> collection_product_links = driver
                    .findElements(By.xpath("//a[contains(@rel,'#product-title-')]"));

            // Validate if Search result is displayed corresponding
            // to the string which was searched
            for (int i = 0; i < collection_product_links.size(); i++) {
                String temp = collection_product_links.get(i).getText();

                if ((temp.toLowerCase().contains(PRODUCT.toLowerCase()))) {
                    Assert.assertTrue(true, PRODUCT + " is displayed on product title Product Title: " + temp);
                } else {
                    Assert.assertTrue(false, PRODUCT + " is not displayed on product title Product Title: " + temp);

                }

            }
            // div[@class = 'prod-number-container vpn_breakword']/span[2]/
        } catch (Exception e) {
            Assert.assertFalse(false, "Exception thrown. Exception: " + e.toString());
            ;
        }
    }
}
