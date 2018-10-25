package org.java;

import java.util.Scanner;

public class Swappp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Given Numbers to be swapped:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapping Numbers ARe:");
        System.out.println(a);
        System.out.println(b);
	}

}
