package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.loginConstants;
import lippia.web.constants.logoutConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class logoutService {

    public static void botonUsuario() {
        WebActionManager.click(logoutConstants.USER_BUTTON);
    }

    public static void paginaTracker() {
        navigateTo("https://app.clockify.me/tracker#");
    }

    public static void botonLogout() {
        WebActionManager.click(logoutConstants.LOGOUT_BUTTON);
    }

    public static void logoutExitoso() {
        waitVisibility(logoutConstants.MESSAGE_LOGOUT_XPATH);
        Assert.assertTrue(isVisible(logoutConstants.MESSAGE_LOGOUT_XPATH));
    }
}
