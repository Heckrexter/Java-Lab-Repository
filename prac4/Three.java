// Java Program to Illustrate Use of Methods in a Class. Create different methods to perform different arithmetic operations.

public class Three {
    double add(int a, int b) {
        return a + b;
    }
    double sub(int a, int b) {
        return a - b;
    }
    double mul(int a, int b) {
        return a * b;
    }
    double div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Three obj = new Three();
        System.out.println("Addition: " + obj.add(10, 20));
        System.out.println("Subtraction: " + obj.sub(10, 20));
        System.out.println("Multiplication: " + obj.mul(10, 20));
        System.out.println("Division: " + obj.div(10, 20));
    }

}
