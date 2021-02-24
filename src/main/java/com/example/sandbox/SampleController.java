package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in input
     */
    public String get(String in, String out) {
        return "Hello";
    }
}
