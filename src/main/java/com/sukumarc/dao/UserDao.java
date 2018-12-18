package com.sukumarc.dao;

import com.sukumarc.model.Login;
import com.sukumarc.model.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
}
