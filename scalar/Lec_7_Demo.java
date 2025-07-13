package in.sujal.scalar;

import java.util.Scanner;

public class Lec_7_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
////		System.out.print("enter float No. :");
////		float x = sc.nextFloat();
//		char ch = sc.next().charAt(0);
//		System.out.println(ch);
		
		System.out.println("print a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) System.out.println(a);
		else System.out.println(b);
		System.out.println(a%100);
		sc.close();
	}

}
