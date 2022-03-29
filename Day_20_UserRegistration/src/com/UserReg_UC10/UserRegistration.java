package com.UserReg_UC10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static void validFirstName(){
        	System.out.print("\nEnter First Name: ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("\nFirst Name is Valid");
        else
            System.out.println("\nFirst Name is Invalid");
    	}
    public static void validLastName(){
        	System.out.print("\nEnter Last Name: ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("\nLast Name is Valid");
        else
            System.out.println("\nLast Name is Invalid");
    }
    public static void validEmail() {
        	System.out.println("\nEnter the Email ID: ");
        String email = scanner.next();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();
        if (r)
            System.out.println("\nEmail is Valid");
        else
            System.out.println("\nEmail is Invalid");
    }
    public static void validMobileNumber(){
        	System.out.print("\nEnter your Mobile number: ");
        String phoneNo = scanner.nextLine();
        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("\nMobile number is Valid");
        else
            System.out.println("\nMobile number is Invalid");
    }
    public static void validPassword(){
        	System.out.println("\nEnter the Password: ");
        String password = scanner.next();
        String regex = "^(?=.[a-z])(?=.[A-Z])(?=.[0-9])[#?!@$%^&-]{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean r = m.matches();
        if (r)
            System.out.println("\nPassword is Valid");
        else
            System.out.println("\nPassword is Invalid");
    }
}