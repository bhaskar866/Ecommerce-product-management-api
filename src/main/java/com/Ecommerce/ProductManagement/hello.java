package com.Ecommerce.ProductManagement;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class hello {

    @GetMapping("/hello")
    public String helloRequest(){
        return "Hello world";
    }  

}
