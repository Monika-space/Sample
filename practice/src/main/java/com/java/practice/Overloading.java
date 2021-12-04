package com.java.practice;

public class Overloading {

	public static void main(String[] args) 
	{
	  Overloading o = new Overloading();
	  o.add(2, 4);
	}
	
	public void add(int a, float b)
	{
		System.out.println("addition of "+a+" and "+b+"is "+(a+b));
	}
	
	float add(float a, float b)
	{
		return (a+b);
	}

}
