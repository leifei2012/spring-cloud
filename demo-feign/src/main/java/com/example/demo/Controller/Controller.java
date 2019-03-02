package com.example.demo.Controller;

import com.example.demo.Service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    Client client;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "user") String name) {
        return client.show( name );
    }
}
