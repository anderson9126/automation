package co.com.screenplay.project.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class createUserStep {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("that the {string} should enter the shopping cart")
    public void thatTheUserShouldEnterTheShoppingCart(String actor) {

    }


    @When("go to the web page and create your user")
    public void goToTheWebPageAndCreateYourUser() {

    }


    @Then("It will validate that it was created correctly by the creation alert")
    public void itWillValidateThatItWasCreatedCorrectlyByTheCreationAlert() {

    }

}
