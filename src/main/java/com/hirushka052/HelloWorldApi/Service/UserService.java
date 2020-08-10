package com.hirushka052.HelloWorldApi.Service;

import com.hirushka052.HelloWorldApi.DAO.User;

public interface UserService {

    String saveUser(User user);
    User findUserbyUserPhnNo(String usrNic);
}
