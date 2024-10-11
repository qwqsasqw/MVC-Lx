package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorldController")
public class HelloWorldController {


    @RequestMapping("/execute")
    public  ModelAndView execute(){
        System.out.println("execute方法被调用。。。");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(){
        System.out.println("login方法被调用。。。");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping(value = "/login1",method = RequestMethod.GET,
            params = {"username","password1"})
    public ModelAndView login1(){
        System.out.println("login1方法被调用。。。");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
