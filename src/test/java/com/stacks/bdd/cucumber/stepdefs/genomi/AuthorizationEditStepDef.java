package com.stacks.bdd.cucumber.stepdefs.genomi;

import com.stacks.bdd.cucumber.runner.CucumberTestState;
import com.stacks.bdd.selenium.page.rms.AuthorizationEditPage;
import com.stacks.bdd.selenium.page.rms.AuthorizationViewPage;
import com.stacks.bdd.selenium.page.rms.TicketListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.apache.log4j.Logger;

public class AuthorizationEditStepDef {
    private static Logger logger = Logger.getLogger(AuthorizationEditStepDef.class.getName());

    private final CucumberTestState state;


    public AuthorizationEditStepDef(CucumberTestState state) {
        logger.trace("AuthorizationEditStepDef");
        this.state = state;
    }


    @And("^I open \"([^\"]*)\" power arrow button$")
    public void iOpenPowerArrowButton(String power)  {
        logger.trace("I open" + power + "power arrow button");
        AuthorizationEditPage authorizationEditPage = new AuthorizationEditPage(state.getDriver());
        authorizationEditPage.openPowerArrow(power);
    }

    @And("^I (check|uncheck) \"([^\"]*)\" power checkbox$")
    public void iCheckPowerCheckbox(String status, String power) {
        logger.trace("I check" + power+ "power checkbox");
        AuthorizationEditPage authorizationEditPage = new AuthorizationEditPage(state.getDriver());
        authorizationEditPage.checkPowerCheckbox(status,power);
    }

    @And("^I click on save button$")
    public void iClickOnSaveButton() {
        logger.trace("I click on save button");
        AuthorizationEditPage authorizationEditPage = new AuthorizationEditPage(state.getDriver());
        authorizationEditPage.clickOnSaveButton();
    }
}