package com.tek.module303;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j, k;
		j = 10;
		j = 5; //overwriting that j = 10
		k = j;
		System.out.println("J is: " + j);
		System.out.println("K is: " + k);
		
		
		//multiple assignments
		k = j = 10;
		System.out.println("K is: " + k);
		System.out.println("J is: " + j);

	}

}
