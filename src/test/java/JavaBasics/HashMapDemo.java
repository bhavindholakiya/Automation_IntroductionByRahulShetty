package JavaBasics;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        /*
        * The HashMap class of the Java collections framework provides the functionality of the hash table data structure.
        * It stores elements in key/value pairs. Here, keys are unique identifiers used to associate each value on a map.
        * The HashMap class implements the Map interface.*/

        HashMap<String, Integer> person  = new HashMap<>();

        System.out.println("Initial HashMap: " +person);
        // put() method to add elements
        person.put("Bhavin", 31);
        person.put("Anuj", 30);
        person.put("Jay Soni", 32);
        person.put("Kirtan", 32);
        System.out.println("HashMap after put(): "+person);

        // get() method to get single value based on the given Key
        System.out.println("Mr. Jay soni is "+person.get("Jay Soni")+" years old.");

        // Return set view of Keys using keySet() method
        System.out.println("Keys: "+person.keySet());

        // Return set view of Value using values() method.
        System.out.println("Values: "+person.values());

        //Return set view of Key/Value pair using enterySet() method.
        System.out.println("Key/Value pair mapping: "+person.entrySet());

        // Replace value of Key using replace() method.
        person.replace("Kirtan", 35);
        System.out.println("Age of Kirtan after replace: "+person.get("Kirtan"));

    }
}