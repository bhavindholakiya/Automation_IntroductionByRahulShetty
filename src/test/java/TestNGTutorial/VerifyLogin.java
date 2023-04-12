package TestNGTutorial;

import org.testng.annotations.Test;

public class VerifyLogin {

    @Test
    public void WebLogin(){
        System.out.println("Web Login");
    }

    @Test
    public void MobileLogin(){
        System.out.println("Mobile Login");
    }

    @Test
    public void LoginViaAPI(){
        System.out.println("Login via API");
    }
}
