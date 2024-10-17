package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.loginService;
import lippia.web.services.workspaceService;

public class workspaceSteps {

    @When("hace click en el boton ...")
    public void botonTresPuntos() {
        workspaceService.botonTresPuntos();
    }

    @And("hace click en el boton Manage Workspaces")
    public void botonManageWorkspaces() {
        workspaceService.botonManageWorkspaces();
    }

    @And("hace click en el boton CREATE NEW WORKSPACE")
    public void botonCreateNewWorkspace() {
        workspaceService.botonCreateNewWorkspace();
    }

    @And("ingresa en el campo Workspace name (.*)$")
    public void ingresarNombreWorkspace(String workspace) {
        workspaceService.ingresarNombreWorkspace(workspace);
    }

    @And("hace click en el boton CREATE")
    public void botonCREATE() {
        workspaceService.botonCREATE();
    }

    @Then("visualiza el workspace creado en el listado")
    public void workspaceCreado() {
        workspaceService.workspaceCreado();
    }

    @And("hace click en el boton SETTINGS")
    public void BotonSETTINGS() {
        workspaceService.BotonSETTINGS();
    }

    @And("ingresa en el campo Settings Workspace name (.*)$")
    public void ingresarSettingsWorkspaceName(String workspace) {
        workspaceService.ingresarSettingsWorkspaceName(workspace);
    }

    @And("hace click en la pagina")
    public void clickPagina() {
        workspaceService.clickPagina();
    }

    @Then("visualiza el cambio del nombre de Workspace")
    public void workspaceNuevoNombre() throws InterruptedException {
        workspaceService.workspaceNuevoNombre();
    }
}
