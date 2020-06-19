package com.profile.services;

import com.profile.exception.UserNotFoundException;
import com.profile.rs.model.UserDTO;

public interface IUserService {
	void createUser(UserDTO user);
	UserDTO getUser(int id) throws UserNotFoundException;
}
