package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageLocators.IndexLocators;

public class IndexPage {

    private WebDriver driver;
    private ElementHelper elementHelper;


    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void enterOnAlertFrameWindowMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsFrameWindowsMenu);
        LoggerUtility.infoTest("The user clicks on Alert Frame Window Menu");
    }

    public void enterOnAlertSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsSubmenu);
        LoggerUtility.infoTest("The user clicks on Alert SubMenu");
    }

    public void enterOnWindowSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.browserWindowsSubmenu);
        LoggerUtility.infoTest("The user clicks on Browser SubMenu");
    }

    public void enterOnFrameSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.framesSubmenu);
        LoggerUtility.infoTest("The user clicks on Frame SubMenu");
    }

    public void enterOnFormsMenu(){
        elementHelper.clickJSLocator(IndexLocators.formsMenu);
        LoggerUtility.infoTest("The user clicks on Forms Menu");
    }

    public void enterOnPracticeFormsSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.practiceFormSubMenu);
        LoggerUtility.infoTest("The user clicks on Forms SubMenu");
    }

    public void enterOnElementsMenu(){
        elementHelper.clickJSLocator(IndexLocators.elementsMenu);
        LoggerUtility.infoTest("The user clicks on Elements Menu");
    }

    public void enterOnWebTablesMenu(){
        elementHelper.clickJSLocator(IndexLocators.webTablesSubmenu);
        LoggerUtility.infoTest("The user clicks on Web Tables Menu");
    }

    public void enterOnAddElement(){
        elementHelper.clickJSLocator(IndexLocators.addElement);
        LoggerUtility.infoTest("The user clicks on Add Element");
    }
}
