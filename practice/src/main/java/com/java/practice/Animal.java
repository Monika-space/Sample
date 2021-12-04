package com.java.practice;

public abstract class Animal 
{
	
	String name;
	
	Animal(String name)
	{
		name = name;
		live(name);
	}
	public abstract void sound();
	
	private void live(String name)
	{
		System.out.println(name+" lives in Jungle too along with lion");
	}
}
