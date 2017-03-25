public class NotAString {
	public static String notAString(String str) {
		if (str.length() >= 3) {
			String compr = str.substring(0, 3);
			if (compr.equals("not")) {
				return str;
			} else {
				return "not " + str;
			}
		} else {
			return "not " + str;
		}
	}
}
