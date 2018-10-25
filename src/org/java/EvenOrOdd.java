package org.java;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmbers");
        int n=sc.nextInt();
        if (n%2==0) {
			System.out.println("The GIven Number IS Even");
			
		} else {
    System.out.println("The Given Number IS Odd");
		}
		
		
		
	}

}
