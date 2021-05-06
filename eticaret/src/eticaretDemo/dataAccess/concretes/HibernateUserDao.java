package eticaretDemo.dataAccess.concretes;

import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public boolean add(User user) {
		System.out.println("Email adresinize doðrulama kodu gönderilmiþtir. Hesabýnýzý onayladýktan sonra kaydýnýz tamamlanacaktýr.");
		return true;
	}

}
