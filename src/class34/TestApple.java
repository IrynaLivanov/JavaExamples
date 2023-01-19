package class34;

import java.util.Arrays;

public class TestApple {
    public static void main(String[] args) {


    BaseIphone deviceId1 = new BaseIphone("16.0", 512, "Iphone7", "black");
     BaseIphone deviceId2 = new BaseIphone("14.0", 512, "Iphone8", "black");
     BaseIphone deviceId3 = new BaseIphone("15.0", 256, "Iphone10", "silver");
     BaseIphone deviceId4 = new BaseIphone("15.0", 128, "Iphone8", "matte");

      // arrays with object
      BaseIphone[] allIphones = new BaseIphone[4];
      allIphones[0] = deviceId1;
      allIphones[1] = deviceId2;
      allIphones[2] = deviceId3;
      allIphones[3] = deviceId4;

      updateIOS(allIphones);
        System.out.println(Arrays.toString(allIphones));

    }

    //create a static method that takes an array of all types of Iphones
    // and finds all iphones
    //with an IOSversion that is not 16.0 and updates them to 16.0


    public static void updateIOS(BaseIphone[] baseIphones) {
        for (BaseIphone baseIphone : baseIphones){
            if (!baseIphone.getIosVersion().equalsIgnoreCase("16.0")){
                baseIphone.setIosVersion("16.0");

            }
        }
    }
    //=======>array
    //is collection that can store both primitive and non-primitive data types
    //it has a fixed size
    //it the fastest collection.
    int[] numbers = new int[3];

    String[] anyStrings = new String[4];

    BaseIphone[] iphones = new BaseIphone[100];


  }

