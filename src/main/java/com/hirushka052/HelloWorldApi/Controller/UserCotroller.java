package com.hirushka052.HelloWorldApi.Controller;

import com.hirushka052.HelloWorldApi.DAO.User;
import com.hirushka052.HelloWorldApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hlwld/api")
public class UserCotroller {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuser")
    public String userSave(@RequestBody User user){
        String result = userService.saveUser(user);
        return result;
    }

    @GetMapping("/getuser/{phnNo}")
    public User getUserFromUserNic(@PathVariable("phnNo") String phnNo){
        User usr = new User();
        usr = userService.findUserbyUserPhnNo(phnNo);
        return usr;
    }

}
