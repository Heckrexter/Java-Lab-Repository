// Java Program to Find Area of Square, Rectangle and Circle using Method Overloading

public class Five {
    Five(float a) {
        System.out.println("Area of square: " + a * a);
    }
    Five(float a, float b) {
        System.out.println("Area of rectangle: " + a * b);
    }
    Five(double r) {
        System.out.println("Area of circle: " + 3.14 * r * r);
    }

    public static void main(String[] args) {
        Five obj1 = new Five(10);
        Five obj2 = new Five(10, 20);
        Five obj3 = new Five(10.5);
    }
}
