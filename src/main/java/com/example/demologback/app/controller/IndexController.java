package com.example.demologback.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {
    @RequestMapping(path = "/index")
    public String viewIndex() {
        log.debug("test log: 한글은 어때?");
        return "index";
    }
}
