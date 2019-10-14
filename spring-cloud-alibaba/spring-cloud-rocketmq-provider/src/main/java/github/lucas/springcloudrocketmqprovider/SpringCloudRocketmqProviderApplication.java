package github.lucas.springcloudrocketmqprovider;

import github.lucas.springcloudrocketmqprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
@EnableBinding({Source.class})
public class SpringCloudRocketmqProviderApplication implements CommandLineRunner {


    @Autowired
    private MessageChannel output;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRocketmqProviderApplication.class, args);
    }

    /**
     * 实现了 CommandLineRunner 接口，只是为了 Spring Boot 启动时执行任务，不必特别在意
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        output.send(MessageBuilder.withPayload("Hello RocketMQ").build());
    }

}
