/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

// Write your code here.
package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirouting.MyService;
@RestController
public class MyController{
    MyService obj = new MyService();
    @GetMapping("/")
    public String getHomePage(){
        return obj.getHome();
    }

    @GetMapping("/about")
    public String getAboutPage(){
        return obj.getAbout();
    }
}