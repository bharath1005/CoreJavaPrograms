package org.java;

import java.util.Scanner;

public class CountOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		while(n>0) {
			n=n/10;
			i++;
		}
		System.out.println("The Given Number Is:"+i);
	}

}
