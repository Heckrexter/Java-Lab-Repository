public class three {
    public static void main(String[] args) {
        for (int i = 0; i<= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i+" is prime");
            else System.out.println(i + " is not prime");
        }
    }
}
