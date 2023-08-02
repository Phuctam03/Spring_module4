package springmvc.ungdungchuyendoitiente.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class convertController {
    public  double convert(double usd){
        return  usd * 23735;
    }

    @GetMapping("/convert")
    public  String formConvert(){
        return  "formConvert";
    }

     @PostMapping("/convertmoney")
    public  String convert(@RequestParam double moneyUSD ,Model model){
        model.addAttribute("convert",convert(moneyUSD));
        return  "Convert";
    }
}
