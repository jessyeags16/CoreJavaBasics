package com.tek.module303;

public class CoreJavaVariables {

	public static void main( String[] args ) {
		
		// Problem 1: 
		/*
		 * Write a program that declares 2 integer variables, 
		 * assigns an integer to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result.
		 */
		
		int num1 = 2;
		int num2 =6;
		
		int numTotal = num1 + num2;
		
		System.out.println(numTotal);
		
		//Problem 2: 
		/*
		 * Write a program that declares 2 double variables, 
		 * assigns a number to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result.
		 */
		
		double doub1 = 10.25;
		double doub2 = 2.25;
		
		double doubTotal = doub1 + doub2;
		
		System.out.println(doubTotal);
		
		//Problem 3:
		/*
		 * Write a program that declares an integer variable and a double variable, 
		 * assigns numbers to each, and adds them together. 
		 * Assign the sum to a variable. 
		 * Print out the result. 
		 * What variable type must the sum be?
		 */
		
		int numProbThree = 2;
		double doubProbThree = 4.0;
		
		double total = numProbThree + doubProbThree;
		
		System.out.println(total);
		/*
		 * The variable type for the sum must be a double.
		 * This is because an int can be assigned as a double, 
		 * a double can not always be an int. If I were to make variable 
		 * total an int, it would not compile because an int cannot have a 
		 * decimal
		 */
		
		//Problem 4: 
		/*
		 * Write a program that declares 2 integer variables,
		 *  assigns an integer to each,
		 *   and divides the larger number by the smaller number. 
		 *   Assign the result to a variable. 
		 *   Print out the result. 
		 *   Now change the larger number to a decimal. 
		 *   What happens? What corrections are needed?
		 */
		int num1Prob4 = 3;
		int num2Prob4 = 6;
		
		int totalProb4 = num1Prob4 + num2Prob4;
		
		System.out.println(totalProb4);
		/*
		 * Changing the number to a decimal without changing the 
		 * variable type will cause an error. 
		 * The Variable type will have to be changed to a double or float
		 * in order for compilation, otherwise, int variable type 
		 * can not have a decimal
		 */
		
		//Problem 5: 
		/*
		 * Write a program that declares 2 double variables,
		 * assigns a number to each, 
		 * and divides the larger by the smaller. 
		 * Assign the result to a variable. 
		 * Print out the result. 
		 * Now, cast the result to an integer. 
		 * Print out the result again.
		 */
		
		double doub1prob5 = 10.0;
		double doub2prob5 = 20.0;
		
		double doubTotalProb5 = doub2prob5 / doub1prob5;
		
		System.out.println("Double: " + doubTotalProb5);
		
		doubTotalProb5 = (int)doubTotalProb5; 
		
		System.out.println("Int: " + doubTotalProb5);
		
		
		//Problem 6: 
		/*
		 * Write a program that declares two integer variables, x, and y, 
		 * and assigns 5 to x and 6 to y. 
		 * Declare a variable q and assign y/x to it and print q. 
		 * Now, cast y to a double and assign it to q. Print q again.
		 */
		
		int x = 5;
		int y = 6;
		
		int q = y / x;
		
		System.out.println(q);
		
		//y = double(y) and 
		//q = (double)y / (double)x; neither of these are working?? 
		
		//Problem 7: 
		/*
		 * Write a program that declares a named constant and uses it in a calculation. Print the result.
		 */
		
		final int CONSTANT_NUM = 2;
		int myNum = CONSTANT_NUM * 3; 
		System.out.println(myNum);
		
		//Problem 8:
		/*
		 * Write a program where you create 3 variables that represent products at a cafe. 
		 * The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
		 * Assign prices to each product. 
		 * Create 2 more variables called subtotal and totalSale and 
		 * complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product.
		 *  Add them all together to calculate the subtotal.
		 *   Create a constant called SALES_TAX and 
		 *   add sales tax to the subtotal to obtain the totalSale amount. 
		 *   Be sure to format the results to 2 decimal places.
		 */
		
		double coffee = 2.00;
		double tea = 1.00;
		double smoothie = 3.00;
		
		double subtotal = 0;
		double totalSale = 0;
		
		final double SALES_TAX = 0.06;
		
		subtotal = coffee * 3 + tea * 4 + smoothie * 2;
		
		double calcTax = subtotal * SALES_TAX;
		totalSale = calcTax + subtotal; 
		
		System.out.println(totalSale);
				
		
	}
}
