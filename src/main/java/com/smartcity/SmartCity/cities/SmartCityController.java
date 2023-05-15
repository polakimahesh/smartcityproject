package com.smartcity.SmartCity.cities;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartCityController {
    @GetMapping("/hyderabad")
    public  String smartCity1(Model model){
        model.addAttribute("title","Hyderabad");
        model.addAttribute("template","hyderabad.html");
        return "base";
    }
    @GetMapping("/ahmedabad")
    public  String smartCity2(Model model){
        model.addAttribute("title","Ahmedabad");
        model.addAttribute("template","ahmedabad.html");
        return "base";
    }
    @GetMapping("/amritsar")
    public  String smartCity3(Model model){
        model.addAttribute("title","Amritsar");
        model.addAttribute("template","amritsar.html");
        return "base";
    }
    @GetMapping("/bhopal")
    public  String smartCity4(Model model){
        model.addAttribute("title","Bhopal");
        model.addAttribute("template","bhopal.html");
        return "base";
    }
    @GetMapping("/chennai")
    public  String smartCity5(Model model){
        model.addAttribute("title","Chennai");
        model.addAttribute("template","chennai.html");
        return "base";
    }
    @GetMapping("/coimbatore")
    public  String smartCity6(Model model){
        model.addAttribute("title","Coimbatore");
        model.addAttribute("template","coimbatore.html");
        return "base";
    }
    @GetMapping("/indore")
    public  String smartCity7(Model model){
        model.addAttribute("title","Indore");
        model.addAttribute("template","indore.html");
        return "base";
    }
    @GetMapping("/mumbai")
    public  String smartCity8(Model model){
        model.addAttribute("title","Mumbai");
        model.addAttribute("template","mumbai.html");
        return "base";
    }
    @GetMapping("/pune")
    public  String smartCity9(Model model){
        model.addAttribute("title","Pune");
        model.addAttribute("template","pune.html");
        return "base";
    }
    @GetMapping("/nagpur")
    public  String smartCity10(Model model){
        model.addAttribute("title","Nagpur");
        model.addAttribute("template","nagpur.html");
        return "base";
    }
    @GetMapping("/rajkot")
    public  String smartCity11(Model model){
        model.addAttribute("title","Rajkot");
        model.addAttribute("template","rajkot.html");
        return "base";
    }
    @GetMapping("/thane")
    public  String smartCity12(Model model){
        model.addAttribute("title","Thane");
        model.addAttribute("template","thane.html");
        return "base";
    }
}
