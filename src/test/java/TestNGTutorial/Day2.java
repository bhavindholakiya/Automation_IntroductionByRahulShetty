package TestNGTutorial;

import org.testng.annotations.Test;

public class Day2 {

    @Test (groups={"smoke"})
    public void pLoan(){
        System.out.println("This is personal loan");
    }

    @Test
    public void pLoanCloser(){
        System.out.println("Bye, Bye");
    }
}
