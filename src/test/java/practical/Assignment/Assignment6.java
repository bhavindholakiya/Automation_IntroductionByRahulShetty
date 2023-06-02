package practical.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
    /*
     * 1. select any checkbox
     * 2. Grab the label of the selected checkbox //put into variable
     * 3. Select an option in dropdown. Here option to select should come from step //Do not hard code tfjxt.drive it dynamically from step 2
     * 4. enter the step 2 grabbed label text in Editbox // -
     * 5. Click Alert and then verify if text grabbed from step 2 is present in the pop up message
     */
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        System.out.println(opt);

        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select s = new Select(dropdown);
        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();
        
        String text = driver.switchTo().alert().getText();
        if(text.contains(opt)){
            System.out.println("Alert message success");
        } else {
            System.out.println("Something is wrong with execution");
        }
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).getText());
        driver.close();
    }
}