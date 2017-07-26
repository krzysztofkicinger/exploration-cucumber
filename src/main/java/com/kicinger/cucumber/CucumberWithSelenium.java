package com.kicinger.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by krzysztofk on 2017-07-26.
 */
public class CucumberWithSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chrome-driver/chromedriver.exe");

        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage()
                .timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.findElement(By.id("log")).sendKeys("testuser_1");
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
        driver.findElement(By.id("login")).click();

        System.out.println("Login Successfully");

        driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

        System.out.println("Logout Successfully");

        driver.quit();
    }

}
