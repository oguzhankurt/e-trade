package eticaretDemo.core.concretes;

import eticaretDemo.core.abstracts.ConfirmEmailService;

public class ConfirmEmailManager implements ConfirmEmailService {

	@Override
	public boolean confirmEmail(String email) {
		if (this.confirmEmailCheck()) {
			System.out.println("Email ba�ar�yla onayland�");
			return true;
		}
		System.out.println("Email onaylanmad�");
		return false;
	}

	@Override
	public boolean confirmEmailCheck() {
		return true;
		
	}

}
