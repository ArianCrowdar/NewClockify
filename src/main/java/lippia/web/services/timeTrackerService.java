package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.loginConstants;
import lippia.web.constants.timeTrackerConstants;

import static com.crowdar.core.actions.ActionManager.*;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class timeTrackerService {


    public static void botonClickManual() {
        WebActionManager.click(timeTrackerConstants.MANUAL_BUTTON);
    }

    public static void ingresarHoraInicial(String horainicial) {
        WebActionManager.click(timeTrackerConstants.ENTER_INITIAL_TIME);
        WebActionManager.setInput(timeTrackerConstants.ENTER_INITIAL_TIME, horainicial);
    }

    public static void ingresarHoraFinal(String horafinal) {
        WebActionManager.click(timeTrackerConstants.ENTER_FINAL_TIME);
        WebActionManager.setInput(timeTrackerConstants.ENTER_FINAL_TIME, horafinal);
    }

    public static void ingresarFecha(String fecha) {
        WebActionManager.click(timeTrackerConstants.ENTER_DATE);
        WebActionManager.setInput(timeTrackerConstants.ENTER_DATE, fecha);
    }

    public static void validarRegistroHorasExitoso() {
        waitVisibility(timeTrackerConstants.MESSAGE_SUCCESSFUL);
        Assert.assertTrue(isVisible(timeTrackerConstants.MESSAGE_SUCCESSFUL));
    }

    public static void botonClickADD() {
        waitVisibility(timeTrackerConstants.ADD_BUTTON);
        WebActionManager.click(timeTrackerConstants.ADD_BUTTON);
    }

    public static void ingresarDescripcion(String descripcion) {
        waitVisibility(timeTrackerConstants.ENTER_DESCRIPTION);
        WebActionManager.click(timeTrackerConstants.ENTER_DESCRIPTION);
        WebActionManager.setInput(timeTrackerConstants.ENTER_DESCRIPTION, descripcion);
    }

    public static void botonClickProject() {
        WebActionManager.click(timeTrackerConstants.PROJECT_BUTTON);
    }

    public static void clickProjectoCrowdar() {
        WebActionManager.click(timeTrackerConstants.CLICK_CROWDAR);
    }

    public static void botonClickTag() {
        WebActionManager.click(timeTrackerConstants.TAG_BUTTON);
    }

    public static void clickTagFenix() {
        WebActionManager.click(timeTrackerConstants.CLICK_FENIX);
    }

    public static void botonClickFacturable() {
        WebActionManager.click(timeTrackerConstants.BILLABLE_BUTTON);
    }

    public static void validarCambiosRegistroHorasExitoso() throws InterruptedException {
        waitVisibility(timeTrackerConstants.MESSAGE_SUCCESSFUL);
        Assert.assertTrue(isVisible(timeTrackerConstants.MESSAGE_SUCCESSFUL));
        Thread.sleep(3000);
    }

    public static void botonClickSTART() {
        WebActionManager.click(timeTrackerConstants.START_BUTTON);
    }

    public static void botonClick3puntos() {
        WebActionManager.click(timeTrackerConstants.TRESPUNTOS_BUTTON);
    }

    public static void opcionClickDiscard() {
        WebActionManager.click(timeTrackerConstants.DISCARD_OPTION);
    }

    public static void botonClickDiscard() {
        waitClickable(timeTrackerConstants.DISCARD_BUTTON);
        WebActionManager.click(timeTrackerConstants.DISCARD_BUTTON);
    }

    public static void cancelarRegistroHorasExitoso() {
        waitVisibility(timeTrackerConstants.MESSAGE_SUCCESSFUL);
        Assert.assertTrue(isVisible(timeTrackerConstants.MESSAGE_SUCCESSFUL));
    }

    public static void botonClickTimer() {
        WebActionManager.click(timeTrackerConstants.TIMER_BUTTON);
    }
}
