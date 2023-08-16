package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamMap {
    
    @Test
    public void streamMap(){        
	    
	    List<String> names = Arrays.asList("Bhavin", "Prayag", "Hari", "Xamrian", "Mamta", "Zamin", "Pratham", "Prem", "Pankti");

		List<String> names1 = Arrays.asList("Jay", "Anuj", "Pooja", "Keval", "Kirtan");
	    
	    // Print all the name from the Given arrays in UpperCase.
	    System.out.println("-----------------------------------");
	    names.stream().map(s->s.toUpperCase()).forEach(System.out::println);
	    
	    // print the name which have last letter "m" with UpperCase.
	    System.out.println("-----------------------------------");
	    names.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(System.out::println);
	    
	    // Print names which have first letter as "P" with UpperCase and sorted.
	    System.out.println("-----------------------------------");	    
	    names.stream().filter(s->s.startsWith("P")).sorted().map(s->s.toUpperCase()).forEach(System.out::println);

		System.out.println("---------Descending Order Sorting using Stream -------------");
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	    
		System.out.println("--------- Concat two stream -------------");
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
    }
}
