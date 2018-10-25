package org.java;

public class CountOfOddd {
	public static void main(String[] args) {
		int oddcount=0,evencount=0;
		for (int i = 0; i <=100; i++) {
			if (i%2==1) {
				oddcount=oddcount+i;
			} else {
               evencount=evencount+i;
			}
			System.out.println("Odd Count is:"+oddcount);
			System.out.println("Even count is:"+evencount);
		}
	}

}
