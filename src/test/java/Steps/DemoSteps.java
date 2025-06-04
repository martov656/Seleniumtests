package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {

    @Given("This is given step")
    public void thisIsGivenStep(){
        System.out.println("This is given step");
    }

    @When("This is when step")
    public void thisIsWhenStep(){
        System.out.println("This is when step");
    }

    @Then("This is then step")
    public void thisIsThenStep(){
        System.out.println("This is then step");
    }

}
