package com.lti.ui;
import java.util.*;
public class Demo6 {

	public static void main(String[] args) {
		Set<String> col=new HashSet<String>();  // unordered sequence // no duplicates
		// In order to check duplicates set will invoke elements equals() and hashCode() to match contents
		// if element object has duplicate contents then it will not be added
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
		//col.add(100);  // new Integer(100);  // auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
