import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int num = obj.nextInt();
        boolean found = false;
        int index = 0;
        for (int i = 0; i<arr.length;i++) {
            if (arr[i] == num) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Number found at index "+index);
        } else {
            System.out.println("Number not found.");
        }
    }
}
