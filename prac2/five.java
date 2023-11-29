import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner sob = new Scanner(System.in);
        System.out.println("Enter number:-");
        Integer x = sob.nextInt();
        String s = x.toString();
        Integer total = 0, temp = 0;
        
        for (int i = 0; i<s.length(); i++) {
            temp = Character.getNumericValue(s.charAt(i));
            System.out.println(temp);
            total += temp*temp*temp;
            System.out.println(total);
        }
        System.out.println(total == x);
        if ((total - x) == 0) {
            System.out.println(("Is Armstrong"));
        } else {
            System.out.println("Isn't Armstrong");
        }
    }
}
