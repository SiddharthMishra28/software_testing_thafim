package com.tutorac.tests;

import com.aventstack.extentreports.Status;
import com.tutorac.config.Hooks;
import com.tutorac.pages.CreateAccountPage;
import com.tutorac.pages.HomePage;
import com.tutorac.pages.LoginPage;
import com.tutorac.utils.TestDataUtils;
import com.tutorac.utils.UIInteractionUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateAccountTest extends Hooks {

    UIInteractionUtils utils;

    @Test(dataProvider = "user_provider")
    public void registerUserTest(String socialTitle,
                                 String firstName,
                                 String lastName,
                                 String email,
                                 String password,
                                 String birthDate) {
        utils = new UIInteractionUtils(driver);
        testInstance.log(Status.INFO, "Navigating to "+configProps.getProperty("app_url"));
        utils.navigate(configProps.getProperty("app_url"));
        utils.clickElement(HomePage.signInLink);
        utils.clickElement(LoginPage.createNewAccountLink);
        if(socialTitle.equalsIgnoreCase("MR")) {
            utils.clickElement(CreateAccountPage.genderRadioBtnMr);
        }else {
            utils.clickElement(CreateAccountPage.genderRadioBtnMrs);
        }
        utils.type(CreateAccountPage.firstNameInputBox, firstName);
        utils.type(CreateAccountPage.lastNameInputBox, lastName);
        utils.type(CreateAccountPage.emailInputBox, email);
        utils.type(CreateAccountPage.passwordInputBox, password);
        utils.type(CreateAccountPage.birthdayInputBox, birthDate);
        utils.clickElement(CreateAccountPage.termsCheckbox);
        utils.clickElement(CreateAccountPage.saveButton);
    }

    @DataProvider(name = "user_provider")
    public String[][] userDataProvider() {
        return TestDataUtils.readExcelData("register_user");
    }
}
