package com.virgingames.cucumber.steps;

import com.virgingames.virgingamesinfo.VirginGamesSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;

public class MyStepdefs {
    @Steps
    VirginGamesSteps steps;


    @When("User sends a Get request to list end point with currency as a {string}")
    public void userSendsAGetRequestToListEndPointWithCurrencyAsA(String currency) {
        steps.getAllDataByEndPoint(currency);
    }

    @Then("I verify the Currency as a {string}")
    public void iVerifyTheCurrencyAsA(String  currency) {
        List<HashMap<String,Object>> expectedCurrency = steps.getAllDataByEndPoint(currency);
        Assert.assertTrue(expectedCurrency.contains(currency));
    }
}
