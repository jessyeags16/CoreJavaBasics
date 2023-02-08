package com.tek.module303;
import java.util.Scanner; //imports scanner class
public class ControlFlowConditionalsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem 1: 
		/*
		 * 1.Write a program that declares 1 integer variable x, 
		 * and then assigns 7 to it. 
		 * Write an if statement to print out “Less than 10” if x is less than 10. 
		 * Change x to equal 15, and notice the result 
		 * (console should not display anything).
		 */
		
		int x = 15;
		
		if (x < 10) {
			System.out.println("Less than 10");
		}
	
		//Problem 2: 
		/*
		 * Write a program that declares 1 integer variable x,
		 *  and then assigns 7 to it. 
		 *  Write an if-else statement that prints out 
		 *  “Less than 10” if x is less than 10, and “Greater than 10” 
		 *  if x is greater than 10. 
		 *  Change x to 15 and notice the result.
		 */
	
		int x2 = 15;
	
		if (x2 < 10) {
			System.out.println("Less than 10");
		}
		else {
			System.out.println(""); 
		}


		//Problem 3: 
		/*
		 * Write a program that declares 1 integer variable x, 
		 * and then assigns 15 to it. 
		 * Write an if-else-if statement that prints out “Less than 10” if x is less than 10; 
		 * “Between 10 and 20” if x is greater than 10 but less than 20, 
		 * and “Greater than or equal to 20” if x is greater than or equal to 20. 
		 * Change x to 50 and notice the result.
		 */
		
		int x3 = 50;
		
		if (x3 < 10) {
			System.out.println("Less than 10");
		}
		else if (x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		}
		else {
			System.out.println("Greater than or equals to 20");
		}
		
		//Problem 4: 
		/*
		 * Write a program that declares 1 integer variable x, 
		 * and then assigns 15 to it. 
		 * Write an if-else statement that prints “Out of range” 
		 * if the number is less than 10 or greater than 20 
		 * and prints “In range” if the number is between 10 and 20 
		 * (including equal to 10 or 20). 
		 * Change x to 5 and notice the result.
		 */
		
		int x4 = 5; 
		
		if (x4 < 10 || x4 > 20) {
			System.out.println("Out of range");
		}
		else if (x4 >= 10 && x4 <= 20) {
			System.out.println("In range");
		}
		else {
			//nothing
		}
		
		//Problem 5: 
		/*
		 *  Write a program that uses if-else-if statements 
		 *  to print out grades A, B, C, D, F according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
Use the Scanner class to accept a number score from the user 
to determine the letter grade. 
Print out “Score out of range” if the score is less than 0 or greater than 100.
		 */
		
		//print statement to accept a grade
		System.out.println("Enter Grade: ");
		
		//create scanner class
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if (grade > 90) {
			System.out.println("A");
		}
		else if (grade <= 89 && grade >= 80) {
			System.out.println("B");
		}
		else if (grade <= 79 && grade >= 70) {
			System.out.println("C");
		}
		else if (grade <= 69 && grade >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
		//Problem 6
		/*
		 * Write a program that accepts an integer between 1 and 7 from the user. 
		 * Use a switch statement to print out the corresponding weekday. 
		 * Print “Out of range” if the number is less than 1 or greater than 7. 
		 * Do not forget to include “break” statements in each of your cases.
		 */
		//print statement
		System.out.println("Enter 1 - 7: ");
		
		int num = sc.nextInt(); 
		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		}

		//Problem 7:
		/*
		 * Create a program that lets the users input their filing status and income
		 * Display how much tax the user would have to pay according to status and income.
		 */
		System.out.println("What is your filing status? \n 1. Single \n 2. Married Filing Jointly \n 3. Married Filing Seperately \n 4. Head of Household");
		int status = sc.nextInt();
		
		System.out.println("What is your income?");
		int income = sc.nextInt();
		
		//file status single.. 
		if (status == 1 && income <= 8350) {
			System.out.println("10%");
		}
		else if (status == 1 && income <= 33950) {
			System.out.println("15%");
		}
		else if (status == 1 && income <= 82250) {
			System.out.println("25%");
		}
		
		//file status Married Filing Jointly
		if (status == 2 && income <= 16700) {
			System.out.println("10%");
		}
		else if (status == 2 && income <= 67900) {
			System.out.println("15%");
		}
		
		//Married filing separately
		if (status == 3 && income <= 8350) {
			System.out.println("10%");
		}
		else if (status == 3 && income <= 33950) {
			System.out.println("15%");
		}
		
		//Head of HouseHold
		if (status == 4 && income <= 11950) {
			System.out.println("10%");
		}
		else if (status == 4 && income <= 45500) {
			System.out.println("15%");
		}
	}
}
	
