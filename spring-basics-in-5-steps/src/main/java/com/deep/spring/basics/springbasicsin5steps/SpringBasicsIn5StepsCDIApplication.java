package com.deep.spring.basics.springbasicsin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.deep.spring.basics.springbasicsin5steps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringBasicsIn5StepsCDIApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsIn5StepsCDIApplication.class);

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringBasicsIn5StepsCDIApplication.class))
		{
		SomeCDIBusiness business =
				applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("This is the Bean here {}", business);
		}
		
	}

}
