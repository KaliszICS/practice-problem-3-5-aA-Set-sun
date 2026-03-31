/*
Title: Problem Solving and Good Programming Style
Name: Angie
Date Created: March 30, 2026
Date Updated: March 30, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(getFirstName("John Dull"));
		System.out.println(getLastName("Jane Mary Watson"));
		System.out.println(isValidName("John Dull"));
		System.out.println(isValidName("e e"));


	}

		//q1	
		public static String getFirstName(String names) {

			String firstName = names.trim();
			firstName = firstName.substring(0, firstName.indexOf(" "));
			return firstName;
		}

		//q2
		public static String getLastName(String names) {
			
			String lastName = names.trim();
			lastName = lastName.substring((lastName.lastIndexOf(" ") + 1), (lastName.length()));
			return lastName;
		}
		
		//q3
		public static Boolean isValidName(String names) {
			names = names.trim();

			if ((names.length() != 0) && (names.contains(" "))) {

			String firstName = names.substring(0, names.indexOf(" "));
			String lastName = names.substring((names.indexOf(" ") + 1), (names.length()));

				if ((names.lastIndexOf(" ")) == names.indexOf(" ")) {
					if ((firstName.length() >= 2) && (lastName.length() >= 2)) {
						return true;
					}
					return false;

				}
				return false;
			}
			return false; 
}
}