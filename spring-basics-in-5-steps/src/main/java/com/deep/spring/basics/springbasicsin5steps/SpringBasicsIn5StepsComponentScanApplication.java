package com.deep.spring.basics.springbasicsin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.deep.spring.basics.componentscan.ComponentPersonDao;

@Configuration
@ComponentScan("com.deep.spring.basics.componentscan")
public class SpringBasicsIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsIn5StepsComponentScanApplication.class))
		{
		ComponentPersonDao componentPersonDao = 
				applicationContext.getBean(ComponentPersonDao.class);
		LOGGER.info("{}",componentPersonDao);
		}

	}

}
