package com.example.sandbox;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    /***
     * @param in input
     * @param out out
     * @return Str 
     */
    public String get(String in, String out) {
        return "Hello";
    }


    public String out() {
        return "dep";
    }

    public String useDep() {
        return out();
    }
}
