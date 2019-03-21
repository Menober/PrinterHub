package com.zpi.printerhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class UserListController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/userList")
    public String displayUserList(Model model){
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "userList";
    }

}
