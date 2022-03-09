package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigurationReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBoard extends TestBaseApi {

    Response response;
    JsonPath jsonPath;

    @Given("send request to create {string} board")
    public void send_request_to_create_board(String boardName) throws IOException {

        //define url
        //generate expected data-request data
        //send request and get the response
        //assert

        setUp();
        spec.pathParams("parameter1",1,"parameter2","boards");

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
                post("/{parameter1}/{parameter2}");

        response.prettyPrint();

        jsonPath = response.jsonPath();

        FileWriter writer = new FileWriter("src/test/resources/test_data/ApiBoardId.txt",true);
        writer.write(boardName + " , " + jsonPath.get("id") + "\n");
        writer.close();


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
