package com.souhail.users.service;

import java.util.List;

import com.souhail.users.entities.Role;
import com.souhail.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}

