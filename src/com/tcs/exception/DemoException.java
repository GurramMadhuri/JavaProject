/**
 * 
 */
package com.tcs.exception;

/**
 * @author Administrator
 *
 */
public class DemoException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c;
      a=10;
      b=0;
      c=0;
      try {
    	  c=a/b;
    	  System.out.println(c);
      }catch(Exception e) {
    	  System.out.println("unrelevant operation"+e.getMessage());
      }finally {
    	  System.out.println("This block is finally executed");
      }
	}

}
