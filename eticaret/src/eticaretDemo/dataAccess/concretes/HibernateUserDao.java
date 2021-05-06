package eticaretDemo.dataAccess.concretes;

import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public boolean add(User user) {
		System.out.println("Email adresinize doğrulama kodu gönderilmiştir. Hesabınızı onayladıktan sonra kaydınız tamamlanacaktır.");
		return true;
	}

}
