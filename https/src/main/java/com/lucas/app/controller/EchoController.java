package com.lucas.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucas
 * @Description
 * @Date 2019/10/11
 **/
@RestController
public class EchoController {

    @GetMapping("echo")
    public String echoString(){
        return "Hello HTTPS/SSL";
    }

}
