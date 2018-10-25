package org.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Bharath");
		list.add("Arun");
		list.add("Abinaya");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
