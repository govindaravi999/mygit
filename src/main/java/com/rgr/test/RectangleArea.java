/**
 * COPY RIGHT AA
   Administrator
 */
package com.rgr.test;

/**
 * @author Administrator
 *
 */
public class RectangleArea {
	
	public static void main(String args[]){
		
		
		int l=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("area is::-> "+new Rectangle(l,b).area());
		
	}

}