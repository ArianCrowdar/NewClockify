package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.loginConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.crowdar.core.actions.ActionManager.*;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class loginService {

    public static void botonClickLogInManually() {
        WebActionManager.click(loginConstants.MANUALLY_LOGIN_BUTTON);

    }

    public static void loginExitoso() {
        waitVisibility(loginConstants.LOGIN_SUCCESSFUL);
        Assert.assertTrue(isVisible(loginConstants.LOGIN_SUCCESSFUL));
    }

    public static void loginPagina() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void ingresarEmail(String email) {
        WebActionManager.setInput(loginConstants.ENTER_EMAIL, email);
    }

    public static void ingresarPassword(String password) {
        WebActionManager.setInput(loginConstants.ENTER_PASSWORD, password);
    }

    public static void botonLOGIN() {
        WebActionManager.click(loginConstants.LOGIN_BUTTON);
    }

    public static void mensajeErrorEmailFormatNotValid() {
        waitVisibility(loginConstants.ERROR_MESSAGE_EMAIL_FORMAT);
        Assert.assertTrue(isVisible(loginConstants.ERROR_MESSAGE_EMAIL_FORMAT));
    }
}
