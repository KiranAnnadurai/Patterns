package com.kiran;

public class PrintIneuron {

	public static void main(String[] args) {
		
		int n=14;
		
		// Logic to print a string 'INEURON'
		
		for(int i=0; i<n; i++) {
			
			// Logic to print 'I'
			
			for(int j=0; j<n; j++) {
				if(i==0 || i==(n-1) || j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");
			
			// Logic to print 'N'
			
			for(int j=0; j<n; j++) {
				if(j==0 || j==(n-1) || i==j )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");
			
			// Logic to print 'E'

			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i==(n-1)/2 || i==(n-1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");
			
			// Logic to print 'U'
			
			for(int j=0; j<n; j++) {
				if((i==(n-1) && j!=0) && (i==(n-1) && j!=(n-1)) || (j==0 && i!=(n-1)) || (j==(n-1) && i!=(n-1)))
					System.out.print("*");	
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");
			
			// Logic to print 'R'
			
			for(int j=0; j<n; j++) {
				if(j==0 || (i==0 && j!=n-1) || (i==(n-1)/2 && j!=n-1) || (i!=0 && i<(n-1)/2 && j==n-1) || i-j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");
			
			// Logic to print 'O'
			
			for(int j=0; j<n; j++) {
				if((i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==0 && i!=n-1 && i!=0) || (j==n-1 && i!=n-1 && i!=0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");
			
			// Logic to print 'N'
			
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==j )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}


	}

}
