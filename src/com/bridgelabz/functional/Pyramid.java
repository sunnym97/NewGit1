package com.bridgelabz.functional;
import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int i,j,k,l;
	    for(i=0;i<n;i++)
	    {
	    	for(j=i;j<=n-1;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(l=0;l<=i;l++)
	    	{
	    		System.out.print("*");
	    	}
	    	for(k=0;k<=i-1;k++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    scanner.close();

	}

}
