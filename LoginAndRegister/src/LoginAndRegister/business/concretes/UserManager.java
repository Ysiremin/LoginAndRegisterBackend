package LoginAndRegister.business.concretes;

import java.util.List;

import LoginAndRegister.business.abstracts.UserService;
import LoginAndRegister.business.abstracts.ValidateService;
import LoginAndRegister.core.EmailCheck;
import LoginAndRegister.dataAccess.abstracts.UserDao;
import LoginAndRegister.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private ValidateService validateService;
	
	public UserManager(UserDao userDao, ValidateService validateService) {
		this.userDao = userDao;
		this.validateService = validateService;
	}

	@Override
	public void add(User user) {
		if (validateService.nameCheck(user) == true) {
			if (validateService.passwordCheck(user) == true) {
				if (EmailCheck.isEmailValid(user.getEmail()) == true) {
					if (validateService.unusedMailCheck(user) == true) {
						userDao.add(user);
						System.out.println("Kay�t i�lemi ba�ar� ile ger�ekle�ti!");
					}else {
						System.out.println("E-Posta daha �nce kullan�lmam�� olmal�d�r.");
					}
				}else {
					System.out.println("E-posta alan� e-posta format�nda olmal�d�r.");
				}
			}else {
				System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
			}
		}else {
			System.out.println("Ad ve soyad en az iki karakterden olu�mal�d�r.");
		}
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public void delete(User user) {
		
	}

	public List<User> getAll() {
		return null;
	}
}