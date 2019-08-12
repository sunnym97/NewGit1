package com.bridgelabz.functional;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i,j;
		int n=scanner.nextInt();
		for(i=2;i<=n;i++)
		{
			int count = 0;
			for(j=2;j<=n;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==1)
			{
				
				System.out.println(i);
			}
		}

	}

}
