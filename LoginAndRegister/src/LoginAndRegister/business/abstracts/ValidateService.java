package LoginAndRegister.business.abstracts;

import LoginAndRegister.entities.concretes.User;

public interface ValidateService {
	boolean passwordCheck(User user);
	boolean nameCheck(User user);
	boolean unusedMailCheck(User user);
}