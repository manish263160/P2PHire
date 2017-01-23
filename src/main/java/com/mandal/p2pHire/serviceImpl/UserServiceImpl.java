package com.mandal.p2pHire.serviceImpl;

import org.springframework.stereotype.Service;

import com.mandal.p2pHire.dao.UserDao;
import com.mandal.p2pHire.models.User;
import com.mandal.p2pHire.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userdao;
	 
	@Override
	public User userLogin(String email, String password) {
		// TODO Auto-generated method stub
		return userdao.userLogin(email, password);
	}

}
