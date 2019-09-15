import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double charged, paid;

		// USER INPUT
		System.out.print("Amount charged: ");
		charged = kb.nextDouble();
		System.out.print("Amount paid: ");
		paid = kb.nextDouble();

		// METHOD CALCULATES AND PRINTS CHANGE
		changeCalc(charged, paid);

		kb.close();
	}

	public static void changeCalc(double charged, double paid) {
		// AMMOUNT IS DOLLAR AND CHANGE AMOUNT MULTIPLIED BY 100.
		int[] amount = new int[] { 10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1 };
		// CHANGE TYPES REPRESENT DOLLAR AMMOUNTS ASSOCIATED WITH INT[] AMMOUNT
		String[] singularChangeType = new String[] { "one hundred dollar bill", "fifty dollar bill",
				"twenty dollar bill", "ten dollar bill", "five dollar bill", "one dollar bill", "quarter", "dime",
				"nickel", "penny" };
		String[] pluralChangeType = new String[] { "one hundred dollar bills", "fifty dollar bill",
				"twenty dollar bills", "ten dollar bills", "five dollar bills", "one dollar bills", "quarters", "dimes",
				"nickels", "pennies" };
		double difference = (paid - charged) * 100 + 0.5;
		int i = 0;

		// FIRST PART OF PRINTOUT
		System.out.printf("Amount %.2f, Tendered: %.2f, Result: ", charged, paid);

		// ERROR MESSAGE IF PAID IS LESS THAN OWED.
		if (difference < 1) {
			System.out.printf("Error! %.2f is owed.", (charged - paid));
		}

		// LOOP TO CALCULATE AND PRINT CHANGE.
		for (i = 0; difference > 1; i++) {
			double equation = difference / amount[i];
			if (equation > 1) {
				if (equation < 2) {
					System.out.print(((int) equation) + " " + singularChangeType[i]);
				} else {
					System.out.print(((int) equation) + " " + pluralChangeType[i]);
				}
				difference = difference % amount[i];

				if (difference > 1) {
					System.out.print(", ");
				} else {
					System.out.print(".");
				}
			}
		}

	}

}
