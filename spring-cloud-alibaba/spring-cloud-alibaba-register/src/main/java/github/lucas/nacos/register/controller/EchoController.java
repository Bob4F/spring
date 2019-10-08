package github.lucas.nacos.register.controller;

import org.springframework.beans.factory.annotation.Value;
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


    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(name="message") String message) {
        System.out.println("port:"+port);
        return "from:"+ port+",Hello Nacos " + message;
    }
}