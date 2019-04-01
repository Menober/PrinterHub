package com.zpi.printerhub;

import com.zpi.printerhub.entities.Account;
import com.zpi.printerhub.entities.User;
import com.zpi.printerhub.repositories.AccountRepository;
import com.zpi.printerhub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String displayRegister(User user) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveProfile(@Valid User user) {
        //user.setUserId(Math.abs(new Random().nextInt(99999999)));
        Account pincet = new Account();
        pincet.setTokens(500);
        user.setPassword(new BCryptPasswordEncoder(11).encode(user.getPassword()));
        accountRepository.save(pincet);
        user.setAccount(pincet);
        userRepository.save(user);
        return "redirect:/userList";
    }

}
