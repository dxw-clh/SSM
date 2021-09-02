package com.dxw.controller;

import com.dxw.pojo.User;
import com.dxw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/allUser")
    public String userList(Model model){
        List<User> userList = userService.getUserList();

        for (User user : userList) {
            model.addAttribute(user);
        }
        return "users";
    }
}
