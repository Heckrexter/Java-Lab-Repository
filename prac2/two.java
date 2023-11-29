public class two {
    public static void main (String[] args) {
        int x = 0;
        int y = 1;
        int temp;
        while (x <= 100) {
            System.out.println(x);
            temp = y;
            y = x + y;
            x = temp;
        }
    }
}
