// Write a Java program that reads a list of integers from the user and throws an
// exception if any numbers are duplicates.
// Test Case : Input the Integers 1 2 3 3 4 5
// Error: Duplicate number found: 3
// Test Case: Input 1 2 3 4 5 6
// No duplicate numbers!

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) throws CustomException {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of integers ");
        int a = sc.nextInt();
        int[] b = new int[a];
        int number;
		System.out.println(" Enter integers");
		try {
			for (int i = 0; i < a; ++i) {
				number = sc.nextInt();
				b[i] = number;
			}
			for (int j = 0; j < a; j++) {
				for (int j2 = j; j2 < a; j2++) {
					if (b[j] == b[j2 + 1]) {
						throw new CustomException(b[j]);
					}
				}
			}
			System.out.println("No duplicate numbers!");
		} catch (CustomException e) {
			System.out.println("Error: Duplicate number found: " + e.getN());
		}
	}
}

class CustomException extends Exception {
	private int n;

	CustomException(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}