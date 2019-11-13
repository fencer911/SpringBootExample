package cn.fencer911.controller;


import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.fencer911.dao.UserDAO;
import cn.fencer911.entity.User;



@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDAO userDAO;
    
    @GetMapping("/add")
    @ResponseBody
    public User add(){
        User userData=new User();
        userData.setUid(new Random().nextInt(999999));
        userData.setName(UUID.randomUUID().toString().replaceAll("-", ""));
        userData.setCreditId("1234567890");
        userData.setMobile("1234567890");
        userData.setCreateTime(new Date());    
        try {
            userDAO.insert(userData);
        } catch (Exception e) {
           e.printStackTrace();
        }   
        
        return userData;
    }

    @GetMapping("/list")
    @ResponseBody
    public List<User> list(){
        
        return userDAO.queryList();
    }



}
