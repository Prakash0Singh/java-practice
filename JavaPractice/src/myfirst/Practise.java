package myfirst;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {

		// Q.1 Number 'Even' or 'Odd'
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		boolean result = userInput % 2 == 0;
		if (result) {
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}

		// Q.2 Person is 'young' or 'not young'

		int age = sc.nextInt();

		if (age >= 14 && age <= 55) {
			System.out.println("Person is 'young'.");
		} else {
			System.out.println("Person is 'not young'.");
		}

		// Q.3 Grade of given marks

		int hindi = sc.nextInt();
		int english = sc.nextInt();
		int maths = sc.nextInt();

		int total = hindi + english + maths;
		int avg = total / 3;

		if (avg >= 70) {
			System.out.println("A");
		} else if (60 <= avg && avg < 70) {
			System.out.println("B");
		} else if (50 <= avg && avg < 60) {
			System.out.println("C");
		} else {
			System.out.println("Fail");
		}

	}

}
