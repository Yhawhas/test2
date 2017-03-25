import static java.lang.System.out;

public class TestContoller {
	public static void main(String args[]) {

		// Test 1
		String result = NotAString.notAString("not going to happen");
		if (result.equals("not going to happen")) {
			out.println("Test Passes: notAString(\"going to happen\") → " + result);
		} else {
			out.println("Test Failed: notAString(\"going to happen\") → " + result);
		}

		// Test 2
		result = NotAString.notAString("a");
		if (result.equals("not a")) {
			out.println("Test Passes: notAString(\"a\") → " + result);
		} else {
			out.println("Test Failed: notAString(\"a\") → " + result);
		}

		// Test 3
		result = NotAString.notAString("not interested");
		if (result.equals("not interested")) {
			out.println("Test Passes: notAString(\"not interested\") → " + result);
		} else {
			out.println("Test Failed: notAString(\"not interested\") → " + result);
		}

	}

}
