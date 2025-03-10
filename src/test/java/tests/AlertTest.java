package tests;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;

public class AlertTest extends SharedData {

    @Test
    public void metodaTest() {

        ElementHelper elementHelper = new ElementHelper(driver);

        AlertHelper alertHelper = new AlertHelper(driver);

        By alertFrameWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickJSLocator(alertFrameWindowsMenu);

        By alertsSubmenu = By.xpath("//span[text()='Alerts']");
        elementHelper.clickJSLocator(alertsSubmenu);

        By alertOkElement = By.id("alertButton");
        elementHelper.clickJSLocator(alertOkElement);

        alertHelper.acceptAlert();

        By timerAlertButtonElement = By.id("timerAlertButton");
        elementHelper.clickJSLocator(timerAlertButtonElement);

        alertHelper.acceptAlert();

        By confirmButtonElement = By.id("confirmButton");
        elementHelper.clickJSLocator(confirmButtonElement);

        alertHelper.cancelAlert();

        By promtButtonElement = By.id("promtButton");
        elementHelper.clickJSLocator(promtButtonElement);

        alertHelper.fillAlert("Altceva");
    }
}
