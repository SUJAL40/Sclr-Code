package in.sujal.HW;

import java.util.Scanner;

public class Lec_7_Elec_Bill_cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yout Bill:");
		int bill = sc.nextInt();
		int tb = 0;

		if (bill > 0 && bill < 100) {
			tb = bill * 5;
			System.out.println(tb);
			return;
		}
		if (bill > 100) {
			tb = tb + 100 * 5;
		}
		if (bill > 100 && bill < 200) {
			bill = bill - 100;
			tb = tb + bill * 7;
			System.out.println(tb);
			return;
		}
		if (bill > 200) {
			tb = tb + 100 * 7;
		}
		if (bill > 200 && bill < 300) {
			bill = bill - 200;
			tb = tb + bill * 10;
			System.out.println(tb);
			return;
		}
		if (bill > 300) {
			tb = tb + 100 * 10;
			bill = bill - 300;
			tb = tb + bill * 12;
		}
		System.out.println(tb);
		sc.close();
	}

}
