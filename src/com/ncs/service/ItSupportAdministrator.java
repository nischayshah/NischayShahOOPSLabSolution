package com.ncs.service;

import java.util.Scanner;

import com.ncs.model.Employee;

public class ItSupportAdministrator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name :");
		String firstName = sc.next();
		System.out.println("Enter Last Name");
		String lastName = sc.next();

		Employee employee = new Employee(firstName, lastName);
		CredentialService credentialGenerator = new CredentialService();

		String email;
		char[] generatedPassword;

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			employee.setDepartment("Technical");
			email = credentialGenerator.emailAddressGenerator(firstName.toLowerCase(), lastName.toLowerCase(), "tech");
			generatedPassword = credentialGenerator.passwordGenerator();
			credentialGenerator.showCredentials(employee, email, generatedPassword);
			break;

		case 2:
			employee.setDepartment("Admin");
			email = credentialGenerator.emailAddressGenerator(firstName.toLowerCase(), lastName.toLowerCase(), "adm");
			generatedPassword = credentialGenerator.passwordGenerator();
			credentialGenerator.showCredentials(employee, email, generatedPassword);
			break;

		case 3:
			employee.setDepartment("Human Resource");
			email = credentialGenerator.emailAddressGenerator(firstName.toLowerCase(), lastName.toLowerCase(), "hr");
			generatedPassword = credentialGenerator.passwordGenerator();
			credentialGenerator.showCredentials(employee, email, generatedPassword);
			break;

		case 4:
			employee.setDepartment("Legal");
			email = credentialGenerator.emailAddressGenerator(firstName.toLowerCase(), lastName.toLowerCase(), "lg");
			generatedPassword = credentialGenerator.passwordGenerator();
			credentialGenerator.showCredentials(employee, email, generatedPassword);
			break;

		default:
			System.out.println("Please enter correct option");

		}

		sc.close();
	}

}
