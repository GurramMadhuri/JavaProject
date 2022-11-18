/**
 * 
 */
package com.tcs.java811;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class DateAndTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayCurrentDate();
		displayCurrentTimeDetails();
	}
public static void displayCurrentDate()
{
	Date currentDate=new Date();
	LocalDate localDate=LocalDate.now();
	LocalTime localTime=LocalTime.now();
	LocalDateTime localDateTime=LocalDateTime.now();
	System.out.println("Current date and time -Before java 8:"+currentDate);
	System.out.println("Current date From java 8:"+localDate);

	System.out.println("Current time From java 8:"+localTime);

	System.out.println("Current date and timefrom java 8:"+localDateTime);

	
	
}

private static void displayCurrentTimeDetails()
{
	LocalTime localTime=LocalTime.now();
	System.out.println("Current Time:" +localTime);
	System.out.println("localTime.getSecond():"+localTime.getSecond());
	System.out.println("localTime.getSecond():"+localTime.getMinute());
	System.out.println("localTime.getSecond():"+localTime.getHour());

}
}
