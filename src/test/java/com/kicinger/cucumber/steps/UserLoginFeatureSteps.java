package com.kicinger.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by krzysztofk on 2017-07-26.
 */
public class UserLoginFeatureSteps {

    private WebDriver driver;


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C://chrome-driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
    }

    @When("^User enters \"(.*)\" and \"(.*)\"")
    public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
        driver.findElement(By.id("log")).sendKeys(username);
        driver.findElement(By.id("pwd")).sendKeys(password);
        driver.findElement(By.id("login")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {
//        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
    }

    @Then("^Message displayed Logout Successfully$")
    public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
    }

}
