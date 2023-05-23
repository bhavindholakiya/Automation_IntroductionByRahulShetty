package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class e2eFlightBooking {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='STV']"))
                .click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        Thread.sleep(1000);

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("It's Disabled!");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        WebElement paxDrp = driver.findElement(By.id("divpaxinfo"));
        paxDrp.click();
        Thread.sleep(1000);

        WebElement btnPlusAdlt = driver.findElement(By.id("hrefIncAdt"));
        for (int i = 1; i < 5; i++) {
            btnPlusAdlt.click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(paxDrp.getText(), "5 Adult");
        System.out.println("Selected pax value is " + paxDrp.getText());

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}
