/*
Title: Problem Solving and Good Programming Style
Name: Angie
Date Created: March 30, 2026
Date Updated: March 30, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(getFirstName("John Dull"));
		System.out.println(getLastName("Jane Watson"));
		System.out.println(isValidName("John Dull"));
		System.out.println(isValidName("e e"));


	}

		//q1	
		public static String getFirstName(String names) {

			String firstName = names.trim();
			firstName = names.substring(0, names.indexOf(" "));
			return firstName;
		}

		//q2
		public static String getLastName(String names) {

			String lastName = names.substring((names.lastIndexOf(" ") + 1), (names.length()));
			lastName = lastName.trim();
			return lastName;
		}
		
		//q3
		public static Boolean isValidName(String names) {
			String firstName = names.substring(0, names.indexOf(" "));
			String lastName = names.substring((names.indexOf(" ") + 1), (names.length()));

			if ((firstName.length() > 2) && (lastName.length() > 2)) {
				return true;
			}
			return false;



		}

}
