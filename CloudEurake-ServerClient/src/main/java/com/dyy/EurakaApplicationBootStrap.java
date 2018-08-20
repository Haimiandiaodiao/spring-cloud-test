package com.dyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Dyy <br/>
 * @Description <br/>
 * @Date 2018/8/17 下午1:09<br/>
 * 为了性能考虑， Eureka Server会维护 一 份只读的服务清单来返回给客户端，同时该缓
 * 存清单会每隔30秒更新 一 次。
 *
 */
@ComponentScan("com.dyy")
@EnableEurekaClient
@SpringBootApplication
public class EurakaApplicationBootStrap {


    public static void main(String[] args){
        SpringApplication application = new SpringApplication(EurakaApplicationBootStrap.class);
        application.run(args);
    }
}
