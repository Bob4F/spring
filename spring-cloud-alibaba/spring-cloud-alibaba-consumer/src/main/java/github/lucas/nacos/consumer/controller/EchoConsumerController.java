package github.lucas.nacos.consumer.controller;

import github.lucas.nacos.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucas
 * @Description
 * @Date 2019/10/8
 **/
@RestController
public class EchoConsumerController {

    @Autowired
    EchoService echoService;

    @GetMapping("/echo/{message}")
    public String echo(@PathVariable(name = "message") String message){
        return echoService.echo(message);
    }


}
