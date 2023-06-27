package JavaStream;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Test1 {
  //@Test
  public void regular() {
	  //Count the number of names starting with "P" in the list.
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("Bhavin");
	  names.add("Prayag");
	  names.add("Jayesh");
	  names.add("Mamta");
	  names.add("Pratham");
	  names.add("Prem");
	  names.add("Dharma");
	  
	  int count = 0;
	  for(int i=0; i<names.size(); i++) {
		  String name = names.get(i);
		  if (name.startsWith("P")) {
			count++;
		}
	  }
	  System.out.println(count);
  }
  
  @Test
  public void streamFilter() {
	//Count the number of names starting with "P" in the list.
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("Bhavin");
	  names.add("Prayag");
	  names.add("Jayesh");
	  names.add("Mamta");
	  names.add("Pratham");
	  names.add("Prem");
	  names.add("Dharma");
	  
	  long count = names.stream().filter(name -> name.startsWith("P")).count();
	  System.out.println(count);
  }
}
