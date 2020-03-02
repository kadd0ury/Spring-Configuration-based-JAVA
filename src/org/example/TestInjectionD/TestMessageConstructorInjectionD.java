package org.example.TestInjectionD;

import org.example.ConfigInjection.MessageConfigClassInjection;
import org.example.service.Communication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMessageConstructorInjectionD {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = null ;
		
		try {
			ctx  = new AnnotationConfigApplicationContext (MessageConfigClassInjection.class) ;
			Communication comm  = ctx.getBean("communication",Communication.class);
			comm.communicate();
			
		} catch (Exception e) {
			e.printStackTrace();
	
		}finally {
			if (ctx!=null) {
			ctx.close();
			
			}
			
		}
		
	

	}

}
