package libofei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartClass {
    public static void main(String[] args) {
        SpringApplication.run(StartClass.class,args);
    }
}
