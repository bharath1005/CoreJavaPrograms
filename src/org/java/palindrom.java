package org.java;

public class palindrom {
	public static void main(String[] args) {
		for (int n = 1; n <=100 ; n++) {
			int a,i=0,j=0;
			a=n;
			while(a>0) {
			i=a%10;
			j=(i*10)+j;
			a=a/10;
			
		}
			if (n==j) {
				System.out.println(n);
				
			}
	}
	}
}
