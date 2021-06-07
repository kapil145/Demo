/*Exercise 1:  Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.*/

package com.cg.lab5;

import java.util.Scanner;

class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  System.out.println(str);
	 }
}

public class Lab5Ex1 extends Exception {
	
	public static void main(String[] args){
		System.out.println("Age Validator: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		try {
			if(age < 15) {
				throw new AgeException("Age is Invalid");
			}
			else {
				System.out.println("Age is valid");
			}
		}catch(AgeException ae){
			System.out.println(ae);
		}
	}
}
