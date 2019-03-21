package com.zpi.printerhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Random;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String displayRegister(User user) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveProfile(@Valid User user) {
        user.setUser_id(Math.abs(new Random().nextInt(99999999)));
        userRepository.save(user);
        return "redirect:/userList";
    }

}
