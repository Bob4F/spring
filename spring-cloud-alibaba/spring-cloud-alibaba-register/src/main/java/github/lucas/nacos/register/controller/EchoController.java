package github.lucas.nacos.register.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lucas
 * @ClassName EchoController
 * @Data 2019-10-06
 * @Version 1.0
 */
@RestController
public class EchoController {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Hello Nacos Discovery " + message;
    }
}