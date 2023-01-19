package class41;



import java.util.ArrayList;
import java.util.List;


public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();
        Integer element = 10;

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        System.out.println(listOfData.size()); // 4
        System.out.println(listOfData); // [10,50,20,45]
        System.out.println(listOfData.get(0)); // 10
        System.out.println(listOfData.contains(20)); // true
        System.out.println(listOfData.isEmpty());

        listOfData.remove(new Integer(10));// remove
        listOfData.remove(2); // remove element at index 2



      // Object data[] = listOfData.toArray();
      // for(Object obj : data){
      //     System.out.println();
       }


        }

