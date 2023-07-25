package JavaStream;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamFilter {
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
	  /*
	   * The ‘filter’ method is used to eliminate elements based on a criteria. 
	   * The following code segment prints a count of names starting with "P" using filter.
	   */
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("Bhavin");
	  names.add("Prayag");
	  names.add("Hari");
	  names.add("Mamta");
	  names.add("Pratham");
	  names.add("Prem");
	  names.add("Jay");
	  /*
	   *There is no life for intermediate operation if there is no terminal operation.
	   *Terminal operation will execute only if intermediate operation (e.g. filter) returns true.
	   *We can create Stream using java.util.Stream package
	   *How to use filter in Stream API 
	   */
	  
	  long count = names.stream().filter(name -> name.startsWith("P")).count();
	  System.out.println(count);
	  
	  long d = Stream.of("Bhavin", "Prayag", "Jayesh", "Mamta", "Pratham", "Prem", "Dharma").filter(s->
			  {
				  s.startsWith("B");
				  return true;
			  }).count();
	  System.out.println(d);

	  /*
	  * Print all the name length greater than 4 from the given ArrayList
	  * By Using Stream, we can achieve with one line of code and if go with traditional way there we need to write
	  * number of lines of code
	  */

	  names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

  }
}
