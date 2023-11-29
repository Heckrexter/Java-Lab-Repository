public class One {
    static int x = 0;
    One() {
        System.out.println("One");
        x++;
    }
    public static void main(String[] args) {
        One one = new One();
        One two = new One();
        System.out.println(x);
    }
}