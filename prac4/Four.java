public class Four {
    double length;
    double breadth;
    double height;
    void calcVolume() {
        System.out.println(length * breadth * height);
    }
    void resize(double a, double b, double c) {
        length = a;
        breadth = b;
        height = c;
    }
}
class FourDemo {
    public static void main(String[] args) {
        Four obj = new Four();
        obj.length = 10;
        obj.breadth = 20;
        obj.height = 30;
        obj.calcVolume();
    }
}
