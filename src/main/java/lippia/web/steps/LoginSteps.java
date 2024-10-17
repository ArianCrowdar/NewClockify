package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.loginService;

public class LoginSteps extends PageSteps
{

    @When("hace click en el boton Log in manually")
    public void botonClickLogInManually() {
        loginService.botonClickLogInManually();
    }

    @Then("ingresa a la cuenta de clockify de manera exitosa")
    public void loginExitoso() {
        loginService.loginExitoso();
    }

    @Given("esta en la pagina de Login")
    public void loginPagina() {
        loginService.loginPagina();
    }

    @And("ingresa el email (.*)$")
    public void ingresarEmail(String email) {
        loginService.ingresarEmail (email);
    }

    @And("ingresa el password (.*)$")
    public void ingresarPassword(String password) {
        loginService.ingresarPassword (password);
    }

    @And("hace click en el boton LOG IN")
    public void botonLOGIN() {
        loginService.botonLOGIN();
    }

    @Then("visualiza el mensaje de error Email format is not valid")
    public void mensajeErrorEmailFormatNotValid() {
        loginService.mensajeErrorEmailFormatNotValid();
    }
}
