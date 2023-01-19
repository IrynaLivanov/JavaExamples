package class25;

public class Car {
    // Properties of Car
    int speed = 300;
    String color = "Red";


    void drive(){
        System.out.println("Driving " + color + " car at speed " + speed);

    }
    int increaseSpeed(int speed) {
        speed = speed + 500;
        return speed;
    }

        void decreaseSpeed(Car myCar){
            myCar.speed = myCar.speed - 200;
            myCar.color = "Black";
            color = "Yellow";
        }

        void makeSpeedZero(){
        speed = 0;
    }

}
