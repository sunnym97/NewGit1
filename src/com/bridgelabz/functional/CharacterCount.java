package com.bridgelabz.functional;
import java.util.*;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		
		int[] count=new int[256];
		for(int i=0;i<string.length();i++)
		{
			count[string.charAt(i)]++;
			System.out.println(count[i]);
		}
			
		
		
		char c[]=new char[string.length()];
		
		

	}

}
