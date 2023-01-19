package class27;

class Car {

    int numOfCars;

    Car(int count){

        numOfCars = numOfCars + count;
        numOfCars++;

    }
}
public class InstanceVariableExample {
    public static void main(String[] args) {
        Car bmw = new Car(0);
        Car audi = new Car(2);
        Car toyota = new Car(2);

        System.out.println(bmw.numOfCars);
    }
}
