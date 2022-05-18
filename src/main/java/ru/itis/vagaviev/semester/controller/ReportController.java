package ru.itis.vagaviev.semester.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.vagaviev.semester.dto.CreateReportDto;
import ru.itis.vagaviev.semester.service.ReportService;
import ru.itis.vagaviev.semester.service.UserService;

@Controller
public class ReportController {
    UserService userService;
    ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService, UserService userService) {
        this.reportService = reportService;
        this.userService = userService;
    }

    @PostMapping("/report")
    public String newPost(@ModelAttribute(name = "post") CreateReportDto createReportDto) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String email = null;
        if (principal instanceof UserDetails) {
            email = ((UserDetails) principal).getUsername();
        }
        createReportDto.setUserId(userService.getUserByEmail(email).getId());
        createReportDto.setDate(System.currentTimeMillis());
        reportService.save(createReportDto);
        return "redirect:/report_sended";
    }

    @GetMapping("/report")
    public String getSignUp(Model model) {
        model.addAttribute("report", new CreateReportDto());
        return "report";
    }
}
