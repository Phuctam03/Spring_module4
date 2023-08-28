package com.example.validationuser.controller;



import com.example.validationuser.entity.User;
import com.example.validationuser.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserSerivce userSerivce;


    @GetMapping("/list")
    public ModelAndView displayUser(){
        return  new ModelAndView("user/list","users",userSerivce.findAll());
    }



    @GetMapping("/formcreate")
    public ModelAndView formCreate(){
        ModelAndView modelAndView = new ModelAndView("user/create","user",new User());
        return  modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Validated @ModelAttribute("user")User user, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("redirect:/user/list");
        if(bindingResult.hasErrors()){
            return new ModelAndView("user/create");
        }
        userSerivce.create(user);
        return  modelAndView;
    }
}
