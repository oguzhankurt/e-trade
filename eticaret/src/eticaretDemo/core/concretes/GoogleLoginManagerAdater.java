package eticaretDemo.core.concretes;

import eticaretDemo.GoogleLogin.JGoogleLogin;
import eticaretDemo.core.abstracts.GoogleLoginService;
import eticaretDemo.entities.concretes.User;

public class GoogleLoginManagerAdater implements GoogleLoginService {

	@Override
	public void add(User user) {
		JGoogleLogin google = new JGoogleLogin();
		google.add(user);
		
	}

	@Override
	public void login(User user) {
		JGoogleLogin google = new JGoogleLogin();
		google.login(user);
		
	}

}
