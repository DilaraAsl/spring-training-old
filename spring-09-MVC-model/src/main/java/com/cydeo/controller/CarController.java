package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    @RequestMapping("car")
    public String carInfo(@RequestParam String make, Model model){
     model.addAttribute("make",make);
        return "car/car";
    }
    @RequestMapping("info2")
    public String carInfo2(@RequestParam(value="make",required = false,defaultValue = "KIA") String make, Model model){
// required=false means rest of the query is optional but we are assigning defaultValue here
        model.addAttribute("make",make);
        return "car/car";
    }

    @RequestMapping("info3")
    public String carInfo3(@RequestParam String make,@RequestParam int year, Model model){
        // localhost:8080/info3?make=kia&year=2015
        model.addAttribute("make",make);
        model.addAttribute("year",year);
        return "car/car";
    }

    // path variable example
    @RequestMapping("/car/{make}/{year}") // we are creating a path variable
    // {make} and {year} should be the same name in the parameter
    public String getCarInfo(@PathVariable String make,@PathVariable int year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);
        return "car/car";
    }
}
