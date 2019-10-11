package github.lucas.nacos.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Lucas
 * @ClassName EchoController
 * @Data 2019-10-06
 * @Version 1.0
 */
@RestController
public class EchoController {

    @Autowired
    ConfigurableApplicationContext applicationContext;


    @Value("${server.port}")
    private String port;

    // 及时nacos修改这样不会被刷新的
    @Value("${dev.name}")
    public String devName;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(name="message") String message) {
        return "from:"+ port+",Hello Nacos " + message;
    }


    @GetMapping("/echo/dev")
    public String returnDevName() throws InterruptedException {
        String userName = applicationContext.getEnvironment().getProperty("dev.name");
        return userName + " Progromming this Project";
    }
}