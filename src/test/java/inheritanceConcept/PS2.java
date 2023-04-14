package inheritanceConcept;

public class PS2 extends PS3 {
	
	int a;
	
	public PS2(int a) {
		// this.a is belongs to class variable and it a will be assigned to this.a
		// By using constructor and assigning value, we don't need to set variable value every time when call method from  
		super(a); // parent class constructor is invoked
		this.a = a; 
	}

	public int increment() {
		a = a + 1;
		return a;
	}
	
	public int decrement() {
		a = a - 1;
		return a;
	}
}
