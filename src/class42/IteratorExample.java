package class42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        // using Index based for loop
        for(int i = 0; i < listOfData.size(); i++){
            System.out.println(listOfData.get(i));
        }

        // for each loop
        for(int item : listOfData){
            System.out.println(item);
        }

        // using Iterator
        Iterator<Integer>itr = listOfData.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
