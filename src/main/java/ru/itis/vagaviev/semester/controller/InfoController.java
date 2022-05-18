package ru.itis.vagaviev.semester.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
    @GetMapping("/success")
    public String getInfo() {

        return "success";
    }

    @GetMapping("/post_created")
    public String postCreated() {

        return "post_created";
    }

    @GetMapping("/report_sended")
    public String reportSended() {

        return "report_sended";
    }
}
