package com.example.pictuerofday.controller;


import com.example.pictuerofday.model.Picture;
import com.example.pictuerofday.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    PictureService pictureService;

    @GetMapping("/list")
    public ModelAndView displayPicture(){
        ModelAndView modelAndView = new ModelAndView("picture/list","Pictures",pictureService.findAll());
        return modelAndView;
    }
    @GetMapping("/fromcreate")
    public ModelAndView formCreate(){
        ModelAndView modelAndView = new ModelAndView("picture/comment","Picture",new Picture());
        return  modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("Picture")Picture picture){
        ModelAndView modelAndView = new ModelAndView("redirect:/picture/list");
        pictureService.add(picture);
        return modelAndView;
    }

}
