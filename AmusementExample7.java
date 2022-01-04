package ifElse;

public class AmusementExample7 {

	public static void main(String[] args) {
//height entered
		int height = 88;
//height less than 90
		if (height < 90) {
			System.out.println("not allowed to ride");
			// height is between 90 to 200
		} else if (height >= 90 && height < 200) {
			System.out.println("allowed to ride");
		} else {
			System.out.println("only allowed for small rides");
		}
	}

}