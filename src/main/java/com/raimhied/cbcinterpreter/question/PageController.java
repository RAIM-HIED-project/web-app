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

        this.user.setFrequency(user.getFrequency());
        this.user.setChronic_illness(user.isChronic_illness());
        this.user.setSmoker(user.isSmoker());
        this.user.setRegularity(user.isRegularity());
        this.user.setVegan(user.isVegan());

        System.out.println(this.user.toString());

        return "page_3";
    }

    @GetMapping("page/3")
    public String cbcPage(Model model) {

        model.addAttribute("user", this.user);

        return "page_3";
    }

    @PostMapping("page/3")
    public String lastUserSubmit(@Validated User user, BindingResult bindingResult, Model model) {

        this.user.setAllParametersOk(user.isAllParametersOk());
        this.user.setRCC(user.getRCC());
        this.user.setHb(user.getHb());
        this.user.setHct(user.getHct());
        this.user.setMCV(user.getMCV());
        this.user.setMCH(user.getMCH());
        this.user.setMCHC(user.getMCHC());
        this.user.setRDW(user.getRDW());
        this.user.setWBC(user.getWBC());
        this.user.setPlatelets(user.getPlatelets());
        this.user.setNeutrophil(user.getNeutrophil());
        this.user.setLymphocyte(user.getLymphocyte());
        this.user.setMonocyte(user.getMonocyte());
        this.user.setEosinophil(user.getEosinophil());
        this.user.setBasophil(user.getBasophil());
        this.user.setCovid(user.getCovid());
        this.user.setPregnancy(user.isPregnancy());


        System.out.println(this.user.toString());

        // userService.saveUser(this.user);

        return "end_page";
    }

}
