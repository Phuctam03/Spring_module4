package springmvc.ungdungtudiendongian.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionaryServlet {

    private static Map<String,String> myDictionary = new HashMap<>();

    static {
        myDictionary.put("Hello","Xin chào");
        myDictionary.put("Welcome","Chào Mừng");
        myDictionary.put("How are you","Bạn như thế nào");
        myDictionary.put("How much","Bao nhiêu");
        myDictionary.put("Television","ti-vi");
    }
    public String checkWord(String word){
        String wordEnglish = myDictionary.get(word);
        if(myDictionary.containsValue(wordEnglish)){
            return  wordEnglish;
        }else {
            return  null;
        }
    }

    @GetMapping("/dictionary")
    public  String dictionary(){
        return  "/dictionary";
    }
    @PostMapping("/Lookup")
    public  String lookup(@RequestParam String word, Model model){
        if(checkWord(word) == null){
            return  "/error";
        }else {
            model.addAttribute("word1",word);
            model.addAttribute("result",checkWord(word));
            return  "/dictionary";
        }
    }
}
