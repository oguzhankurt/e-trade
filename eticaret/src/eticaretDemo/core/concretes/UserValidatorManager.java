package eticaretDemo.core.concretes;

import java.util.regex.Pattern;

import eticaretDemo.core.abstracts.UserValidatorService;

public class UserValidatorManager implements UserValidatorService {

	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("Ad�n�z en az 2 karakter olmal�yd�");
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if (lastName.length() < 2) {
			System.out.println("Soyad�n�z en az 2 karakter olmal�yd�");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		if (mailRegex.matcher(email).find()) {
			return true;
		}
		System.out.println("Mail adresiniz hatal�yd�");
		return false;
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�yd�.");
			return false;
		}
		return true;
	}

}
