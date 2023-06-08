package practical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSLCert {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        
        driver.quit();
    }
}
