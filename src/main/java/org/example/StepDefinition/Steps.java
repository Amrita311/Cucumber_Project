package org.example.StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Base.BaseTest;
import org.example.POM.HomePage;
import org.example.POM.LoginPage;

import java.sql.SQLOutput;

public class Steps {

    @Given("Launch the browser and navigates to login page")
    public void launch_the_browser_and_navigates_to_login_page() {
        HomePage hm=new HomePage();
        hm.navigatesToLoginPage();

    }
    @When("Enters the username and password")
    public void enters_the_username_and_password(DataTable dataTable) {
       LoginPage lp=new LoginPage();
       String userName=dataTable.asMaps().get(0).get("username");
       String pass=dataTable.asMaps().get(0).get("password");
       lp.enterCredentials(userName,pass);
    }
    @Then("User should be on home page")
    public void user_should_be_on_home_page() {
        HomePage hm=new HomePage();
        hm.verifyTheLogin();

    }

    @When("Enters the cedentials")
    public void enters_the_cedentials(DataTable dataTable) {
        LoginPage lp=new LoginPage();
        String userName=dataTable.asMaps().get(0).get("username");
        String pass=dataTable.asMaps().get(0).get("password");
        lp.enterCredentials(userName,pass);
    }


    @Then("verify the login status")
    public void verify_the_login_status() {
        HomePage homePage=new HomePage();
        homePage.verifyTheLogin();
    }

    @When("Enters the cedential")
    public void enters_the_cedential(DataTable dataTable) {
        LoginPage lp=new LoginPage();
        String userName=dataTable.asMaps().get(0).get("username");
        String pass=dataTable.asMaps().get(0).get("password");
        lp.enterCredentials(userName,pass);

    }





}
