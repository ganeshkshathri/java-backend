package com.example.datefinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

@RestController
public class MyController {
    @GetMapping("/") 
    public String getDate(){
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateaTime now = LocalDateTime.now();
        LocalDateTime future = now.plusDays(100);
        return dtf.format(future);
    }
}
