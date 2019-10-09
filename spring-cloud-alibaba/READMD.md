Spring Boot + Spring Cloud = Java 原生云开发

## Spring Cloud Alibaba 
阿里内部开发的微服务架构解决方案

三层架构 + MVC 
    架构 -> 解耦
开发框架
  Spring 轻量级Java EE框架，解决企业级开发的复杂问题
微服务架构 
   拆分单体应用，将一个应用拆分为多个服务，每一个服务都是一个可以独立运行的项目
   分布式系统一定会遇见的四个问题:
   + 多个服务，客户端如何访问/服务路由
   + 服务之间如何通信
   + 如何治理服务？
   + 服务挂了怎么解决:熔断，限流，服务降级
上面问题解决方案：
Spring Cloud 是一套生态 用于解决微服务遇到的问题

1. Spring Cloud Netflix(已经进入了维护模式)
API网关，Zuul组建   
服务注册与发现：Eureka   
Feign-> Http Client -> HTTP 通信 同步并阻塞    
熔断 Hystrix

2. Apache Dubbo Zookeeper
服务通信 : Dubbo 是一个高性能 Java RPC 通信框架   
服务注册与发现： Zookeeper 
API网关:没有 / 找第三方
服务挂了：Hystrix
(期待Dubbo孵化后的功能)

3.Spring Cloud Alibaba


4.新微服务架构标准 
Service Mesh 服务网格
Istio 框架

分布式永远逃不离的问题:网络不可靠(CAP定理)

### 分布式系统架构:
+ 统一依赖管理  
Spring-cloud-dependcy 
+ 服务注册与发现  
spring-cloud-alibaba-register
tip：Nacos(基础设施)
+ 服务消费者  
spring-cloud-alibaba-consumer  
tip:feign
实现负载均衡
+ 服务熔断 防止雪崩  
tip: 阿里的 **Sentinel**  
Sentinel 控制台
