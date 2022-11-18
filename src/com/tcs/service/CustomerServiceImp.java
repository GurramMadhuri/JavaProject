/**
 * 
 */
package com.tcs.service;

import com.tcs.bean.Customer;
import java.util.*;
import java.util.stream.Collectors;
/**
 * @author Administrator
 *
 */
public class CustomerServiceImp implements CustomerInterface{
Scanner sc=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
List<Customer> clist=new ArrayList<Customer>();
	@Override
	
	
	public void createCustomer() {
		// TODO Auto-generated method stub

	try {	
		Customer customer=new Customer();

		System.out.println("In create customer method");
		System.out.println("enter Customer id");
	    customer.setCustomerID(sc.nextInt());
		System.out.println("enter customer name");
	    customer.setCustomerName(sc2.nextLine());
		System.out.println("enter Customer address");
	    customer.setCustomerAddress(sc2.nextLine());
	    clist.add(customer);
		System.out.println("----Customer created----");

	}
	catch(Exception ex)
	{
		
		System.out.println("Exception occured in user input");
		sc.nextLine();
		
		
	}

	}
	
	@Override
	public void deleteCustomer() {
		
		// TODO Auto-generated method stub
		try {
			
			System.out.println("In delete customer method\n");
			System.out.println("Enter customerid");
			int inp=sc.nextInt();
			boolean found=false;
	
			for(int i=0;i<clist.size();i++)
			{
				if(clist.get(i).getCustomerID()==inp)
				{
					found=true;
					clist.remove(i);
					System.out.println("----Customer deleted----");
	
				}
				
			}
	       if(found==false)
	       {
	    	   System.out.println("Customer ID not found");
	       }
			}
		  catch(Exception ex)
		  {
			System.out.println("Exception Occured in deleting customer");
			sc.nextLine();
     	  }
			
		}

	@Override
	public void listCustomer() {
		// TODO Auto-generated method stub
		
		System.out.println("----Customers List----");
		
		
		System.out.println("------using for loop------");
		for(int i=0;i<clist.size();i++)
		{
			System.out.print(clist.get(i).getCustomerID()+" ");
			System.out.print(clist.get(i).getCustomerName()+" ");
			System.out.print(clist.get(i).getCustomerAddress()+" "+"\n");
		}

		
		
		
		System.out.println("------using foreach------");
		clist.forEach(System.out::println);

		

		
		
		System.out.println("------using lamda------");
		clist.forEach((Customer)->{
			System.out.print(Customer.getCustomerID()+" "+Customer.getCustomerName()+" "+Customer.getCustomerAddress()+"\n");
			
		});

		
		System.out.println("-------using stream------");
		System.out.println("Number of customers:" +clist.stream().count());
		System.out.println("Number of customers who are from same city:"+clist.stream().filter(i->i.getCustomerAddress().equalsIgnoreCase("ptp")).count());
		
		
		
		
		//System.out.println("From java8 evenList:" +inList.stream().filter(i->i%2==0).collect(Collectors.toList()));

		//clist.stream().forEach(Customer).filter(Customer.getCustomerID());

		

		
		
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		try {
		System.out.println("In update customer method");
		System.out.println("Enter customer id which u want to update");
		int inp2=sc.nextInt();
		boolean found=false;
		for(int i=0;i<clist.size();i++)
		{
			
		if(clist.get(i).getCustomerID()==inp2)
		{
			found=true;
			System.out.println("Enter new name");
			String nname=sc2.nextLine();
			clist.get(i).setCustomerName(nname);
			System.out.println("Enter new address");
			String naddress=sc2.nextLine();
			clist.get(i).setCustomerAddress(naddress);
			System.out.println("----Customer details updated----");

			
		}
		
		}
		if(found==false)
		{
	
       System.out.println("Customer ID not found");
		}
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured in Update method" +ex.getMessage());
		}
		
	}

}
