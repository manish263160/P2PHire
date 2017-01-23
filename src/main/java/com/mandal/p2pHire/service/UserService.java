package com.mandal.p2pHire.service;

import com.mandal.p2pHire.models.User;

public interface UserService {
	
	User userLogin(String email,String password);

}
