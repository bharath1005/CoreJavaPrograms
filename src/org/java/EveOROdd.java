package org.java;

import java.util.Scanner;

public class EveOROdd {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Given Numbers:");
		int n=sc.nextInt();
		if (n%2==0) {
			System.out.println("The Given Number Is a Even Number");
			
		} else {
           System.out.println("The GIven Numbver is Odd");
		}
	}

}
