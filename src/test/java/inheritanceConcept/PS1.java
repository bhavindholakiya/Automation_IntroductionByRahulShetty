package inheritanceConcept;

import org.testng.annotations.Test;

public class PS1 extends PS{

	PS2 ps2 = new PS2(3); //Parameterized constructor
	@Test
	public void testRun() {
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiplyByTwo());
		System.out.println(ps2.multiplyByThree());
	}
}
