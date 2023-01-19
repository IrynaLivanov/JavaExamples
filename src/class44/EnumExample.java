package class44;
enum Days{
    SUNDAY("Holiday"),MONDAY("Working Day"), TUESDAY("Working day"), WEDNESDAY("Working Day"), THURSDAY("Working Day"), FRIDAY("Working Day"), SATURDAY("Working Day");

  //  int day;
    String day;

    Days(String day){
        this.day = day;
    }
    public String getDayWorkStatus(){
        return day;
    }
}
public class EnumExample {
    public static void main(String[] args) {
        System.out.println(Days.TUESDAY.toString());
      //  System.out.println(Days.TUESDAY.getDayNum());
        System.out.println(Days.TUESDAY.getDayWorkStatus());
        String message = "Hello World";
        System.out.println(message);

    }
}
