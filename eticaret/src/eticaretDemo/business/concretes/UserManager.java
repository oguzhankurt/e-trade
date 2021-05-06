package eticaretDemo.business.concretes;

import eticaretDemo.business.abstracts.UserService;
import eticaretDemo.core.abstracts.ConfirmEmailService;
import eticaretDemo.core.abstracts.UserValidatorService;
import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserValidatorService userValidatorService;
	private ConfirmEmailService confirmEmailService;

	public UserManager(UserDao userDao, UserValidatorService userValidatorService,
			ConfirmEmailService confirmEmailService) {
		this.userDao = userDao;
		this.userValidatorService = userValidatorService;
		this.confirmEmailService = confirmEmailService;
	}

	@Override
	public void add(User user) {
		if (!user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			if (this.userValidatorService.checkEmail(user.getEmail())
					&& this.userValidatorService.checkFirstName(user.getFirstName())
					&& this.userValidatorService.checkLastName(user.getLastName())
					&& this.userValidatorService.checkPassword(user.getPassword())) {
				if (this.userDao.add(user)) {
					confirmEmailService.confirmEmail(user.getEmail());
				}
			} else {
				System.out.println("Bilgilerinizi kontrol etmez gerekiyor.");
			}
		}
		else {
			System.out.println("Kullanýcý Adý ve þifre zorunludur");
		}

	}

}
