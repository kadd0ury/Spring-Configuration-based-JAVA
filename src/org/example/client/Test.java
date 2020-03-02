package org.example.client;

import org.example.config.MessageConfig;
import org.example.model.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null ;
		try {
			context = new  AnnotationConfigApplicationContext(MessageConfig.class);
			Message message = context.getBean("getMessage",Message.class);
			System.out.println(message);
		} catch (Exception e) {	
			e.printStackTrace();
		}finally {
			if (context !=null) {	
			context.close();		}	}
	
			
	
		
		
		
		

	}

}
