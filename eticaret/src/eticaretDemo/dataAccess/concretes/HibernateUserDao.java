package eticaretDemo.dataAccess.concretes;

import eticaretDemo.dataAccess.abstracts.UserDao;
import eticaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public boolean add(User user) {
		System.out.println("Email adresinize do�rulama kodu g�nderilmi�tir. Hesab�n�z� onaylad�ktan sonra kayd�n�z tamamlanacakt�r.");
		return true;
	}

}
