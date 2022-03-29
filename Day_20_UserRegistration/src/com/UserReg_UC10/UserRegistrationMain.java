package com.UserReg_UC10;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public static void main(String[] args) {
    		System.out.println("---Welcome to User Registration System Problem---\n");
        List emails = new ArrayList();
        
        //Valid Emails 
        emails.add("abc@yahoo.com");	emails.add("abc-100@yahoo.com");	emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");	emails.add("abc-100@abc.net");		emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");		emails.add("abc@gmail.com.com");	emails.add("abc+100@gmail.com");			
        
        //Invalid Emails
        emails.add("\nabc@.com.my");		emails.add("abc123@gmail.a.");		emails.add("abc123@.com");
        emails.add("abc123@.com.com");		emails.add("abc()*@gmail.com");		emails.add("abc_%*.com");
        emails.add("abc..2002@gmail.com");	emails.add("abc@ac@gmail.com");		emails.add("abc@gmail.com.1a.");
        
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
    for(Object emaillist : emails){
        Matcher matcher = pattern.matcher((String) emaillist);
        	System.out.println(emaillist +" : "+ matcher.matches());
    	}	
    UserRegistration user = new UserRegistration();
    Scanner scanner = new Scanner(System.in);
    	System.out.println("\nEnter a Number for Validating \nFirst Name - 1, Last Name - 2, "
    			+ "Email - 3, Mobile Number - 4, Password - 5 : ");
    switch (scanner.nextInt()){
        case 1:
            UserRegistration.validFirstName();
            break;
        case 2:
            UserRegistration.validLastName();
            break;
        case 3:
            UserRegistration.validEmail();
            break;
        case 4:
            UserRegistration.validMobileNumber();
            break;
        case 5:
        	UserRegistration.validPassword();
        	break;
        }
    }
}