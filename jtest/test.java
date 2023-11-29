import java.util.*;

class test {
    public static void main (String[] args) {
        Random x = new Random();
        System.out.println(x.nextInt(1, 5) +""+ x.nextInt(1, 5) +""+ x.nextInt(1, 5) + "\nThe total number of combinations of 3 digit number that can be made with 1,2,3,4 are: " + (4*4*4));
    }
}