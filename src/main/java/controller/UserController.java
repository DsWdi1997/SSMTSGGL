package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserService;

@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        User user1 = userService.queryUser(user);
        if (user1!=null){
            return "redirect:/book/allBook";
        }else {
            return "redirect:/toLogin";
        }

    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login1";
    }
}
