package com.lti.bean;

import java.util.Comparator;

public class NameComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		String n1=o1.getAnme();
		String n2=o2.getAnme();
		return n1.compareTo(n2);
	}

}
