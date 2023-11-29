import java.util.Scanner;

class javaone
{
	public static void main(String[] args){
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Num1:-");
		int num1 = obj1.nextInt();
		System.out.println("Enter Num2:-");
		int num2 = obj1.nextInt();
		if (num1 < num2){
			System.out.println("Num1 is less than num2");
		} else if (num2 > num2){
			System.out.println("Num1 is greater than num2");
		} else {
			System.out.println("Num1 is equal to num2");
		}
	}
}
