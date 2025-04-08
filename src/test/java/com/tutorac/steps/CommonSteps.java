package com.tutorac.steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {

    WebDriver driver = null;

    @BeforeAll
    public static void testSetup() {
        System.out.println("Test Setup Steps...");
    }

    @BeforeStep
    public void beforeEachStep() {
        System.out.println("I will run before Each Feature Step..");
    }

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

    @Given("I am a registered user of {string}")
    public void i_am_a_registered_user_of(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("I click on {string} link")
    public void i_click_on_something(String text) {
        driver.findElement(By.xpath("//span[text()='"+text+"']")).click();
    }

    @When("I enter valid {string} and {string} and click on login")
    public void i_enter_valid_and_and_click_on_login(String username, String password) {
        driver.findElement(By.id("field-email")).sendKeys(username);
        driver.findElement(By.id("field-password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).click();
        driver.quit();
    }

    @AfterStep
    public void afterEachStep() {
        System.out.println("I will run after Each Feature Step..");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Testing complete...");
    }
}
