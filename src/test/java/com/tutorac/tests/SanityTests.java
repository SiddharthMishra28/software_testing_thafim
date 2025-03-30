package com.tutorac.tests;

import com.tutorac.config.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityTests extends Hooks {

    @Test
    public void navigationTest() {
        driver.get(configProps.getProperty("app_url"));
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Vistamart");
    }
}
