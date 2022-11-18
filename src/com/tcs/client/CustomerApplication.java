/**
 * 
 */
package com.tcs.client;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;


import com.tcs.service.CustomerInterface;
import com.tcs.service.CustomerServiceImp;

/**
 * @author Administrator
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CustomerInterface ci=new CustomerServiceImp();
		
		
		int ch;
		do {
			Date currentDate=new Date();
			LocalDate localDate=LocalDate.now();
			LocalTime localTime=LocalTime.now();
			LocalDateTime localDateTime=LocalDateTime.now();
			System.out.println("\nWelcome..The Application Date-"+" "+localDate+" "+localTime);
			
			System.out.println("\n1.Create customer");
			System.out.println("2.Delete customer");
			System.out.println("3.Update customer");
			System.out.println("4.list customer");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:ci.createCustomer();
			       break;
			case 2:ci.deleteCustomer();
		           break;
			case 3:ci.updateCustomer();
		           break;
			case 4:ci.listCustomer();
		            break;
			case 5:System.out.println("Exit"); 
			        break;
			default:System.out.println("Wrong option selected! Choose options from 1 to 5");
			         break;
			        
			}
			
		}while(ch!=5);

	}

}
