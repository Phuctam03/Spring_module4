package com.example.uploadfile.controller;


import com.example.uploadfile.module.FormSing;
import com.example.uploadfile.module.MySing;
import com.example.uploadfile.module.Product;
import com.example.uploadfile.module.ProductForm;
import com.example.uploadfile.service.IMySingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/Sing")
@PropertySource("classpath:upload_file.properties")
public class SingController {

    @Value(("${file-upload}"))
    private  String fileUpload;

    @Autowired
    private IMySingService mySingService;


    @GetMapping("")
    public ModelAndView index(){
        List<MySing> mySingList = mySingService.findAll();
        ModelAndView modelAndView = new ModelAndView("index","mySing",mySingList);
        return  modelAndView;
    }
    @GetMapping("/create")
    public  ModelAndView showCreateForm(){
         ModelAndView modelAndView = new ModelAndView("create","MySing",new FormSing());
         modelAndView.addObject("typeSing",new String[]{"pop","R&B","Ballad","Bolero","Rap and Rock"});
         return  modelAndView;
    }
    @PostMapping("/save")
    public  ModelAndView saveProduct(@ModelAttribute("MySing")FormSing formSing) throws IOException {
        ModelAndView modelAndView = new ModelAndView("redirect:/Sing");
        MultipartFile multipartFile = formSing.getSing();
        String fileName = multipartFile.getOriginalFilename();
        fileUpload = "E:\\image\\";
        FileCopyUtils.copy(multipartFile.getBytes(), new File(fileUpload + fileName));
        MySing mySing = new MySing(formSing.getNameSong(),formSing.getNameSinger(),formSing.getTypeSing(),fileName);
        mySingService.save(mySing);
        return  modelAndView;
    }
}
