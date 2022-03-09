package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigurationReader;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

import static io.restassured.RestAssured.given;

public class CreateListStepDef extends TestBaseApi{

    Response response;
    JsonPath jsonPath;

    @Given("send request to create {string} list in {string} board")
    public void sendRequestToCreateListInBoard(String listName, String boardName) throws IOException {
        String idBoard = "";

        FileReader readfile = new FileReader("src/test/resources/test_data/ApiBoardId.txt");
        BufferedReader readbuffer = new BufferedReader(readfile);
        Scanner scan = new Scanner(readfile);

        do {
            String text = readbuffer.readLine();
            if (text.contains(boardName)) {
                idBoard = text.substring(text.indexOf(",") + 1);
                idBoard = idBoard.trim();
            }
        } while (scan.hasNext());


        setUp();
        spec.pathParams("param1",1 ,"param2","lists");

        HashMap<String,String> requestMap = new HashMap<>();
        requestMap.put("name" , listName);
        requestMap.put("idBoard" , idBoard);
        requestMap.put("key" , ConfigurationReader.getProperty("key"));
        requestMap.put("token" , ConfigurationReader.getProperty("token"));

        response = given().
                contentType("application/json").
                spec(spec).
                body(requestMap).
                when().
                post("/{param1}/{param2}");

        response.prettyPrint();

        jsonPath = response.jsonPath();

        FileWriter writer = new FileWriter("src/test/resources/test_data/ApiListId.txt",true);
        writer.write(listName + " , " + jsonPath.get("id") + "\n");
        writer.close();

    }



    @Then("verify list name is {string}")
    public void verifyListNameIs(String listName) {

        Assert.assertEquals(200 , response.statusCode());

        Assert.assertEquals(listName , jsonPath.getString("name"));
    }
}
