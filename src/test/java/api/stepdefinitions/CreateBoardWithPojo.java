package api.stepdefinitions;

import api.pojos.RequestPojo;
import api.pojos.ResponsePojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;


public class CreateBoardWithPojo extends TestBaseApi{

    Response response;
    ResponsePojo resPojo;

    @Given("send request to create {string} board with pojo")
    public void sendRequestToCreateBoardWithPojo(String boardName) {
        setUp();
        spec.pathParams("param1",1, "param2","boards");

        RequestPojo reqPojo = new RequestPojo(boardName, ConfigurationReader.getProperty("key"), ConfigurationReader.getProperty("token"));

        response = given().
                contentType("application/json").
                spec(spec).
                body(reqPojo).
                when().
                post("/{param1}/{param2}");

        response.prettyPrint();
    }

    @Then("get response with pojo")
    public void getResponseWithPojo() {

        resPojo = response.as(ResponsePojo.class); // DeSerialization process --> Json to Java

    }

    @And("assert board name is {string} with pojo")
    public void assertBoardNameIsWithPojo(String boardName) {

        Assert.assertEquals(200, response.statusCode());

        Assert.assertEquals(boardName, resPojo.getName());
    }
}
