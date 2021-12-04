package com.java.practice;

import java.util.Scanner;

public class Lion extends Animal{
	
	Lion(String name)
	{
	   super(name);
	}

	public static void main(String[] args) 
	
	{
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the animal that lives with lion in jungle");
		String name = sc.next();
		Animal l = new Lion(name);
		l.sound();

	}

	@Override
	public void sound() 
	{
	System.out.println("Lion roars !!");
    }

}
