package com.java.practice;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) 
	{
	
		int[] numbers = new int[5];
		System.out.println("Enter any five numbers");
		Scanner sc = new Scanner(System.in);
		int input;
		for(int i=0;i<=4;i++)
		{
			input = sc.nextInt();
			numbers[i] = input;
		}
	 
		String num = Arrays.toString(numbers);
		System.out.println(num);		
	}
	
}	