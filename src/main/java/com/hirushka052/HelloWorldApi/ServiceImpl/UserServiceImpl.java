package com.hirushka052.HelloWorldApi.ServiceImpl;

import com.hirushka052.HelloWorldApi.DAO.User;
import com.hirushka052.HelloWorldApi.Repositry.UserRepo;
import com.hirushka052.HelloWorldApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String saveUser(User user) {
        userRepo.save(user);
        return "User Have Been Successfully saved";
    }

    @Override
    public User findUserbyUserPhnNo(String phnNo) {
        User usr = new User();
        usr = userRepo.findByUserPhoneNo(phnNo);
        return usr;
    }
}
