package pageLocators;

import org.openqa.selenium.By;

public class IndexLocators {

    public static final By alertsFrameWindowsMenu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    public static final By alertsSubmenu = By.xpath("//span[text()='Alerts']");
    public static final By browserWindowsSubmenu = By.xpath("//span[text()='Browser Windows']");
    public static final By framesSubmenu = By.xpath("//span[text()='Frames']");
    public static final By formsMenu = By.xpath("//h5[text()='Forms']");
    public static final By practiceFormSubMenu = By.xpath("//span[text()='Practice Form']");
    public static final By elementsMenu = By.xpath("//h5[text()='Elements']");
    public static final By webTablesSubmenu = By.xpath("//span[text()='Web Tables']");
    public static final By addElement = By.id("addNewRecordButton");
}
