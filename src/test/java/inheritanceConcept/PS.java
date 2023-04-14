package inheritanceConcept;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PS {
	
	@BeforeTest
	public void beforeRun() {
		System.out.println("Run me first before PS");
	}	
	
	public void doThis() {
		System.out.println("I am here in PS");
	}

	@AfterTest
	public void afterRun() {
		System.out.println("Run me at last in PS");
	}
}
