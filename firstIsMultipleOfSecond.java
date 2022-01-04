package ifElse;

public class firstIsMultipleOfSecond {

	public static void main(String[] args) {
		int x, y, z;
		x = 1;
		y = 3;
		z = x % y;

		if (z == 0) {
			System.out.println("x is multiple of y");
		} else {
			System.out.println("not multiple");
		}

	}

}
