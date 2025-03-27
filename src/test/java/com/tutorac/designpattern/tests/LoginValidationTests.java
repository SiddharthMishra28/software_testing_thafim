package com.tutorac.designpattern.tests;

import com.tutorac.designpattern.pages.HomePage;
import com.tutorac.designpattern.pages.SignInPage;
import com.tutorac.designpattern.utils.UiAutomationUtils;
import org.testng.annotations.Test;

public class LoginValidationTests extends Hooks {

    @Test
    public void loginTestValidCredentials() {
        UiAutomationUtils utils = new UiAutomationUtils(driver);
        utils.navigate("http://vistacommerce-qa.rf.gd/");
        utils.clickElement(HomePage.signInLink);
        utils.type(SignInPage.signInEmailField, "abc@test.com");
        utils.type(SignInPage.signInPasswordField, "secretpass");
    }

    @Test
    public void loginTestInvalidCredentials() {

    }
}
