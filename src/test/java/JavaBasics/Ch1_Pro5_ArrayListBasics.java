package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ch1_Pro5_ArrayListBasics {
    public static void main(String[] args) {

        // In Java, ArrayList is a class of Collections framework. It implements List<E>, Collection<E>, Iterable<E>,
        // Cloneable, Serializable, and RandomAccess interfaces. It extends AbstractList<E> class.

        // An array is a dynamically-created object. It serves as a container that holds the constant number of values
        // of the same type. It has a contiguous memory location. Once an array is created, we cannot change its size.

        ArrayList<String> a = new ArrayList<String>();
        a.add("Bhavin");
        a.add("Prayag");
        a.add("Mamta");
        a.add("Dharm");
        a.add("Pratham");
        a.add("Bhavya");
        System.out.println(a.get(2));

        System.out.println("----------------- Traditional For Loop ----------------------------");
        for(int i = 0; i<a.size(); i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println(a.contains("Pratham"));
        System.out.println("----------------- Enhanced For Loop ----------------------------");
        for ( String val : a)
        {
            System.out.println(val);
        }
        System.out.println("---------------------------------------------");
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(45);
        n.add(4);
        n.add(5);
        n.add(21);
        n.add(23);
        System.out.println(n.get(3));
        System.out.println("---------------------------------------------");

        // This is how you can convert your tradition array to ArrayList
        String[] name = { "Bhavin", "Jayesh", "Mamta", "Geeta" };
        List<String> nameArrayList = Arrays.asList(name);
        System.out.println(nameArrayList.get(2));
    }
}