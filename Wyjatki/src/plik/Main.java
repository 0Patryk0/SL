package plik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wybierz pokój");
		int a = scan.nextInt();

		
		Operacje op = new Operacje();

		try {
			op.numer(a);
		} catch (Wyjatki e) {
			System.out.println(e.getMessage());
		}
	}
}
