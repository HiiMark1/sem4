package ru.itis.vagaviev.semester.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.vagaviev.semester.dto.CreateUserDto;
import ru.itis.vagaviev.semester.dto.UserDto;
import ru.itis.vagaviev.semester.service.UserService;

@Controller
public class UserController {

    private final UserService userService;
    private final Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dnsjpwxps",
            "api_key", "832458528611266",
            "api_secret", "IJ6YMkTB6wEG4iqOQgTXUvGCFaQ",
            "secure", true));

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signIn")
    public String login(Model model) {
        model.addAttribute("user", new UserDto());
        return "login";
    }

    @GetMapping("/sign_up")
    public String getSignUp(Model model) {
        model.addAttribute("user", new CreateUserDto());
        return "sign_up";
    }

    @PostMapping("/sign_up")
    public String reg(@ModelAttribute(name = "user") CreateUserDto createUserDto) {
        createUserDto.setName("Name");
        createUserDto.setSurname("Surname");
        createUserDto.setStatus("Status");
        userService.save(createUserDto);

        return "redirect:/login";
    }

    @GetMapping("/profile")
    public String profile(Model model){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = null;
        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        }
        model.addAttribute("user", userService.getUserByEmail(email));
        return "profile";
    }

    @GetMapping("/delete_profile")
    public String deleteProfile(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = null;
        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        }
        userService.deleteUser(email);
        return "delete_profile";
    }

    @PostMapping("/edit_profile")
    public String editProfile(@ModelAttribute(name = "user") CreateUserDto createUserDto) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = null;
        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        }
        UserDto user = userService.getUserByEmail(email);
        if(!createUserDto.getName().equals("Name") && !createUserDto.getName().equals(user.getName())){
            user.setName(createUserDto.getName());
        }
        if(!createUserDto.getSurname().equals("Surname") && !createUserDto.getSurname().equals(user.getSurname())){
            user.setSurname(createUserDto.getSurname());
        }
        if(!createUserDto.getStatus().equals("Status") && !createUserDto.getStatus().equals(user.getStatus())){
            user.setStatus(createUserDto.getStatus());
        }

        return "redirect:/login";
    }
}
