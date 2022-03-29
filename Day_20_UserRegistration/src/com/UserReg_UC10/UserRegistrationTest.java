package com.UserReg_UC10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstname_WhenProper_ShouldReturnFirstNameisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validFirstName();
        Assertions.assertEquals("First Name is Valid", actualresult);
    }

    @Test
    public void givenLastname_WhenProper_ShouldReturnLastNameisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validLastName("Krishna");
        Assertions.assertEquals("Last Name is Valid", actualresult);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnEmailisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validEmail("vamshik484@gmail.com");
        Assertions.assertEquals("Email is Valid", actualresult);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnPhoneNoisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validMobileNumber("91 8722004444");
        Assertions.assertEquals("Phone number is Valid", actualresult);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnPasswordisValid() {
        UserRegistration input = new UserRegistration();
        String actualresult = input.validPassword("BridgeLabz@22");
        Assertions.assertEquals("Password is Valid", actualresult);
    }
}