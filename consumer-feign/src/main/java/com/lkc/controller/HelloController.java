package com.lkc.controller;

import com.lkc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello2")
    @ResponseBody
    public String hello2(){
        return helloService.hello2();

    }

    @RequestMapping("/")
    @ResponseBody
    public ModelAndView main(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping("/DingDan")
    public String dingDan(){

        return "DingDan";
    }
}
