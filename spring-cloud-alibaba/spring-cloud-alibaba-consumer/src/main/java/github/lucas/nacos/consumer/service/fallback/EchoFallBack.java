package github.lucas.nacos.consumer.service.fallback;

import github.lucas.nacos.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author lucas
 * @Description
 * @Date 2019/10/8
 **/
@Component
public class EchoFallBack implements EchoService {
    @Override
    public String echo(String message) {
        return "请求失败:Hello Sentinel";
    }
}
