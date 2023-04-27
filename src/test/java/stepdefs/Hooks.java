package stepdefs;

import io.cucumber.java.After;
import utils.Drivers.Driver;

public class Hooks {

    @After
    public void after(){
        Driver.quitDriver();
    }
}
