/**
Write a program to print the following pattern




*            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************
**************

 * 
 */
package com.kiran;

/**
 * @author kiran
 *
 */
public class PatternTypeTwo {
	
	public static void main(String[] args) {
		
		
		int n = 14;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				if(i==n-1 || i==n-2 || i-j>=(n-1)/2 || i+j>=((n-1)/2)+(n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}