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
@RequestMapping(path="/")
public class PageController {

    @Autowired
    private UserService userService;
    private User user;

    @GetMapping
    public String welcome() {

        return "welcome";
    }

    @PostMapping
    public String startSurvey(@Validated User user, BindingResult bindingResult, Model model) {



        return "page";
    }

    @GetMapping("page")
    public String showPage(Model model) {

        this.user = new User();

        model.addAttribute("user", this.user);

        return "page";
    }

    @PostMapping("page")
    public String userSubmit(@Validated User user, BindingResult bindingResult, Model model) {

        this.user = user;

        System.out.println(this.user.toString());
        return "page_2";
    }

    @GetMapping("page/2")
    public String nextPage(Model model) {

        model.addAttribute("user", this.user);

        return "page_2";
    }

    @PostMapping("page/2")
    public String nextUserSubmit(@Validated User user, BindingResult bindingResult, Model model) {

        this.user = user;

        System.out.println(this.user.toString());

        // userService.saveUser(this.user);

        return "page_3";
    }

}
