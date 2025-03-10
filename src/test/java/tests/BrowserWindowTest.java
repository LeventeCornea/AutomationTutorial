package tests;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowTest extends SharedData {

    @Test
    public void metodaTest3() throws InterruptedException {

        TabWindowHelper tabWindowHelper = new TabWindowHelper(driver);

        ElementHelper elementHelper = new ElementHelper(driver);

        By alertFrameWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickJSLocator(alertFrameWindowsMenu);

        By browserWindowsSubmenu = By.xpath("//span[text()='Browser Windows']");
        elementHelper.clickJSLocator(browserWindowsSubmenu);

        By newTabClick = By.id("tabButton");
        elementHelper.clickJSLocator(newTabClick);

        System.out.println(driver.getCurrentUrl());
        tabWindowHelper.switchToSpecificTabWindow(1);

        System.out.println(driver.getCurrentUrl());
        tabWindowHelper.closeCurrentTabWindow();

        tabWindowHelper.switchToSpecificTabWindow(0);
        By newWindowClick = By.id("windowButton");
        elementHelper.clickJSLocator(newWindowClick);

        tabWindowHelper.switchToSpecificTabWindow(1);
        System.out.println(driver.getCurrentUrl());

    }
}
