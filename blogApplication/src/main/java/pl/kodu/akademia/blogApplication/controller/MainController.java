package pl.kodu.akademia.blogApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("name" , "Mateusz");

        return "index";
    }

    @GetMapping("/add")
    public String addPostPage(){
        return "addPost";
    }

    @PostMapping("/addPost")
    public String addPost(@RequestParam(value = "title") String title,
                          @RequestParam(value = "content") String content){
        System.out.println("Params: " + title + ", " + content);
        return "index";
    }
}
