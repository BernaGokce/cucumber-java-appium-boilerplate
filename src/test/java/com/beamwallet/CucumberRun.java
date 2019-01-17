package com.beamwallet;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources", format={"json:target/cucumber.json"})
public class CucumberRun {
}
