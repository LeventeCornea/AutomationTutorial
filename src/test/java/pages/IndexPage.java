package pages;

import helpMethods.ElementHelper;
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
    }

    public void enterOnAlertSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.alertsSubmenu);
    }

    public void enterOnWindowSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.browserWindowsSubmenu);
    }

    public void enterOnFrameSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.framesSubmenu);
    }

    public void enterOnFormsMenu(){
        elementHelper.clickJSLocator(IndexLocators.formsMenu);
    }

    public void enterOnPracticeFormsSubMenu(){
        elementHelper.clickJSLocator(IndexLocators.practiceFormSubMenu);
    }

    public void enterOnElementsMenu(){
        elementHelper.clickJSLocator(IndexLocators.elementsMenu);
    }

    public void enterOnWebTablesMenu(){
        elementHelper.clickJSLocator(IndexLocators.webTablesSubmenu);
    }

    public void enterOnAddElement(){
        elementHelper.clickJSLocator(IndexLocators.addElement);
    }
}
