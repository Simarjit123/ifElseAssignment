package ifElse;

public class grade {
	public static void main(String[] args) {
//Percentage value entered
		double percentage = 80;
		//if percentage is less than or equal to 50
		if (percentage <= 50) {
			System.out.println("Grade:D");
		} 
		//if percentage is greater than 50 or upto 60
		else if (percentage > 50 && percentage <= 60) {
			System.out.println("Grade:c");
		}
		//if percentage is greater than 60 or upto 75
		else if (percentage > 60 && percentage <= 75) {
			System.out.println("Grade:B");
		}
		//when percentage is above 75
		else { System.out.println("Grad:A");
	}

}
}