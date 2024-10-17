package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.proyectoService;

public class proyectoSteps {

    @When("hace click en el boton PROJECTS")
    public void botonProjects() {
        proyectoService.botonProjects();
    }

    @And("hace click en el boton CREATE NEW PROJECT")
    public void botonCreateNewProject() {
        proyectoService.botonCreateNewProject();
    }

    @And("ingresa en el campo Enter project name (.*)$")
    public void ingresarNombreProyecto(String projecto) {
        proyectoService.ingresarNombreProyecto(projecto);
    }

    @Then("visualiza el proyecto agregado a la lista")
    public void proyectoExitoso() {
        proyectoService.proyectoExitoso();
    }

    @And("hace click en el boton CREATE PROJECT")
    public void botonCREATEPROJECT() {
        proyectoService.botonCREATEPROJECT();
    }
}
