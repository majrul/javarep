package com.lti.ui;
import java.util.*;
public class Demo10 {

	public static void main(String[] args) {
	//	Set<String> col=new HashSet<String>();  // unordered sequence // no duplicates
		List<String> col=new ArrayList<String>();  
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
			
		int size=col.size();
		System.out.println("No of elements "+size);
		System.out.println(col);
		System.out.println("--------------------");
		col.remove("Sham");
		System.out.println(col);
		System.out.println("--------------------");
		System.out.println("List specific methods");
		System.out.println("Object at 2 index");
		String s2=col.get(2);
		System.out.println(s2);
		System.out.println(col);
		col.set(2, "Ganesh");
		System.out.println("After replacing at index 2 "+col);
		col.add(2, "Durga");
		System.out.println("After inserting at index 2 "+col);
		col.remove(1);
		System.out.println("After removing object from index 1 "+col);
		/*
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
		*/
	}

}






