package com.tek.module303;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem 1: 
		/*
		 * Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */
		
		int[] numbers = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		System.out.println(Arrays.toString(numbers)); //you cannot print arrays directly
		
		//Problem 2
		/*
		 * Write a program that returns the middle element in an array. 
		 * Give the following values to the integer array: {13, 5, 7, 68, 2} 
		 * and produce the following output: 7
		 */
		
		int[] num = new int[5]; 
		
		num[0] = 13;
		num[1] = 5;
		num[2] = 7;
		num[3] = 68;
		num[4] = 2;
		
		System.out.println(num[2]);
		
		//Problem 3:
		/*
		 * Write a program that creates an array of String type 
		 * and initializes it with the strings “red”, “green”, “blue” and “yellow”. 
		 * Print out the array length. 
		 * Make a copy using the clone( ) method. 
		 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		 */
		
		String[] colors = new String[4];
		
		colors[0] = "red";
		colors[1] = "green";
		colors[2] = "blue";
		colors[3] = "yellow";
		
		System.out.println("The length of this array is: " + colors.length);
		
		colors.clone();
		Arrays.toString(colors);
		System.out.println("Length after cloning colors is: " + colors.length);
		
		//Problem 4:
		/*
		 * Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers. 
		 * Print out the value at the first index and the last index using length - 1 as the index.
		 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  
		 * Notice the type of exception which is produced. 
		 * Now try to assign a value to the array index 5. 
		 * You should get the same type of exception.
		 */
		
		int[] num1 = new int[4];
		num1[0] = 11;
		num1[1] = 31;
		num1[2] = 78;
		num1[3] = 91;
		
		System.out.println(num1[0]);
		System.out.println(num1[num1.length - 1]);
		
		//num1[5] = 60;
			/*
			 * Intersting, ^this code doesn't error, 
			 * when compiled throws exception out of bounds for length 
			 */
		
		//Problem 5
		/*
		 * Write a program where you create an integer array with a length of 5. 
		 * Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
		 */
		
		int[] num2 = new int[5];
		for (int i = 0; i < 5; i++) {
			num2[i] = i;
		System.out.print(" " + num2[i] + ", ");
		}
		
		System.out.println();
		//Problem 6
		/*
		 * Write a program where you create an integer array of 5 numbers. 
		 * Loop through the array and assign the value of the loop control variable multiplied by 2 
		 * to the corresponding index in the array.
		 */
		
		int[] num3 = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = i * 2;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		//Problem 7 
		/*
		 * Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, except for the middle (index 2) element.
		 */
		
		int[] num4 = new int[5];
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				System.out.print("");
			}
			else {
				num4[i] = i;
				System.out.print(num4[i]);
			}
		}
		System.out.println();
		
		//Problem 8
		/*
		 * Write a program that creates a String array of 5 elements 
		 * and swaps the first element with the middle element without creating a new array.
		 */
		
		int[] num5 = new int[5];
		for (int i = 0; i < 5; i++) {
			num5[i] = i;
			System.out.print(num[i] + " ");
		}
		System.out.println("");
		
		int placeHolder = num5[0];
		num5[0] = num5[2];
		num5[2] = placeHolder;
		
		for (int i = 0; i < num5.length; i++) {
			System.out.print(" " + num5[i]);
		}
		
		//Problem 9
		/*
		 * Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
		 * Print the array in ascending order, and print the smallest and the largest element of the array.
		 */
		int temp = 0; //temp value 
		
		int[] num6 = {4, 2, 9, 13, 1, 0};
		for(int i = 0; i < num6.length; i++) {
			for (int j = i + 1; j < num6.length; j++) {
				if (num6[i] > num6[j]) {
					temp = num6[i];
					num6[i] = num6[j];
					num6[j] = temp;
				}
			}
		System.out.println("Ascending order: " + num6[i]);
		}
		System.out.println("Smallest Number: " + num6[0]);
		System.out.println("Largest Number: " + num6[5]);
	
		//Problem 10
		/*
		 * Create an array that includes an integer, 3 strings, and 1 double. Print the array
		 */
		
		//I need to create an array of objects, I cannot combine variable types
		Object[] obj = new Object[5];
		obj[0]= 2;
		obj[1] = "Hey";
		obj[2] = " this is cool. ";
		obj[3] = "I didn't know I could do this!";
		obj[4] = 2.0;
		
		for(int i = 0; i < obj.length; i++) {
			System.out.print(" " + obj[i]);
		}
		System.out.println("");

		//Problem 11: 
		/* 
		 * Write some Java code that asks the user how many favorite things they have. 
		 * Based on their answer, you should create a String array of the correct size. 
		 * Then ask the user to enter the things and store them in the array you created. 
		 * Finally, print out the contents of the array.
		 */
		
		//initialize scanner 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many favorite things do you have?");
		int favorites = sc.nextInt();
 
		//creating array 
		String[] userFav = new String[10];
		
		for (int i = 0; i < favorites; i++) {
			System.out.println("Enter your favorite: ");
			userFav[i] = sc.nextLine();
		}
		System.out.println("These are your favorites: " + Arrays.toString(userFav));
	
		sc.close();
	}
}
