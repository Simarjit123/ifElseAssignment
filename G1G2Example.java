package ifElse;

public class G1G2Example {

	public static void main(String[] args) {
		int age;
		age = 67;
//condition to check eligible age to get license
		if (age < 18) {
			System.out.println("You are Not Eligible for driving license");
		}
		//if age is greater than 18 and upto 98
		if (age >= 18 && age <= 98) {
			System.out.println("You are eligible to get driving license");
		}
		//if age is greater than 35 then you are eligible for G2
		 if (age >= 35) {
			System.out.println("you are eligible for G2");}
		//otherwise only available for G1 test
			else {System.out.println("You are only available for G1");
		}
	}

}
