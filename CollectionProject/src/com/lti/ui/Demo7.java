package com.lti.ui;
import java.util.*;
import com.lti.bean.*;
public class Demo7 {

	public static void main(String[] args) {
		Set<Account> col=new HashSet<Account>();  // unordered sequence // no duplicates
		// In order to check duplicates set will invoke elements equals() and hashCode() to match contents
		// if element object has duplicate contents then it will not be added
		col.add(new Account(100,"aa",5000.00));
		col.add(new Account(101,"bb",6000.00));
		col.add(new Account(102,"aa",8000.00));
		col.add(new Account(100,"aa",5000.00));
		
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
