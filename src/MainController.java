
/**
 * Joshua 
 * 6/3/17
 * NotAString Project
 */
import static java.lang.System.out;
import java.util.Scanner;

public class MainController {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);

		// Gets Input
		out.println("Enter a string: ");
		String str = inp.nextLine();

		// Prints input
		out.println("Entered string is: " + str);
		inp.close();

		// Function
		String result = NotAString.notAString(str);
		out.println(result);

	}
}
