package api.test.framework.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @When("the Maker starts a game")
    public void the_maker_starts_a_game() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(1,1);
    }

    @Then("the Maker waits for a Breaker to join")
    public void the_maker_waits_for_a_breaker_to_join() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(1,1);

    }

}
