package TestNGTutorial;

import org.testng.annotations.Test;

public class VerifySignup {

    @Test
    public void SignupViaWeb(){
        System.out.println("Web SignUp");
    }

    @Test
    public void SigupViaMobile(){
        System.out.println("Mobile SignUp");
    }

    @Test
    public void SignUpViaAPI(){
        System.out.println("SignUp via API");
    }
    
    @Test
    public void GoogleAuthentication() {
    	System.out.println("Sigup via Google");
    }
    
    @Test
    public void GoogleDriveSigup() {
    	System.out.println("Google Drive");
    }
}
