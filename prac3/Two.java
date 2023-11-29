public class Two {
    public static void main (String[] args) {
        int[] arr = {1,3,5,7,9};
        int size = arr.length;
        for (int k = 0; k<size;k++) {
            System.out.println(arr[k]);
        }

        int[] arr2 = new int[size];
        for (int i = 0; i<size;i++) {
            arr2[i] = arr[i];
        }
        
        System.out.println("Array 2:-");
        for (int j : arr2) {
            System.out.println(j);
        }
    }
}
