package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class DemoSteps {

    private int result;
    private int num_x;

    @Given("This is given step")
    public void thisIsGivenStep() {
        System.out.println("This is given step");
    }

    @When("This is when step")
    public void thisIsWhenStep() {
        System.out.println("This is when step");
    }

    @Then("This is then step")
    public void thisIsThenStep() {
        System.out.println("This is then step");
    }


    @Given("We set x = {int}")
    public void we_set_x(int x) {
        System.out.println("We set x = " + x);
        this.num_x = x;
    }

    @When("We add {int} to x")
    public void we_add_to(int y) {
        System.out.println("We add " + y + " to " + this.num_x);
        this.result = y + this.num_x;
    }

    @Then("We got {int}")
    public void we_got(int z) {
        //    int result = this.x + this.y;
        Assertions.assertEquals(z, this.result, "Result failed");
        System.out.println("We got " + this.result);
    }


}
