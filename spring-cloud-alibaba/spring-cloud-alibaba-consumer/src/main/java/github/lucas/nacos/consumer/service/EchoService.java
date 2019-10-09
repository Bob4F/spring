package github.lucas.nacos.consumer.service;

import github.lucas.nacos.consumer.service.fallback.EchoFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = EchoFallBack.class)
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable(name = "message") String message);

}
