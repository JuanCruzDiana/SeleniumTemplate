package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class TemplateSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to www.qualis-lab.com")
    public void iNavigateToQL() {
        landingPage.navegateToQualisLab();
    }

    @When("I go to the navigation bar")
    public void navigationBarUse() {
        landingPage.clickOnNosotros();
    }

}