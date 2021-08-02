package first;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter character");

		char a = Sc.next().charAt(0);
		System.out.println("value = " + a);
	}

}
