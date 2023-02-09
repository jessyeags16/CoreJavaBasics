package com.tek.module303;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

public class LoopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1: Print a multiplication table

		// outer loop
		for (int num = 1; num <= 12; num++) {
			//nested loop
			for (int multiplier = 1; multiplier <= 12; multiplier++) 
				System.out.print("\t" + num*multiplier);
				System.out.println();
			}
		//Question 2: Write a program that prompts the user to enter two positive integers, 
		//and find their greatest common divisor (GCD).
		System.out.println("Enter two numbers to find the GCD: ");
		
		List<Integer> listOne = new ArrayList<>();
		List<Integer> listTwo = new ArrayList<>();
		
		//creating a scanner class to get input
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for (int i = 1; i < 100; i++) {
			if (n1%i == 0) {
				listOne.add(n1/i);
			
			}
		}
		for (int i = 1; i < 100; i++) {
			if (n2%i == 0) {
				listTwo.add(n2/i);
			}
		}
		System.out.println(listOne);
		System.out.println(listTwo);
		
		
		
		
		
		//Question 3: Predict Future Tuition
		/*
		 * Suppose the tuition for a university is $10,000 for the current year 
		 * and increases by 7 percent every year. 
		 * In how many years will the tuition be doubled?
		 */
		
		double currYear = 10000;
		double yearIncrease = .07; 
		
		for (int i = 0; currYear < 20000; i++) { 
			currYear = currYear + (currYear * yearIncrease);
			System.out.println("Year: " + i + currYear + " cost of tuition.");
			
		}
		
		}
	}

