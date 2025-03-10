package tests;

import helpMethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;


public class FrameTest extends SharedData {

    @Test
    public void metodaTest() {

        ElementHelper elementHelper = new ElementHelper(driver);

        By framesWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
        elementHelper.clickJSLocator(framesWindowsMenu);

        By framesSubmenu = By.xpath("//span[text()='Frames']");
        elementHelper.clickJSLocator(framesSubmenu);

        driver.switchTo().frame("frame1");
        WebElement textElement = driver.findElement(By.id("sampleHeading"));
        System.out.println(textElement.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        WebElement textElement2 = driver.findElement(By.id("sampleHeading"));
        System.out.println(textElement2.getText());

        driver.switchTo().defaultContent();
    }

}
