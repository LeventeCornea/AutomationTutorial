package pages;

import helpMethods.AlertHelper;
import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageLocators.AlertLocators;

public class AlertPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private AlertHelper alertHelper;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        alertHelper = new AlertHelper(driver);
    }

    public void interactWithAcceptAlert(){
        elementHelper.clickJSLocator(AlertLocators.alertOkElement);
        LoggerUtility.infoTest("The user clicks on Alert OK Button");
        alertHelper.acceptAlert();
        LoggerUtility.infoTest("The user accepts the Alert Display");
    }

    public void interactWithTimerAlert(){
        elementHelper.clickJSLocator(AlertLocators.timerAlertButtonElement);
        LoggerUtility.infoTest("The user clicks on Timer Alert Button");
        alertHelper.acceptAlert();
        LoggerUtility.infoTest("The user accepts the Timer Alert Button");
    }

    public void interactWithCancelAlert(){
        elementHelper.clickJSLocator(AlertLocators.confirmButtonElement);
        LoggerUtility.infoTest("The user clicks on Cancel Alert Button");
        alertHelper.cancelAlert();
        LoggerUtility.infoTest("The user accepts the Cancel Alert Button");
    }

    public void interactWithPromtAlert(String value){
        elementHelper.clickJSLocator(AlertLocators.promtButtonElement);
        LoggerUtility.infoTest("The user clicks on Promt Alert Button");
        alertHelper.fillAlert(value);
        LoggerUtility.infoTest("The user accepts the Promt Alert Button");
    }
}