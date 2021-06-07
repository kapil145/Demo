/*Exercise 2: Write a Java Program to validate the full name of an employee. Create and throw a user defined exception 
 * if firstName and lastName is blank*/

package com.cg.lab5;

import java.util.Scanner;

class NameException extends Exception {
	public NameException(String str) {
		System.out.println(str);
	}
}

public class Lab5Ex2 {
	
	public static void main(String[] args) {
		String firstName, middleName, lastName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		
		try {
			firstName = sc.nextLine();
			if(firstName.isEmpty()) {
				throw new NameException("Please enter your first name");
			}
		}catch(NameException ne) {
			System.out.println(ne);
		}
		
		System.out.println("Enter your middle name: ");
		middleName = sc.next();
		
		System.out.println("Enter your last name: ");
		lastName = sc.nextLine();
		try {
			
			if(lastName.isEmpty()) {
				throw new NameException("Please enter your last name");
			}
		}catch(NameException ne) {
			System.out.println(ne);
		}
		
		sc.close();
		
//		System.out.println("Employee's Full Name: " +firstName + " " + middleName + " " + lastName);
	}
}
