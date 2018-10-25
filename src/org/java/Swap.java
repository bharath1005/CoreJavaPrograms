package org.java;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("THe Numbers To be Swapped:");
		a=sc.nextInt();
		b=sc.nextInt();
	    c=a;
	    a=b;
	    b=c;
	System.out.println("Swapping numbers are:");
   System.out.println(a);
   System.out.println(b);
	
	
	}
	

}
