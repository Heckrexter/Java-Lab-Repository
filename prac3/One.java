import java.util.*;

class One {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = obj.nextInt();
        if (size <= 0){
            System.out.println("invalid size");
        } else {
            int[] arr = new int[size];
            System.out.println("Enter the numbers:-");
            for (int i = 0; i < size; i++){
                arr[i] = obj.nextInt();
            }
            int bigint = arr[0];
            for (int i = 1; i <= size-1; i++){
                if (bigint<arr[i]){
                    bigint = arr[i];
                }
            }
            System.out.println("The biggest number in the array is: "+ bigint);
        }
    }
}