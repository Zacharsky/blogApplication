package pl.kodu.akademia.blogApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndexPage() {
        return null;
    }

}
