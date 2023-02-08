package com.tek.module303;

public class StringMethodGuidedLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LAB OBJECTIVE: 
		 * In this lab, you will understand and demonstrate the inbuilt methods in the String class.
		 *  These methods help you to manipulate Strings type data. 
		 */
		
		// 1. The length() method
		
		String s1 = "Java";
		String s2 = "";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println("Java".length());
		System.out.println("Java\n".length()); //new line gets counted as part of length
		System.out.println("Learn Java".length());
		
		// 2. IsEmpty() method
		/*
		 * This method checks whether the String contains anything or not.
		 * If the Java String is empty, it returns true or false. For example:
		 */
		
		String str1 = "";
		String str2 = "Hello";
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty()); 
		
		// 3. Trim() method
		/*
		 * The Java string trim() method removes the leading and trailing spaces. 
		 * It checks the Unicode value of the space character (‘\u0020’) before and after the string. 
		 * If it exists, then remove the spaces and return the omitted string. For example:
		 */
		
		String s3 = "   Hello   ";
		System.out.println(s3 + "How are you?");
		System.out.println(s3.trim() + " How are you?");
		
		// 4. toLowerCase() method
		
		String s4 = "HELLO HOw are you?";
		String s4lower = s4.toLowerCase();
		System.out.println(s4lower);
		
		//5. toUpper() method
		
		String s5 = "hello, how are you";
		String s5Upper = s5.toUpper();
	}

}
