package ui.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ui.utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){
        //System.out.println("setUp Çalıştı.");
    }
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if(scenario.isFailed()){
            scenario.embed(screenshot , "image/png");
        }
        //Driver.closeDriver();
    }

}
