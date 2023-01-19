package class43;

import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfNames {
    public static void main(String[] args) {

        String names = "ira pasha ali max " +
                "max chirag max ira maggie" +
                " yana ira pasha max";

        String[] arrayOfNames = names.split(" ");

                          // for(String name : arrayOfNames){
                          // System.out.println(name);

        Map<String, Integer> frequency = new HashMap<>();
        for (String name : arrayOfNames) {
            if (frequency.containsKey(name)) {
                //  int count = frequency.get(name);
                // frequency.put(name, count + 1);
                frequency.put(name, frequency.get(name) + 1);
            } else {
                frequency.put(name, 1);
            }
        }
            System.out.println(frequency);


        int getMaxValue = (Collections.max(frequency.values()));

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {

            if (entry.getValue() == getMaxValue) {
                System.out.println("Name of the person who is having \nthe greatest frequency is " + entry.getKey() + " - " + getMaxValue);
            }
        }
    }
}


