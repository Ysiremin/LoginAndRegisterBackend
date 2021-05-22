package LoginAndRegister.core;

import java.util.regex.Pattern;

public class EmailCheck {
	
	private static final String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	public static boolean isEmailValid(String emailInput) {
		
		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(emailInput).find();
		
		}
}