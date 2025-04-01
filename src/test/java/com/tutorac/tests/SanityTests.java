package com.tutorac.tests;

import com.tutorac.config.Hooks;
import com.tutorac.pages.HomePage;
import com.tutorac.pages.LoginPage;
import com.tutorac.utils.UIInteractionUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityTests extends Hooks { // IS-A
    UIInteractionUtils utils; // HAS-A

    @Test
    public void navigationTest() {
        utils = new UIInteractionUtils(driver);
        utils.navigate(configProps.getProperty("app_url"));
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Vistamart");
    }

    @Test
    public void loginTest() {
        utils = new UIInteractionUtils(driver);
        utils.navigate(configProps.getProperty("app_url"));
        utils.clickElement(HomePage.signInLink);
        utils.type(LoginPage.email, "abc@def.com");
        utils.type(LoginPage.password, "pass123");
        utils.clickElement(LoginPage.signInButton);
    }
}
