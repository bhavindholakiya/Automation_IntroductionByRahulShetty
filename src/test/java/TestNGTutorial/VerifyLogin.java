package TestNGTutorial;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyLogin {
 
	@Parameters({"browser", "isHeadless"})
    @Test (groups={"smoke"})
    public void LoginViaWeb(String browser, Boolean isHeadless){
        System.out.println("Web Login");
        System.out.println("Your application will be run in " +browser+ " and it is "+isHeadless+" headless" );
    }

    @Test
    public void LoginViaMobile(){
        System.out.println("Mobile Login");
    }

    @Parameters({"baseURL"})
    @Test
    public void LoginViaAPI(String baseURL){
        System.out.println("Login via API base URL is "+baseURL);
    }
        
    @Test (groups={"smoke"}) 
    public void GoogleAuthentication() {
    	System.out.println("Login via Google");
    	Assert.assertTrue(false);
    }
    
    @Test
    public void GoogleDrive() {
    	System.out.println("Google Drive Login");
    }
}
