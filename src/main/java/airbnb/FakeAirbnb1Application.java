package airbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = {"airbnb.domain.base, airbnb.controller.command, airbnb.controller.query"} )
@EnableJpaRepositories(basePackages = {"airbnb.repo", "airbnb.repo.IReviewQueryRepo"})
@ComponentScan(basePackages = {"airbnb.repo", "airbnb.domain.base","airbnb.controller.command", 
		"airbnb.controller.query", "airbnb.domain.base.Room"})
@EnableTransactionManagement
public class FakeAirbnb1Application {

	public static void main(String[] args) {
		SpringApplication.run(FakeAirbnb1Application.class, args);
	}
}
