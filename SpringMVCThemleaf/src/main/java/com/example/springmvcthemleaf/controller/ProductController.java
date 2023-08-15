package com.example.springmvcthemleaf.controller;
import com.example.springmvcthemleaf.model.Product;
import com.example.springmvcthemleaf.service.IProductService;
import com.example.springmvcthemleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/listProduct")
    public ModelAndView displayProduct(){
        ModelAndView modelAndView = new ModelAndView("List","products",productService.findAll());
        return  modelAndView;
    }
    @GetMapping("/detail")
    public  ModelAndView detailProduct(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("detail","product",productService.findById(id));
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView formCreate(){
        ModelAndView modelAndView = new ModelAndView("createOrUpdate","product",new Product());
        modelAndView.addObject("typeProduct",new String[]{"xách tay","hàng ngoại","hàng nội","hàng thử nghiệm"});
        modelAndView.addObject("action","create");
        return  modelAndView;
    }
    @GetMapping("/update")
    public  ModelAndView formUpdate(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("createOrUpdate","product",productService.findById(id));
        modelAndView.addObject("typeProduct",new String[]{"xách tay","hàng ngoại","hàng nội","hàng thử nghiệm"});
        modelAndView.addObject("action","update");
        return  modelAndView;
    }
    @PostMapping("/createOrUpdate")
    public ModelAndView create(@ModelAttribute("product")Product p,@RequestParam("action")String action){
        ModelAndView modelAndView = new ModelAndView("redirect:/listProduct");
        if("create".equals(action)){
            productService.add(p);
        }else {
            productService.update(p);
        }
        return modelAndView;
    }
    @GetMapping("/delete")
    public ModelAndView formDelete(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("redirect:/listProduct");
        productService.delete(id);
        return modelAndView;
    }

    @PostMapping("/search")
    public  ModelAndView modelAndView(@RequestParam("search")String nameProduct){
        ModelAndView modelAndView = new ModelAndView("redirect:/listProduct");
         productService.findByName(nameProduct);
        return  modelAndView;
    }
}
