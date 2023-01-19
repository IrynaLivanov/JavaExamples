package class42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        System.out.println(listOfData);

       Set<Integer> setOfData = new HashSet<>();

        setOfData.add(10);
        setOfData.add(50);
        setOfData.add(20);
        setOfData.add(45);

      System.out.println(setOfData); // print random numbers from the list

        // you can retrieve data from set by using for loop only
        for(int num : setOfData){
            System.out.println(num);
        }

    }
}
