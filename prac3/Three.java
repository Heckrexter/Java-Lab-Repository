class Three {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{1,2,3},{4,5,6}};
        // check if the two arrays are equal or not
        boolean equalOrNot = true;
        for (int i = 0; i<arr.length;i++) {
            for (int j = 0; j<arr[i].length;j++) {
                if (arr[i][j] != arr2[i][j]) {
                    equalOrNot = false;
                }
            }
        }
        if (equalOrNot) {
            System.out.println("Two arrays are equal.");
        } else {
            System.out.println("Two arrays are not equal.");
        }
    }
}