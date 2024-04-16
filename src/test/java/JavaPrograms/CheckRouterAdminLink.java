package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckRouterAdminLink {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();

        String url = "http://192.168.1.10";
        int count = 1;

        String newCount = Integer.toString(count);

        String finalURL = url.concat(newCount);

        System.out.println("Final URL: "+finalURL);

        for (int i=0; i<=100; i++){
            // Navigate to your router admin page
            driver.get(finalURL);
            Thread.sleep(2000);

            if (driver.getTitle().contains("Problem loading page")) {
                count++;
            } else {
                System.out.println("You are on the router admin page.");
                System.out.println("Your Admin Access page is: "+finalURL);
                break;
            }
        }
    }
}
