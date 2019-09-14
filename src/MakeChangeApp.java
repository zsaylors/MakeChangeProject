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
		System.out.println(charged + paid);
	}
	
}
