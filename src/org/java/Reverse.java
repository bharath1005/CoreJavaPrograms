package org.java;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Given Number");		
        int n=sc.nextInt();
        int a,i=0,j=0;
        a=n;
        while(a>0) {
        i=a%10;
        j=(j*10)+i;
        a=a/10;
        }
        System.out.println("The Reverse Number"+j);
	
	
	
	}
	

}
