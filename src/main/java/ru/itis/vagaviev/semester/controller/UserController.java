package ru.itis.vagaviev.semester.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.vagaviev.semester.dto.CreateUserDto;
import ru.itis.vagaviev.semester.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/sign_up")
    public String getSignUp(Model model) {
        model.addAttribute("user", new CreateUserDto());
        return "sign_up";
    }

    @PostMapping("/sign_up")
    public String reg(@ModelAttribute(name = "user") CreateUserDto createUserDto) {
        userService.save(createUserDto);

        return "success";
    }

}
