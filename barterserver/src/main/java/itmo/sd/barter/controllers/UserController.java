package itmo.sd.barter.controllers;

import itmo.sd.barter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register-user", method = RequestMethod.POST)
    public void registerUser() {

    }

    @RequestMapping(value = "/login-user", method = RequestMethod.POST)
    public void loginUser() {

    }
}
