package com.premiumfaber.eemavenapp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/com.premiumfaber.eemavenapp/",
        plugin = {"pretty"})
public class RunCucumberTest{
}
