package api.stepdefinitions;

import com.sun.tools.jxc.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigurationReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ApiStepDef extends TestBaseApi {

    Response response;
    JsonPath jsonPath;

    @Given("send request to create {string} board")
    public void send_request_to_create_board(String boardName) {

        //define url
        //expected data-request data
        //send request and get the response
        //assert

        setUp();
        spec.pathParams("parametre1",1,"parametre2","boards");

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("name",boardName);
        requestBody.put("key", ConfigurationReader.getProperty("key"));
        requestBody.put("token",ConfigurationReader.getProperty("token"));

        System.out.println(requestBody);

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();
        jsonPath = response.jsonPath();

    }

    @Then("assert status code {int}")
    public void assertStatusCode(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());

    }

    @Then("assert board name is {string}")
    public void assert_board_name_is(String boardName) {

        Assert.assertEquals(boardName,jsonPath.getString("name"));

    }




}
