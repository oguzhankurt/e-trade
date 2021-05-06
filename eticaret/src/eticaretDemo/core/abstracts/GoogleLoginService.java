package eticaretDemo.core.abstracts;

import eticaretDemo.entities.concretes.User;

public interface GoogleLoginService {
	public void add(User user);
	public void login(User user);
}
