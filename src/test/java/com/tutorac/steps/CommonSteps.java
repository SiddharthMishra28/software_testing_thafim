package com.tutorac.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {

    WebDriver driver = null;

    @Given("I am a registered user of vistacommerce app")
    public void i_am_a_registered_user_of_vistacommerce_app() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vistacommerce-qa.rf.gd/");
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
    }
    @When("I enter valid username and password and click on login")
    public void i_enter_valid_username_and_password_and_click_on_login() {
        driver.findElement(By.id("field-email")).sendKeys("abc@test.com");
        driver.findElement(By.id("field-password")).sendKeys("pass123");
        driver.findElement(By.id("submit-login")).click();
    }
    @Then("I should be able to login to my profile page")
    public void i_should_be_able_to_login_to_my_profile_page() {
        System.out.println("Test Completed!");
        driver.quit();
    }
}
