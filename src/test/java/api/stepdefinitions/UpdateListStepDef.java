package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigurationReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static io.restassured.RestAssured.given;

public class UpdateListStepDef extends TestBaseApi{

    Response response;
    JsonPath jsonPath;

    @Given("send request to update {string} list to new name {string}")
    public void send_request_to_update_list_to_new_name(String currentName, String newName) throws IOException {

        String idList = "";

        FileReader readfile = new FileReader("src/test/resources/test_data/ApiListId.txt");
        BufferedReader readbuffer = new BufferedReader(readfile);
        Scanner scan = new Scanner(readfile);

        do {
            String text = readbuffer.readLine();
            if (text.contains(currentName)) {
                idList = text.substring(text.indexOf(",") + 1);
                idList = idList.trim();
            }
        } while (scan.hasNext());


        setUp();
        spec.pathParams("param1",1 , "param2","lists", "param3",idList);

        HashMap<String,String> requestMap = new HashMap<>();
        requestMap.put("name" , newName);
        requestMap.put("key" , ConfigurationReader.getProperty("key"));
        requestMap.put("token" , ConfigurationReader.getProperty("token"));

        response = given().
                contentType("application/json").
                spec(spec).
                body(requestMap).
                when().
                put("/{param1}/{param2}/{param3}");

        response.prettyPrint();


        // to update the name in the ApiListId.txt file :
        List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("src/test/resources/test_data/ApiListId.txt")));

        for (int i = 0; i < fileContent.size(); i++) {
            if (fileContent.get(i).contains(currentName)) {
                fileContent.set(i, newName + " , " + idList);
                break;
            }
        }

        Files.write(Paths.get("src/test/resources/test_data/ApiListId.txt"), fileContent);

    }



    @Then("verify updated list name is {string}")
    public void verify_updated_list_name_is(String newName) {

        jsonPath = response.jsonPath();

        Assert.assertEquals(200, response.statusCode());

        Assert.assertEquals(newName, jsonPath.getString("name"));
    }


}
