package practical.EcommerceExample;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddItemIntoCart {
	public static void main(String[] args) throws InterruptedException {
        
		int j = 0;
        String[] veggies = {"Cucumber", "Brocolli", "Tomato"};
        
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                             
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
                if(j==3) {
              	   break;
                 }
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
