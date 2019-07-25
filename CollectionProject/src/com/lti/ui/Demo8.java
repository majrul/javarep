package com.lti.ui;
import java.util.*;
public class Demo8 {

	public static void main(String[] args) {
		//Set<String> col=new HashSet<String>();  // unordered sequence // no duplicates
		//Set<String> col=new LinkedHashSet<String>();  // ordered sequence // no duplicates
		Set<String> col=new TreeSet<String>();  // unordered sequence // no duplicates // no null
		// elements are sorted  in natural order

		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
		//col.add(null);   // TreeSet does not allow null throws NullpointerException
		//col.add(100);  // new Integer(100);  // auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
