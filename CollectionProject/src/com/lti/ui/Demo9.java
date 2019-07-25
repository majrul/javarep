package com.lti.ui;
import java.util.*;
public class Demo9 {

	public static void main(String[] args) {
		Set<String> col=new HashSet<String>();  // unordered sequence // no duplicates
	
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
			
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);
		System.out.println("--------------------");
		Iterator<String> it= col.iterator();
		while(it.hasNext())  // check whether next element exits or not
		{
			String  el=  it.next();  //retrieve element
			System.out.println(el);
		}
		System.out.println("--------------------");
		for(String s: col)
		{
			System.out.println(s);
		}
	}

}






