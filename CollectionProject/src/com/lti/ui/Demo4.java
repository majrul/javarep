package com.lti.ui;
import java.util.*;
public class Demo4 {

	public static void main(String[] args) {
		List col=new ArrayList();  // ordered sequence //  duplicates allowed
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
		col.add(100);  // new Integer(100);  // auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
