package LoginAndRegister;

import LoginAndRegister.business.concretes.UserManager;
import LoginAndRegister.business.concretes.Validate;
import LoginAndRegister.dataAccess.abstracts.UserDao;
import LoginAndRegister.dataAccess.concretes.HibernateUserDao;
import LoginAndRegister.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Yasir Emin", "Çiftçi", "yasireminciftci@gmail.com", "1223453");
		UserManager userManager = new UserManager(new HibernateUserDao(), new Validate(new HibernateUserDao()));
		
		userManager.add(user1);
	}
}