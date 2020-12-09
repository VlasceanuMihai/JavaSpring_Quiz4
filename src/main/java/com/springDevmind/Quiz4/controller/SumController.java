package com.springDevmind.Quiz4.controller;

import com.springDevmind.Quiz4.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Project: Quiz4
 * Author: mihai
 * Date: 12/9/2020
 */

@Controller
public class SumController {

    private SumService sumService;

    @Autowired
    public SumController(SumService sumService) {
        this.sumService = sumService;
    }

    @GetMapping("/home")
    public String homePage(Model model){
        return "homePage";
    }

    @GetMapping("/add/first/{first}/second/{second}")
    public String sum(@PathVariable int first, @PathVariable int second, Model model){
        model.addAttribute("sum", this.sumService.sum(first, second));
        return "sumPage";
    }
}
