import java.util.Scanner;

class javatwo
{
	public static void main(String[] args){
		Scanner obj1 = new Scanner(System.in);
		int[] numa = new int[5];
		System.out.println("Enter Num1:-");
		numa[0] = obj1.nextInt();
		System.out.println("Enter Num2:-");
		numa[1] = obj1.nextInt();
		System.out.println("Enter Num3:-");
		numa[2] = obj1.nextInt();
		int biggest = numa[0];
		int smallest = numa[0];
		for (int i = 0; i<3; i++) {
			if (numa[i] > biggest) {
				biggest = numa[i];
			}
			if (numa[i] < smallest) {
				smallest = numa[i];
			}
		}
		int mid = numa[0];
		for (int i = 0; i<3; i++) {
			if (numa[i] != biggest) {
				if (numa[i] != smallest) {
					mid = numa[i];
				}
			}
			System.out.println(numa[i]+" "+mid);
		}
		System.out.println("The biggest number is " + biggest);
		System.out.println("The middle number is " + mid);
		System.out.println("The smallest number is " + smallest);
	}
}
