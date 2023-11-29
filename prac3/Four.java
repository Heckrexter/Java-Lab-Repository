public class Four {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        for (int[] p : arr) {
            for (int q : p) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
        // get transpose of matrix 'arr'
        int[][] transarr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length;i++) {
            for (int k = 0; k < arr[i].length;k++) {
                transarr[k][i] = arr[i][k];
            }
        }
        for (int[] p : transarr) {
            for (int q : p) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
    }
}
