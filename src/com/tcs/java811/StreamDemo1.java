/**
 * 
 */
package com.tcs.java811;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class StreamDemo1 {
	static List<Integer>inList=Arrays.asList(1,2,3,4,5,6,7,8,9);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforejava8();
		fromjava8();

	}
	public static void beforejava8()
	{
		List<Integer> evenList=new ArrayList<>();
		for(int i:inList)
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
		}
		System.out.println("Before java8 evenList:" +evenList);
	}
	
	public static void fromjava8()
	{
		
		System.out.println("From java8 evenList:" +inList.stream().filter(i->i%2==0).collect(Collectors.toList()));
	}

}
