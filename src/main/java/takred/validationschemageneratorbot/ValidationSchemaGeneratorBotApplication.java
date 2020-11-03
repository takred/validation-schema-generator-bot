package takred.validationschemageneratorbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ValidationSchemaGeneratorBotApplication {

	public static void main(String[] args) {
//	Теперь тебе надо научиться своим сервисом дёргать сервис Фёдора, передавать ему данные и получать результат
		SpringApplication.run(ValidationSchemaGeneratorBotApplication.class, args);
	}

}
