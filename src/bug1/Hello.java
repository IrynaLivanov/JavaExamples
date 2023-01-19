package bug1;

public class Hello {
    public static void main(String[] args) {
        //   int listOfData[] = {34, 65, 26, 23, 16, 23};
        // for (int i = listOfData.length - 1; i > 0; i--) {
        //       System.out.println(listOfData[i]);
        // }
        //}

        int listOfData[] = {34, 65, 26, 23, 16, 23};
        for (int i = 0; i < listOfData.length; i++) {
            System.out.println(listOfData[i % 3]);
        }
    }
}
