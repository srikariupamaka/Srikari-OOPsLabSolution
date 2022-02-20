package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Srikari" , "Upamaka");
		String generatedEmail;
		char[] generatedPassword;
		CredentialService cService = new CredentialService();
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("Please Enter the Dept. from the following");
		System.out.println("1. Technical Dept.");
		System.out.println("2. Admin Dept.");
		System.out.println("3. Human Resourse Dept.");
		System.out.println("4. Legal Dept.");
		
		choice = scan.nextInt();
		
		if (choice == 1) {
			
		    generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "technical");
			generatedPassword = cService.generatePassword();
			cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 2) {
			 generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "admin");
				generatedPassword = cService.generatePassword();
				cService.showCredentials(employee1, generatedEmail, generatedPassword);
			
		}
		else if (choice == 3) {
			 generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "HR");
				generatedPassword = cService.generatePassword();
				cService.showCredentials(employee1, generatedEmail, generatedPassword);
		}
		else if (choice == 4) {
			 generatedEmail = cService.generateEmailAddress(employee1.getFirstName(), employee1.getLastName(), "legal");
				generatedPassword = cService.generatePassword();
				cService.showCredentials(employee1, generatedEmail, generatedPassword);
			
		}
		else {
			System.out.println("Invalid Choice.... ");
		}
	
	}

}
