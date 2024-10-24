package org.Spring.controller;

import org.Spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("members", memberService.findAll());
        return "home";
    }

}
