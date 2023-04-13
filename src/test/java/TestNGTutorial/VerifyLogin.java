package TestNGTutorial;

import org.testng.annotations.Test;

public class VerifyLogin {

    @Test
    public void LoginViaWeb(){
        System.out.println("Web Login");
    }

    @Test
    public void LoginViaMobile(){
        System.out.println("Mobile Login");
    }

    @Test
    public void LoginViaAPI(){
        System.out.println("Login via API");
    }
    
    @Test
    public void GoogleAuthentication() {
    	System.out.println("Login via Google");
    }
    
    @Test
    public void GoogleDrive() {
    	System.out.println("Google Drive");
    }
}
