package class42;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();

        personAge.put("Ira",45); // (index /key, value)
        personAge.put("Ira",20);
        personAge.put("Chirag",30);
        personAge.put("Vlad",65);
        personAge.put("Igor",22);
        personAge.put("Ali",18);
        personAge.put("Ali",28);

        System.out.println(personAge); // what is inside the HashMap

         //list of keys
        Set<String> setOfKeys = personAge.keySet();

        for(String key : setOfKeys) {
            System.out.println(key + " = " + personAge.get(key));
        }

        // Retrieving collections of pair

        Set<Map.Entry<String, Integer>> pairs = personAge.entrySet();

        for(Map.Entry<String, Integer> pair : pairs) {

            System.out.println(pair.getKey() + "=" + pair.getValue());

        }
        System.out.println(personAge.get("Ira"));
    }
}
