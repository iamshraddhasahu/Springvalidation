package com.springmvc.Springvalidation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerCotroller {
@GetMapping("/")
public String showForm(Model model){
    model.addAttribute("customer", new Customer());
    return"customer-form";
}
@PostMapping("/customerform")
    public String customerform(Model model){

    return"customer-confirmation";
}



}
