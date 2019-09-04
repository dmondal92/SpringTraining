package com.deep.spring.basics.springbasicsin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] array_of_numbers) 
	{
		//logic for bubble sort algorithm to be written here
		return array_of_numbers;
	}

}
