package com.lti.bean;

public class Account implements Comparable<Account>{
	private int aid;
	private String anme;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int aid, String anme, double balance) {
		super();
		this.aid = aid;
		this.anme = anme;
		this.balance = balance;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnme() {
		return anme;
	}
	public void setAnme(String anme) {
		this.anme = anme;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Account hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + aid;
		result = prime * result + ((anme == null) ? 0 : anme.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Account equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (aid != other.aid)
			return false;
		if (anme == null) {
			if (other.anme != null)
				return false;
		} else if (!anme.equals(other.anme))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", anme=" + anme + ", balance=" + balance + "]";
	}
	
	// natrual sorting  by aid
	@Override
	public int compareTo(Account arg0) {
		System.out.println("Comparing ano of "+this.getAid() +" with "+arg0.getAid());
			int diff=this.getAid() - arg0.getAid();
			if(diff>0) 
				return 1;
			else if(diff<0)
				return -1;
			else
				return 0;
	}
	
}
