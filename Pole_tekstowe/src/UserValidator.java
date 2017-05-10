
public class UserValidator {
	private static final String login = "Andy";	
	private static final String haslo = "12345";
	
	public static boolean autoryzacja(String login, String haslo){
		if(UserValidator.login.equals(login) && UserValidator.haslo.equals(haslo)) {
			return true;
		} else {
			return false;
		}
		
	}
}
