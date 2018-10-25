package org.java;

import java.util.Scanner;

public class ReverseOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		long n=sc.nextLong();
		long a,i=0,j=0;
		a=n;
		while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		
		}
	System.out.println("The Given Number Is"+j);
	
	
}
}