package eticaretDemo;

import eticaretDemo.business.abstracts.UserService;
import eticaretDemo.business.concretes.UserManager;
import eticaretDemo.core.abstracts.GoogleLoginService;
import eticaretDemo.core.concretes.ConfirmEmailManager;
import eticaretDemo.core.concretes.GoogleLoginManagerAdater;
import eticaretDemo.core.concretes.UserValidatorManager;
import eticaretDemo.dataAccess.concretes.HibernateUserDao;
import eticaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Oðuzhan", "", "oguz@oguz.com", "");
		UserService userService = new UserManager(new HibernateUserDao(), new UserValidatorManager(), new ConfirmEmailManager());
		userService.add(user);
		
		GoogleLoginService googleLoginService = new GoogleLoginManagerAdater();
		googleLoginService.add(user);

	}

}
