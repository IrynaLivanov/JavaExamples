package class36.apple.iphone;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;
import java.util.Scanner;

public class IphoneDriver {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int again = 0;
        do{
            System.out.println("Please choose an ");
            int model = userInput.nextInt();

         //  BaseIphone b = new BaseIphone() {

         //   };
          //  switch(model){
               // case 7:
                   // b = new Iphone7(60,"Welcome", false);
                //    break;
             //   case 8:
                  //  b = new Iphone8(60,"Welcome", false );
                //    break;
               // case 10:
               //     b = new Iphone10(60, "Welcome", false);
                 //   break;
              //  default:
                    System.out.println("Please select from given options only");

         //   }
            System.out.println("Now please choose action that needs to be preformed");
            System.out.println("***Only one action at a time");
            System.out.println("1. Check BatteryLife\n" +
                    "2. Charge Iphone\n" +
                    "3. SendMessage\n" +
                    "4. ReadLastMessage\n" +
                    "5. check if iphone is locked\n" +
                    "6. lock iphone\n" +
                    "7. unlock iphone");
            int action = userInput.nextInt();
            switch (action) {
                case 1:
               //     b.getBatteryLevel();
                    break;
                case 2:
               //     b.chargeBattery();
                    break;
                case 3:
                    System.out.println("Please enter your message: ");
                    String message = userInput.nextLine();
               //     b.sendMessage(message);
                    break;
                case 4:
                 //   b.readMessage();
                    break;
                case 5:
                //    b.isLocked();
                    break;
                case 6:
                 //   b.lock();
                    break;
                case 7:
                //    b.unlock();
                    break;


            }
            System.out.println("Enter 1 to run it again"+"\n"+ "or 2 to stop: ");
            again = userInput.nextInt();
        }while(again == 1);

    }
}
