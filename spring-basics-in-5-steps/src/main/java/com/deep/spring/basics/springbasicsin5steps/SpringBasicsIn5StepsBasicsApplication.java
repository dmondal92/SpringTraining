package com.deep.spring.basics.springbasicsin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.deep.spring.basics.springbasicsin5steps.basics.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringBasicsIn5StepsBasicsApplication {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringBasicsIn5StepsBasicsApplication.class))
		{
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {2,4,6}, 3);
		System.out.println(result);
		}
	}

}
