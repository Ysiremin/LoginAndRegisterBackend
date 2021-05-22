package LoginAndRegister.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import LoginAndRegister.dataAccess.abstracts.UserDao;
import LoginAndRegister.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	public List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void delete(User user) {
		users.remove(user);
	}

	@Override
	public void update(User user) {
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getUser(int id) {
		return null;
	}
}