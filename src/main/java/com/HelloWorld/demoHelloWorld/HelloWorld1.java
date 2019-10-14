package com.HelloWorld.demoHelloWorld;


import org.springframework.web.bind.annotation.RequestMapping; //to map web request onto specific handler classes
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld1 {
    @RequestMapping("/Hello")
    public String sayHello (){
        return "Hello World!";
    }
}
