package in.banking.user1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankingUser1Application {

	public static void main(String[] args) {
		SpringApplication.run(BankingUser1Application.class, args);
	}

}
