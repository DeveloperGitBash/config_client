package com.hsbc.org.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class MessageResource {

    @Autowired
   private Environment environment;

    @GetMapping("/getMsg")
    public String getMessage(){
        System.out.println("srarttttt"+environment.getProperty("message"));
        return environment.getProperty("message");
    }
}
