package com.dyy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Dyy <br/>
 * @Description <br/>
 * @Date 2018/8/16 下午11:25<br/>
 * Eureka Sre vre 在启动的时候会创建一个定时任务， 默认每隔一段时间(默认为60秒)
 * 将当前清单中超时(默认为90秒)没有续约的服务剔 除出去。
 *
 */
@RestController
//1.必须要设置组件扫描设置要扫描的包
@ComponentScan("com.dyy")
@EnableEurekaServer
//2.设置springboot的启动注解
@SpringBootApplication
public class springBootStrap {

    @Value("${book.name}")
    private String bookName;
    @Value("${book.author}")
    private String author;
    @Value("${book.desc}")
    private String desc;
    @Value("${book.page}")
    private String page;
    @Value("${worker.id}")
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public static void  main(String[] args){
        SpringApplication application = new SpringApplication(springBootStrap.class);
        application.run(args);
    }


    @RequestMapping("/first")
    public String index(HttpServletRequest request){
        return bookName +"===>"+author +"===>"+desc +"====>"+page+"------>"+id;
    }
}
