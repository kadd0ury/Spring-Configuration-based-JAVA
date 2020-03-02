package org.example.ConfigInjection;

import org.example.message.ActiveMessage;
import org.example.message.Messaging;
import org.example.service.Communication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessageConfigClassInjection {
	
	@Bean
	public Communication communication() {
		
		return new Communication (messaging()) ;
}
	@Bean
	public Messaging messaging() {
		
		return new ActiveMessage ();
	
}
	
}
