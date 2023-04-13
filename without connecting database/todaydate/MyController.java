package com.example.date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

@RestController
public class MyController {
    @GetMapping("/") 
    public String getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now); 
    }
}
