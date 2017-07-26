package com.kicinger.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by krzysztofk on 2017-07-26.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        glue = {
                "com.kicinger.cucumber.steps"
        },
        format = {
                "pretty"
        }
)
public class CucumberWithSeleniumTest {



}