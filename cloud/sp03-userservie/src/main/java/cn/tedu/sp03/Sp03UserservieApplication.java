package cn.tedu.sp03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Sp03UserservieApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp03UserservieApplication.class, args);
    }
    //加了注释
}
