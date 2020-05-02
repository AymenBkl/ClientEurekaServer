package eureka.mswebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsWebClientApplication.class, args);
	}

}
