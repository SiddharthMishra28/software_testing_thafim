package com.tutorac.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static By genderRadioBtnMr = By.id("field-id_gender-1");
    public static By genderRadioBtnMrs = By.id("field-id_gender-2");
    public static By firstNameInputBox = By.id("field-firstname");
    public static By lastNameInputBox = By.id("field-lastname");
    public static By emailInputBox = By.id("field-email");
    public static By passwordInputBox = By.id("field-password");
    public static By birthdayInputBox = By.id("field-birthday");
    public static By termsCheckbox = By.name("psgdpr");
    public static By saveButton = By.xpath("//button[contains(text(), 'Save')]");
}
