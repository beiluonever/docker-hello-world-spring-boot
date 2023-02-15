package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        try {
            String[] a = new String[10000000];
            for (int i = 0; i < a.length; i++) {
                a[i] = "x" + i;
            }
            System.out.println(a.length);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello World\n";
    }
    
}
