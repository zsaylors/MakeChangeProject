import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double charged, paid;

		System.out.print("Amount charged: ");
		charged = kb.nextDouble();
		System.out.print("Amount paid: ");
		paid = kb.nextDouble();

		changeCalc(charged, paid);

		kb.close();
	}

	public static void changeCalc(double charged, double paid) {
		int twentyDollars = 2000, tenDollars = 1000, fiveDollars = 500, oneDollar = 100, quarter = 25, dime = 10,
				nickel = 5, penny = 1;
		double difference = (paid - charged) * 100 + 0.5;

		System.out.printf("Amount %.2f, Tendered: %.2f, Result: ", charged, paid);

		if (difference < 1) {
			System.out.println("Error!");
		}

		while (difference > 1) {
			if (difference / twentyDollars > 1) {
				if (difference / twentyDollars < 2) {
					System.out.print((int) difference / twentyDollars + " twenty dollar bill");
				} else {
					System.out.print((int) difference / twentyDollars + " twenty dollar bills");
				}
				difference = difference % twentyDollars;
			} else if (difference / tenDollars > 1) {
				if (difference / tenDollars < 2) {
					System.out.print((int) difference / tenDollars + " ten dollar bill");
				} else {
					System.out.print((int) difference / tenDollars + " ten dollar bills");
				}
				difference = difference % tenDollars;
			} else if (difference / fiveDollars > 1) {
				if (difference / fiveDollars < 2) {
					System.out.print((int) difference / fiveDollars + " five dollar bill");
				} else {
					System.out.print((int) difference / fiveDollars + " five dollar bills");
				}
				difference = difference % fiveDollars;
			} else if (difference / oneDollar > 1) {
				if (difference / oneDollar < 2) {
					System.out.print((int) difference / oneDollar + " one dollar bill");
				} else {
					System.out.print((int) difference / oneDollar + " one dollar bills");
				}
				difference = difference % oneDollar;
			} else if (difference / quarter > 1) {
				if (difference / quarter < 2) {
					System.out.print((int) difference / quarter + " quarter");

				} else {
					System.out.print((int) difference / quarter + " quarters");
				}
				difference = difference % quarter;
			} else if (difference / dime > 1) {
				if (difference / dime < 2) {
					System.out.print((int) difference / dime + " dime");
				} else {
					System.out.print((int) difference / dime + " dimes");
				}
				difference = difference % dime;
			} else if (difference / nickel > 1) {
				if (difference / nickel < 2) {
					System.out.print((int) difference / nickel + " nickel");
				} else {
					System.out.print((int) difference / nickel + " nickels");
				}
				difference = difference % nickel;
			} else {
				if (difference / penny < 2) {
					System.out.print((int) difference / penny + " penny");
				} else {
					System.out.print((int) difference / penny + " pennies");
				}
				difference = difference % penny;
			}

			if (difference >= 1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
	}
}
