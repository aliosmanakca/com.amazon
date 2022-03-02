package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiStepDef {

    @Given("send request to create {string} board")
    public void send_request_to_create_board(String boardname) {

    }

    @Then("assert status code")
    public void assert_status_code() {

    }

    @Then("assert board name is {string}")
    public void assert_board_name_is(String boardname) {

    }
}
