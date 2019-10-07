package github.lucas.nacos.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author Lucas
 * @ClassName App 发现服务 启动类
 * @Data 2019-10-06
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RegisterApplication {
    public static void main(String[] args) {
       SpringApplication.run(RegisterApplication.class, args);
    }
}
