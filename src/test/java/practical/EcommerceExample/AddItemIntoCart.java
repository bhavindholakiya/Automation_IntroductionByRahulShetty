package practical.EcommerceExample;

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
import org.testng.Assert;

public class AddItemIntoCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        String[] veggies = {"Cucumber", "Brocolli", "Tomato"};

        addItems(driver, veggies);
        navigateToCart(driver);
        applyAndVerifyPromoCode(driver, "rahulshettyacademy");
        /*clickPlaceOrderButton(driver);

        Select drpCountry = new Select(driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select")));
        drpCountry.selectByValue("India");
        System.out.println("Country is selected");

        driver.findElement(By.cssSelector("input.chkAgree")).click();
        driver.findElement(By.cssSelector("div[class='wrapperTwo'] button")).click();*/

        Thread.sleep(2000);
        driver.quit();
    }

    public static void addItems(WebDriver driver,String[] veggies) throws InterruptedException {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

        for(int i=0; i<products.size(); i++){
            String[] names = products.get(i).getText().split("-");
            String formattedName = names[0].trim();

            // Covert array into ArrayList for easy search
            // Check whether name you extracted that present in arrayList or not.
            List<String> vegetablesList  = Arrays.asList(veggies);
            if(vegetablesList.contains(formattedName))
            {
                j++;
                System.out.println(formattedName);
                driver.findElements(By.xpath("//div[@class='product-action']/button[@type='button']")).get(i).click();
                if(j==veggies.length) {
                    break;
                }
            }
        }
        Thread.sleep(2000);
    }

    public static void applyAndVerifyPromoCode(WebDriver driver, String promoCode){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))).sendKeys(promoCode);
        System.out.println("Promo code entered");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        System.out.println("Apply Promo button is clicked");
        String promoMsg = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))).getText();
        System.out.println(promoMsg);
        Assert.assertEquals(promoMsg, "Code applied ..!");
    }

    public static void navigateToCart(WebDriver driver){
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        System.out.println("Cart button clicked");
        driver.findElement(By.cssSelector(".cart-preview.active button")).click();
        System.out.println("Proceed to place button clicked");
    }

    public static void clickPlaceOrderButton(WebDriver driver){
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        System.out.println("Order Placed successfully...!");
    }
}
