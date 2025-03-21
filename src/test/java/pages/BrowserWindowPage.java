package pages;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pageLocators.BrowserWindowLocators.newTabClick;
import static pageLocators.BrowserWindowLocators.newWindowClick;

public class BrowserWindowPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    private TabWindowHelper tabWindowHelper;

    public BrowserWindowPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        tabWindowHelper = new TabWindowHelper(driver);

    }

    public void interactWithSpecificTab(){
        tabWindowHelper.switchToSpecificTabWindow(0);

        elementHelper.clickJSLocator(newWindowClick);

        tabWindowHelper.switchToSpecificTabWindow(1);
    }

    public void interactWithSpecificWindow(){
        elementHelper.clickJSLocator(newTabClick);

        System.out.println(driver.getCurrentUrl());
        tabWindowHelper.switchToSpecificTabWindow(1);

        System.out.println(driver.getCurrentUrl());

        tabWindowHelper.closeCurrentTabWindow();
    }
}
