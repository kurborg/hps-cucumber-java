package com.coffeemachine;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class CoffeeMachineTest {

    public static void main (String arg){

        ProjectTest projectTest = new ProjectTest();

        projectTest.testMessagesAreBasedOnLanguageEnglish();
        projectTest.testMessagesAreBasedOnLanguageFrench();
    }
}