import java.util.*;

public class four {
    public static void main(String[] args){
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number:-");
        Integer x = sobj.nextInt();
        String s = x.toString();
        System.out.println(s);
        boolean isPal = true;
        Integer len = s.length();
        int i = 0;
        while(isPal) {
            // System.out.println(i + " " + len);
            if (s.charAt(i) != s.charAt(len-i-1)) {
                System.out.println("Is not a palindrome");
                isPal = false;
            }
            i++;
            if (i > len/2) {
                break;
            }
        }
        if (isPal) {
            System.out.println("is palindrome");
        }
    }
}
