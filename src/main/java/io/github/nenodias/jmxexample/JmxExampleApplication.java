package io.github.nenodias.jmxexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class JmxExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmxExampleApplication.class, args);
	}

}
