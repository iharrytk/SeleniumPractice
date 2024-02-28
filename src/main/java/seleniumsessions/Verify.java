package seleniumsessions;

public class Verify {

	public static boolean equalValues(String actvalue, String expvalue) {
		if (actvalue.equals(expvalue)) {
			System.out.println("Actual value " +actvalue+ " is equals " +expvalue);
			return true;

		} else {
			System.out.println("Actual value " +actvalue+ " is not equals " +expvalue);
			return false;
		}
	}

	public static boolean containValues(String actvalue, String expvalue) {
		if (actvalue.contains(expvalue)) {
			System.out.println("Actual value " +actvalue+ " contains " +expvalue);
			return true;

		} else {
			System.out.println("Actual value " +actvalue+ " does not contains " +expvalue);
			return false;
		}
	}

}
