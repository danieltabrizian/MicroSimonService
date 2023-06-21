package io.ulu.microsimonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
//docker exec -it fieldtracker_web rails c
@SpringBootApplication
@RestController
public class MicroSimonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroSimonServiceApplication.class, args);
    }

    @PostMapping(value ="/simon/{url}")
    public String runSimonEngine(@PathVariable String url){
        return "Hello World: "+url;
    }


}
