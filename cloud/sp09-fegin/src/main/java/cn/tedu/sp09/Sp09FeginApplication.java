package cn.tedu.sp09;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication
@SpringCloudApplication
@EnableFeignClients
public class Sp09FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp09FeginApplication.class, args);
    }

}


