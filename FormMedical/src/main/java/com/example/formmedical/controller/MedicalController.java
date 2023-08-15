package com.example.formmedical.controller;

import com.example.formmedical.model.Medical;
import com.example.formmedical.model.Symptom;
import com.example.formmedical.repository.IMedical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MedicalController {

    @Autowired
    private IMedical iMedical;

    @GetMapping("/listMedical")
    public ModelAndView displayMedical() {
        ModelAndView modelAndView = new ModelAndView("Medical", "medicals", iMedical.findAll());
        return modelAndView;
    }

    public List<Symptom> getListSysptom() {
        List<Symptom> symptomList = new ArrayList<>();
        symptomList.add(new Symptom("Sốt", true));
        symptomList.add(new Symptom("Ho", false));
        symptomList.add(new Symptom("Khó thở", true));
        symptomList.add(new Symptom("Nôn/Buồn nôn", true));
        symptomList.add(new Symptom("Tiêu Chảy", false));
        symptomList.add(new Symptom("Xuất huyết ngoài da", true));
        symptomList.add(new Symptom("Nổi ban ngoài da", false));
        return symptomList;
    }


    @GetMapping("/createMedical")
    public ModelAndView formcreateMedical() {
//        MedicalDto medical = new MedicalDto();
        Medical medical = new Medical();
        ModelAndView modelAndView = new ModelAndView("formMedical", "medical", medical);
        medical.setSysmptom(getListSysptom());
        modelAndView.addObject("symptoms", getListSysptom());
        modelAndView.addObject("action", "create");
        modelAndView.addObject("yearArrays", new int[]{1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008});
        modelAndView.addObject("genderArrays", new String[]{"male", "female", "other"});
        modelAndView.addObject("nationalityArrays", new String[]{"Vietnamese", "England", "Korea", "Chinese", "Switzerland", "USA", "Denmark"});
        modelAndView.addObject("travelArrays", new String[]{"tàu Bay", "Tàu thuyền", "Ô tô", "Khác(Ghi rõ)"});
        modelAndView.addObject("cityArrays", new String[]{"Đà Nẵng", "Nha Trang", "Hồ Chí Minh", "Hà Nội", "Đà lạt",});
        modelAndView.addObject("countyArrays", new String[]{"Sơn Trà", "Thanh Khê", "Cẩm Lệ", "Ngữ Hành Sơn", "Liên Chiểu"});
        modelAndView.addObject("wardArrays", new String[]{"An Hải Bắc", "An Hải Tây", "An Hải Đông", "Mân Thái", "Phước Mỹ", "Thọ Quang"});
        return modelAndView;
    }

    @GetMapping("/updateMedical")
    public ModelAndView formMedical(@RequestParam("id") int id) {
        ModelAndView modelAndView = new ModelAndView("formMedical", "medical", iMedical.findById(id));
        modelAndView.addObject("action", "update");
        modelAndView.addObject("yearArrays", new int[]{1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008});
        modelAndView.addObject("genderArrays", new String[]{"male", "female", "other"});
        modelAndView.addObject("nationalityArrays", new String[]{"Vietnamese", "England", "Korea", "Chinese", "Switzerland", "USA", "Denmark"});
        modelAndView.addObject("travelArrays", new String[]{"tàu Bay", "Tàu thuyền", "Ô tô", "Khác(Ghi rõ)"});
        modelAndView.addObject("cityArrays", new String[]{"Đà Nẵng", "Nha Trang", "Hồ Chí Minh", "Hà Nội", "Đà lạt",});
        modelAndView.addObject("countyArrays", new String[]{"Sơn Trà", "Thanh Khê", "Cẩm Lệ", "Ngữ Hành Sơn", "Liên Chiểu"});
        modelAndView.addObject("wardArrays", new String[]{"An Hải Bắc", "An Hải Tây", "An Hải Đông", "Mân Thái", "Phước Mỹ", "Thọ Quang"});
        return modelAndView;
    }

    @PostMapping("/medical")
    public ModelAndView Medical(@ModelAttribute("medical") Medical medical, @RequestParam("action") String action) {
        ModelAndView modelAndView = new ModelAndView("redirect:/listMedical");
        if ("create".equals(action)) {
            iMedical.add(medical);
        } else {
            iMedical.update(medical);
        }
        return modelAndView;
    }
}
