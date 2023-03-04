package Springmvc.service;

import Springmvc.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Springmvc.dao.userDao;

@Service
public class userService {
@Autowired
	private userDao userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
	
	
}
