// Write a program that will count the number of characters, words, lines in a file.
// Use input.txt file as input.
// Output:
// Character Count: 104
// Word Count: 18
// Line Count: 4

import java.util.*;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) throws IOException {
		String fileName = "input1.txt";

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				charCount += line.length();
				String[] words = line.split("\\s+");
				wordCount += words.length;
				lineCount++;
			}
		System.out.println("Character Count: " + charCount);
		System.out.println("Word Count: " + wordCount);
		System.out.println("Line Count: " + lineCount);
	}
}