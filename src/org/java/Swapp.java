package org.java;

import java.util.Scanner;

public class Swapp {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("The NUmbers To be Swapped:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped Numbers Are:");
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
