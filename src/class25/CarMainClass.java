package class25;

public class CarMainClass {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();
        bmw.speed = 200;
        bmw.color = "White";

       bmw.speed = bmw.increaseSpeed(bmw.speed);

       audi.decreaseSpeed(bmw);

       bmw.makeSpeedZero();

        System.out.println(bmw.speed);
        System.out.println(audi.speed);

        System.out.println(bmw.color);
        System.out.println(audi.color);

    }
}
