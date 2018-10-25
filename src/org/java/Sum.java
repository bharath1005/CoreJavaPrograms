package org.java;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers To be Added:");
		int n=sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0) {
		i=a%10;
		j=i+j;
		a=a/10;
		}
		System.out.println("Sum of The Digits"+j);
		}

}
