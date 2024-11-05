package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.timeTrackerService;

public class timeTrackerSteps {

        @When("hace click en el boton Manual")
        public void botonClickManual() {
        timeTrackerService.botonClickManual();
    }

        @And("ingresa la hora inicial (.*)$")
        public void ingresarHoraInicial(String horainicial) {
        timeTrackerService.ingresarHoraInicial(horainicial);
    }

        @And("ingresa la hora final (.*)$")
        public void ingresarHoraFinal(String horafinal) {
        timeTrackerService.ingresarHoraFinal(horafinal);
    }

        @And("ingresa la fecha (.*)$")
        public void ingresarFecha(String fecha) {
        timeTrackerService.ingresarFecha (fecha);
    }

        @Then("visualiza que el registro de horas trabajadas se guardo exitosamente")
        public void validarRegistroHorasExitoso() {
        timeTrackerService.validarRegistroHorasExitoso ();
    }

    @And("hace click en el boton ADD")
    public void botonClickADD() {
        timeTrackerService.botonClickADD ();
    }

    @When("ingresa la descripcion (.*)$")
    public void ingresarDescripcion(String descripcion) {
        timeTrackerService.ingresarDescripcion (descripcion);
    }

    @And("hace click en el boton Project")
    public void botonClickProject() {
        timeTrackerService.botonClickProject ();
    }

    @And("selecciona el projecto Crowdar")
    public void clickProjectoCrowdar() {
            timeTrackerService.clickProjectoCrowdar ();
    }

    @And("hace click en el boton tag")
    public void botonClickTag() {
        timeTrackerService.botonClickTag ();
    }

    @And("selecciona el tag Fenix")
    public void clickTagFenix() {
        timeTrackerService.clickTagFenix ();
    }

    @And("hace click en el boton Facturable")
    public void botonClickFacturable() {
        timeTrackerService.botonClickFacturable ();
    }

    @Then("visualiza que los cambios se realizaron de manera exitosa")
    public void validarCambiosRegistroHorasExitoso() throws InterruptedException {
        timeTrackerService.validarCambiosRegistroHorasExitoso ();

    }

    @When("hace click en el boton START")
    public void  botonClickSTART() {
        timeTrackerService.botonClickSTART ();
    }

    @And("hace click en el boton 3 puntos")
    public void botonClick3puntos() {
        timeTrackerService.botonClick3puntos ();
    }

    @And("hace click en el opcion Discard")
    public void opcionClickDiscard() {
        timeTrackerService.opcionClickDiscard ();
    }

    @And("hace click en el boton Discard")
    public void botonClickDiscard() {
        timeTrackerService.botonClickDiscard ();
    }

    @Then("visualiza que el registro de horas trabajadas se cancelo exitosamente")
    public void cancelarRegistroHorasExitoso() {
        timeTrackerService.cancelarRegistroHorasExitoso ();
    }

    @When("hace click en el boton Timer")
    public void botonClickTimer() {
        timeTrackerService.botonClickTimer ();
    }
}



