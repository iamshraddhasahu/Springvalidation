package com.springmvc.Springvalidation;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerCotroller {
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,ste);

    }

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
