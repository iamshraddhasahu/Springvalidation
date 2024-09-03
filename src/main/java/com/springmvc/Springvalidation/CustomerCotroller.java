package com.springmvc.Springvalidation;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerCotroller {
@GetMapping("/")
public String showForm(Model model){
    model.addAttribute("customer", new Customer());
    return"customer-form";
}
@PostMapping("/customerform")
    public String customerForm(@Valid @ModelAttribute("customer") Customer thecustomer, BindingResult theBindingResult){

    if(theBindingResult.hasErrors()){
        return"customer-form";

    }else{
        return"customer-confirmation";
    }

}
}
