package TestNGTutorial;

import org.testng.annotations.Test;

public class Day1 {

    @Test (priority = 1, groups={"smoke"})
    public void demo(){
        System.out.println("Demo method called.");
    }

    @Test (priority = 2)
    public void SecondMethod(){
        System.out.println("2nd Method called");
    }
}
