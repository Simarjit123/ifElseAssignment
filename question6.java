package ifElse;

public class question6 {
	public static void calcPrice(String model, double price) {

		double totaldis1;
		double totaldis2;
		double totaldis3;
		int disc = 22;
		double num1 = 10;
		boolean promo5 = true;
		boolean promo10 = true;
		boolean promo20 = true;

		if (promo5) {
			totaldis1 = num1 - (disc * .05);
			System.out.print("Your discount is:" + totaldis1);
		} else if (promo10) {
			totaldis2 = num1 + (disc * .05);
			System.out.print("Your discount is:" + totaldis2);
		} else if (promo20) {
			totaldis3 = num1 + (disc * .05);
			System.out.print("Your discount is:" + totaldis3);
		}
	}
}
