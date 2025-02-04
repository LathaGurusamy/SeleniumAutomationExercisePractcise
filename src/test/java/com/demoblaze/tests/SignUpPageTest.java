package com.demoblaze.tests;

import com.demoblaze.utils.BaseClass;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.SignUpPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageTest {
    BaseClass base;
    HomePage home;
    SignUpPage signUp;

    @BeforeMethod
    public void setUp() {
        base = new BaseClass();
        base.initializeDriver();
        home = new HomePage(base.driver);
        signUp = new SignUpPage(base.driver);
    }

    @Test
    public void testSignUp() {
        home.clickSignUp();
        signUp.enterUsername("testuser");
        signUp.enterPassword("password");
        signUp.clickSignUpButton();
        // Add assertions based on expected results
    }

    @AfterMethod
    public void tearDown() {
        base.quitDriver();
    }
}
