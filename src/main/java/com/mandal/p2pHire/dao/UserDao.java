package com.mandal.p2pHire.dao;

import com.mandal.p2pHire.models.User;

public interface UserDao {

	User userLogin(String email, String password);
}
