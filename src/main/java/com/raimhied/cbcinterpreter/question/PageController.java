package com.raimhied.cbcinterpreter.question;

import com.raimhied.cbcinterpreter.user.User;
import com.raimhied.cbcinterpreter.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/page")
public class PageController {

    @Autowired
    private UserService userService;
    private User user = new User();


    @GetMapping
    public String showPage(Model model) {

        model.addAttribute("user", this.user);

        return "page";
    }

    @PostMapping
    public String userSubmit(@Validated User user, BindingResult bindingResult, Model model) {

        this.user = user;

        System.out.println(this.user.toString());
        return "page_2";
    }

    @GetMapping("/2")
    public String nextPage(Model model) {

        model.addAttribute("user", this.user);

        return "page_2";
    }

    @PostMapping("/2")
    public String nextUserSubmit(@Validated User user, BindingResult bindingResult, Model model) {

        this.user.setHb(user.getHb());
        this.user.setHct(user.getHct());
        this.user.setMCV(user.getMCV());

        System.out.println(this.user.toString());

        userService.saveUser(user); //test

        return "page";
    }

}
