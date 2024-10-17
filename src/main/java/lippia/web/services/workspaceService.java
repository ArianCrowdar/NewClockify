package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.loginConstants;
import lippia.web.constants.workspaceConstants;

import java.util.concurrent.TimeUnit;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static oracle.jdbc.driver.OracleLog.isEnabled;

public class workspaceService {

    public static void botonTresPuntos() {
        WebActionManager.click(workspaceConstants.THREE_BUTTON);
    }

    public static void botonManageWorkspaces() {
        WebActionManager.click(workspaceConstants.MANAGE_WORKSPACE_BUTTON);
    }

    public static void botonCreateNewWorkspace() {
        //Thread.sleep(5000);
       WebActionManager.click(workspaceConstants.CREATE_NEW_WORKSPACE_BUTTON, false);
    }

    public static void ingresarNombreWorkspace(String workspace) {
        WebActionManager.setInput(workspaceConstants.ENTER_WORKSPACE_NAME, workspace);
    }

    public static void botonCREATE() {
        WebActionManager.click(workspaceConstants.CREATE_WORKSPACE_BUTTON, false);
    }

    public static void workspaceCreado() {
        waitVisibility(workspaceConstants.WORKSPACE_SUCCESSFUL);
        Assert.assertTrue(isVisible(workspaceConstants.WORKSPACE_SUCCESSFUL));
    }

    public static void BotonSETTINGS() {
        WebActionManager.waitClickable(workspaceConstants.SETTINGS_BUTTON);
        WebActionManager.click(workspaceConstants.SETTINGS_BUTTON, false);
    }

    public static void ingresarSettingsWorkspaceName(String workspace) {
        WebActionManager.setInput(workspaceConstants.ENTER_SETTINGS_WORKSPACE_NAME, workspace);
    }

    public static void clickPagina() {
        WebActionManager.click(workspaceConstants.CLICK_PAGE, false);
    }

    public static void workspaceNuevoNombre() throws InterruptedException {
        waitVisibility(workspaceConstants.WORKSPACE_SUCCESSFUL_NAME);
        Assert.assertTrue(isVisible(workspaceConstants.WORKSPACE_SUCCESSFUL_NAME));
    }
}
