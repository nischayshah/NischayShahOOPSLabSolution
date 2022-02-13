package com.ncs.service;

import java.util.Random;

import com.ncs.model.Employee;

public class CredentialService {

	public char[] passwordGenerator() {
		
		String passwordCharacters="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+=/'\\'<>~abcdefghijklmnopqrstuvwxyz";
		Random random=new Random();
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			password[i] = passwordCharacters.charAt(random.nextInt(passwordCharacters.length()));
		}
		
		return password;
		
	}
	
	public String emailAddressGenerator(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] passwordGenerator) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email    --->"+email);
		System.out.print("Password --->");
		System.out.print(passwordGenerator);
	}
	
	
}
