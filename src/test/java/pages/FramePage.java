package pages;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public FramePage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void switchToSpecificTab(){
        driver.switchTo().frame("frame1");
        WebElement textElement = driver.findElement(FrameLocators.textElement);
        System.out.println(textElement.getText());
    }

    public void switchToParent(){
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement textElement2 = driver.findElement(FrameLocators.textElement);
        System.out.println(textElement2.getText());
    }
}
