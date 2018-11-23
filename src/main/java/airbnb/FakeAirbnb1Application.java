package airbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"airbnb.domain.base, airbnb.controller.command, airbnb.controller.query"} )
@EnableJpaRepositories(basePackages = {"airbnb.repo"})
@EnableTransactionManagement
public class FakeAirbnb1Application {

	public static void main(String[] args) {
		SpringApplication.run(FakeAirbnb1Application.class, args);
	}
}
