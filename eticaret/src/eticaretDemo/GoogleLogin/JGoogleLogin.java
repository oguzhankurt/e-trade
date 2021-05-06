package eticaretDemo.GoogleLogin;

import eticaretDemo.entities.concretes.User;

public class JGoogleLogin {
	public void add(User user) {
		System.out.println("Google ile kayýt olundu " + user.getEmail());
	}
	public void login(User user) {
		System.out.println("Google ile kayýt olundu " + user.getEmail());
	}
}
