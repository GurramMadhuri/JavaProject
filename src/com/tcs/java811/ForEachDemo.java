/**
 * 
 */
package com.tcs.java811;

import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withoutForEach();
		withForEach();
		

	}

	private static void withoutForEach()
	{
		List<Integer> inList=Arrays.asList(1,2,3,4,5);
		for(int i:inList)
		{
			System.out.println(i);
		}
		
	}
	
	private static void withForEach()
	{
		List<Integer> inList=Arrays.asList(1,2,3,4,5);
		inList.forEach(System.out::println);
		
	}
}
