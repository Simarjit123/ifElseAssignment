package ifElse;

public class largestNumber {
	public static void main(String[] args) {

		int number1 = 5, number2 = 10, number3 = 20;

		if (number1 > number2 && number1 > number3) {
			System.out.println("The largest number is: " + number1);
		} else if (number2 > number3) {
			System.out.println("The largest number is: " + number2);
		} else {
			System.out.println("The largest number is: " + number3);
		}

	}
}