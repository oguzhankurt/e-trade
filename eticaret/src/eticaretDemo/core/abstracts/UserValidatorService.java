package eticaretDemo.core.abstracts;

public interface UserValidatorService {
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkEmail(String email);
	boolean checkPassword(String password);
}
