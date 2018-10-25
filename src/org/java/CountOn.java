package org.java;

import java.util.Scanner;

public class CountOn {
	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Given Numbers");
		int n=sc.nextInt();
		while(n>0) {
			n=n/10;
			i++;
		}
		System.out.println("The Given Number is:"+i);
	}

}
