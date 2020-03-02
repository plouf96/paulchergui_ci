package com.sysops.paulchergui;


import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorld {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";

    }
}
