/**
 * 
 */
package com.kiran;

/**
 * Write a program to print 
 * 1111
   2222
   3333
   4444
 * @author kiran
 *
 */
public class NumberPattern {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<n;j++) {
				System.out.print(i);
			}
					System.out.println();
		}

	}

}
