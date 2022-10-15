package spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "spring.boot.demo")
public class SpringBootWithActiveMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithActiveMqApplication.class, args);
	}

}
