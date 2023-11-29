import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers in the array in random order: ");
        int[] arr = new int[10];
        for (int i = 0; i<arr.length;i++) {
            arr[i] = obj.nextInt();
        }
        int temp;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<=arr.length-2-i; j++) {
                temp = arr[j];
                if (arr[j] > arr[j+1])  {
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
