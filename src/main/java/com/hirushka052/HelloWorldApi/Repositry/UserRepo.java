package com.hirushka052.HelloWorldApi.Repositry;

import com.hirushka052.HelloWorldApi.DAO.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserPhoneNo(String phnNo);
}
