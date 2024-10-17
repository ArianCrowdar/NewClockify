package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.proyectoConstants;
import lippia.web.constants.workspaceConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class proyectoService {

    public static void botonProjects() {
        WebActionManager.click(proyectoConstants.PROJECTS_BUTTON);
    }

    public static void botonCreateNewProject() {
        WebActionManager.click(proyectoConstants.CREATE_NEW_PROJECT_BUTTON, false);
    }

    public static void ingresarNombreProyecto(String projecto) {
        WebActionManager.setInput(proyectoConstants.ENTER_NAME_PROJECT, projecto);
    }

    public static void proyectoExitoso() {
        waitVisibility(proyectoConstants.PROJECT_SUCCESSFUL);
        Assert.assertTrue(isVisible(proyectoConstants.PROJECT_SUCCESSFUL));
    }

    public static void botonCREATEPROJECT() {
        WebActionManager.click(proyectoConstants.CREATE_PROJECT_BUTTON);
    }
}
