package class25;

public class Rectangle {
    double length = 0;
    double width = 0;
    double area;
    double perimeter;


    double calculatePerimeter(double perimeter) {
        perimeter = (length + width) * 2;
        return perimeter;
    }

    double calculateArea(double area) {
        area = length * width;
        return area;

    }
}
