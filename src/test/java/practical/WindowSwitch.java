package practical;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String ParentID = driver.getWindowHandle();

        driver.findElement(By.cssSelector("a[href*='linkedin']")).click();
        driver.findElement(By.cssSelector("a[href*='facebook']")).click();
        driver.findElement(By.cssSelector("a[href*='youtube']")).click();
        driver.findElement(By.cssSelector("a[href*='twitter']")).click();

        Set<String> handles = driver.getWindowHandles();
        List<String> hList = new ArrayList<String>(handles);

        // print right window url and title to validate.
        if (SwitchToRightWindow("Facebook", hList)){
            System.out.println(driver.getCurrentUrl() +" : "+driver.getTitle());
        }
        SwitchToParentWindow(ParentID);
        CloseAllOtherWindow(hList, ParentID);
    }

    public static boolean SwitchToRightWindow(String windowTitle, List<String> hList) {
        for (String e : hList) {
            String title = driver.switchTo().window(e).getTitle();
            // Here we do check if current  window title match with expected title.
            if (title.contains(windowTitle)){
                System.out.println("found right window...");
                return true;
            }
        }
        return false;
    }

    public static void SwitchToParentWindow(String ParentWindowID){
        driver.switchTo().window(ParentWindowID);
        System.out.println(driver.getCurrentUrl() +" : "+driver.getTitle());
    }

    public static void CloseAllOtherWindow(List<String> hList, String ParentWindowID){
        for (String e : hList){
            if (!e.equals(ParentWindowID)){
                driver.switchTo().window(e).close();
            }
        }
    }

}
