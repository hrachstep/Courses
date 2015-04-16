package TestPackage;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Reading text
		System.out.print("Please Enter the text -> ");
		String text = input.nextLine();
		System.out.println(text);
		
		// Reading number
		System.out.print("Please Enter the number -> ");
		int number = input.nextInt();
		System.out.println(number);
		
		
	}

}
