package TestNGTutorial;

import org.testng.annotations.Test;

public class VerifySignup {

    @Test
    public void WebSignUp(){
        System.out.println("Web SignUp");
    }

    @Test
    public void MobileSignUp(){
        System.out.println("Mobile SignUp");
    }

    @Test
    public void SignUpViaAPI(){
        System.out.println("SignUp via API");
    }
}
