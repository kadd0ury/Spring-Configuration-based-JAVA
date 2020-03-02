package org.example.config;

import org.example.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
	
	@Bean
	public Message getMessage() {
		return new Message () ;
	
	

}
}
