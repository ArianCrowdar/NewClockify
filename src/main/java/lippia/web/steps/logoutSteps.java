package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.loginService;
import lippia.web.services.logoutService;

public class logoutSteps {

    @When("hace click en el boton Usuario")
    public void botonUsuario() {
        logoutService.botonUsuario();
    }

    @Given("esta en la pagina de Tracker")
    public void paginaTracker() {
        logoutService.paginaTracker();
    }

    @And("hace click en el boton Logout")
    public void botonLogout() {
        logoutService.botonLogout();
    }

    @Then("la sesion del usuario se cierra mostrando la pantalla de Login")
    public void logoutExitoso() {
        logoutService.logoutExitoso();
    }
}
