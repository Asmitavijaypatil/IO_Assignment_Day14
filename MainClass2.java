// Define an Exception called “NoMatchException” that is thrown when a string is not
// equal to ‘India’. Write a program that uses this exception.
import java.util.*;
public class MainClass2 {
	public static void main(String[] args) {	
		class NoMatchException extends Exception {
		    public NoMatchException() {
		        super("String does not match 'India'");
		    }
		}       Scanner sc = new Scanner(System.in);
                System.out.println("Enter input String: ");
                String input = sc.nextLine(); 
		        try {
		            if (!input.equals("India")) {
		                throw new NoMatchException();
		            } else {
		                System.out.println("String matches 'India'");
		            }
		        } catch (NoMatchException e) {
		            System.err.println("Error: " + e.getMessage());
		        }
		    }
        }