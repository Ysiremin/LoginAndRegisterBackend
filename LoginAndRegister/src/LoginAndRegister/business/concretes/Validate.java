package LoginAndRegister.business.concretes;

import LoginAndRegister.business.abstracts.ValidateService;
import LoginAndRegister.dataAccess.abstracts.UserDao;
import LoginAndRegister.entities.concretes.User;

public class Validate implements ValidateService {
	
	private UserDao userDao;
	
	public Validate(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public boolean passwordCheck(User user) {
		if (user.getPassword().length() < 6) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean nameCheck(User user) {
		if (user.getFirsName().length() < 2 || user.getLastName().length() < 2 ) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean unusedMailCheck(User user) {
		
		for(User _user : userDao.getAll()) {
			if(user.getEmail() == _user.getEmail()) {
				return false;
			}
		}
		return true;
	}
}