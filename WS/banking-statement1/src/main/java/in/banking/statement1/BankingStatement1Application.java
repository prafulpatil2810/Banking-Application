package in.banking.statement1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class BankingStatement1Application {

	public static void main(String[] args) {
		SpringApplication.run(BankingStatement1Application.class, args);
	}

}
