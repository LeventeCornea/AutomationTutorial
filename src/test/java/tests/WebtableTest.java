package tests;

import helpMethods.ElementHelper;
import helpMethods.TabWindowHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class WebtableTest extends SharedData {

    @Test
    public void metodaTest() {

        TabWindowHelper tabWindowHelper = new TabWindowHelper(driver);

        ElementHelper elementHelper = new ElementHelper(driver);

        By formsMenu = By.xpath("//h5[text()='Elements']");
        elementHelper.clickJSLocator(formsMenu);

        By webTablesSubmenu = By.xpath("//span[text()='Web Tables']");
        elementHelper.clickJSLocator(webTablesSubmenu);

        By addElement = By.id("addNewRecordButton");
        elementHelper.clickJSLocator(addElement);


        By firstNameElement = By.id("firstName");
        String firstNameValue = "Levente";
        elementHelper.fillLocator(firstNameElement, firstNameValue);


        By lastNameElement = By.id("lastName");
        String lastNameValue = "Cornea";
        elementHelper.fillLocator(lastNameElement, lastNameValue);

        By userEmailElement = By.id("userEmail");
        String userEmailValue = "cornealevente13@gmail.com";
        elementHelper.fillLocator(userEmailElement, userEmailValue);


        By ageElement = By.id("age");
        String ageValue = "29";
        elementHelper.fillLocator(ageElement, ageValue);


        By salaryElement = By.id("salary");
        String salaryValue = "3500";
        elementHelper.fillLocator(salaryElement, salaryValue);


        By departmentElement = By.id("department");
        String departmentValue = "Calculatoare";
        elementHelper.fillLocator(departmentElement, departmentValue);

        By submitElement = By.id("submit");
        elementHelper.clickJSLocator(submitElement);

        By editElement = By.id("edit-record-1");
        elementHelper.clickJSLocator(editElement);

        By editFirstNameElement = By.id("firstName");
        String editFirstNameValue = "Alin";
        elementHelper.clickLocator(editFirstNameElement);
        elementHelper.fillLocator(editFirstNameElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editFirstNameElement, editFirstNameValue);

        By editLastNameElement = By.id("lastName");
        String editLastNameValue = "Oprescu";
        elementHelper.clickLocator(editLastNameElement);
        elementHelper.fillLocator(editLastNameElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editLastNameElement, editLastNameValue);

        By editUserEmailElement = By.id("userEmail");
        String editUserEmailValue = "alin.oprescu@mail.ru";
        elementHelper.clickLocator(editUserEmailElement);
        elementHelper.fillLocator(editUserEmailElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editUserEmailElement, editUserEmailValue);

        By editAgeElement = By.id("age");
        String editAgeValue = "55";
        elementHelper.clickLocator(editAgeElement);
        elementHelper.fillLocator(editAgeElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editAgeElement, editAgeValue);

        By editSalaryElement = By.id("salary");
        String editSalaryValue = "4000";
        elementHelper.clickLocator(editSalaryElement);
        elementHelper.fillLocator(editSalaryElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editSalaryElement, editSalaryValue);

        By editDepartmentElement = By.id("department");
        String editDepartmentValue = "Vanzari";
        elementHelper.clickLocator(editDepartmentElement);
        elementHelper.fillLocator(editDepartmentElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editDepartmentElement ,editDepartmentValue);

    }
}
