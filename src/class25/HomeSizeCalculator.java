package class25;

public class HomeSizeCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        Rectangle room2 = new Rectangle();

        room1.length = 12;
        room1.width = 22;

        room2.length = 14;
        room2.width = 24;

        room1.area = room1.calculateArea(room1.area);
        room2.area = room2.calculateArea(room2.area);


        room1.calculateArea(room1.area);
        room2.calculateArea(room2.area);


        System.out.println("Area of both rooms: " + (room2.area + room1.area));

    }
}
