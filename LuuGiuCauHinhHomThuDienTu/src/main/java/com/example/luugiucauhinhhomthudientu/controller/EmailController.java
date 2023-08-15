package com.example.luugiucauhinhhomthudientu.controller;
import com.example.luugiucauhinhhomthudientu.model.Email;
import com.example.luugiucauhinhhomthudientu.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmailController {
    @Autowired
    private EmailService emailService ;
    @GetMapping("/listemail")
    public  ModelAndView displayEmail(){
        ModelAndView modelAndView = new ModelAndView("listEmail","emails",emailService.findAll());
        return modelAndView;
    }
    @GetMapping("/update")
    public  ModelAndView formEmail(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("formupdate","email",emailService.findById(id));
        modelAndView.addObject("languagesArrays",new String[]{"English","Vietnamese","Japanese","Chinese"});
        modelAndView.addObject("pageSizeArrays",new int[]{5,10,15,25,50,100});
        return modelAndView;
    }
    @PostMapping("/update")
    public ModelAndView email(@ModelAttribute("email")Email email){
        ModelAndView modelAndView = new ModelAndView("redirect:/listemail");
        emailService.update(email);
        return  modelAndView;
    }
}
