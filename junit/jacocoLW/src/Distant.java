public class Distant {
	public static int distant(int a, int b) throws UnhandledCaseException {
		if (a == b) {
			throw new UnhandledCaseException("No Distance");
		}
		if (a >= b) {
			return a - b;
		} else {
			return b - a;
		}
	}
}
