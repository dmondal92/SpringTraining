package com.deep.spring.basics.springbasicsin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.deep.spring.basics.springbasicsin5steps.scope.PersonDao;

@Configuration
@ComponentScan
public class SpringBasicsIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringBasicsIn5StepsScopeApplication.class))
		{
		PersonDao personDao = applicationContext.getBean(PersonDao.class);
		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnetion());
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnetion());
		}
	}

}
