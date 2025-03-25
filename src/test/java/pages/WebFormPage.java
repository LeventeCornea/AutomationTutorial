package pages;

import helpMethods.ElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.util.List;

import static pageLocators.WebTablesLocators.*;

public class WebFormPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public WebFormPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void fillFirstNameElement(String firstNameValue){
        elementHelper.fillLocator(firstNameElement, firstNameValue);
    }

    public void fillLastNameElement(String lastNameValue){
        elementHelper.fillLocator(lastNameElement, lastNameValue);
    }

    public void fillUserEmailElement(String userEmailValue){
        elementHelper.fillLocator(userEmailElement, userEmailValue);
    }

    public void fillAgeElement(String ageValue){
        elementHelper.fillLocator(ageElement, ageValue);
    }

    public void fillSalaryElement(String salaryValue){
        elementHelper.fillLocator(salaryElement, salaryValue);
    }

    public void fillDepartmentElement(String departmentValue){
        elementHelper.fillLocator(departmentElement, departmentValue);
    }

    public void fillSubmitElement(){
        elementHelper.clickJSLocator(submitElement);
    }

    public void fillEditElement(){
        elementHelper.clickJSLocator(editElement);
    }

    public void fillEditFirstNameElement(String editFirstNameValue){
        elementHelper.clickLocator(editFirstNameElement);
        elementHelper.fillLocator(editFirstNameElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editFirstNameElement, editFirstNameValue);
    }

    public void fillEditLastNameElement(String editLastNameValue){
        elementHelper.clickLocator(editLastNameElement);
        elementHelper.fillLocator(editLastNameElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editLastNameElement, editLastNameValue);
    }

    public void fillEditUserEmailElement(String editUserEmailValue){
        elementHelper.clickLocator(editUserEmailElement);
        elementHelper.fillLocator(editUserEmailElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editUserEmailElement, editUserEmailValue);
    }

    public void fillEditAgeElement(String editAgeValue){
        elementHelper.clickLocator(editAgeElement);
        elementHelper.fillLocator(editAgeElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editAgeElement, editAgeValue);
    }

    public void fillEditSalaryElement(String editSalaryValue){
        elementHelper.clickLocator(editSalaryElement);
        elementHelper.fillLocator(editSalaryElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editSalaryElement, editSalaryValue);
    }

    public void fillEditDepartmentElement(String editDepartmentValue){
        elementHelper.clickLocator(editDepartmentElement);
        elementHelper.fillLocator(editDepartmentElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(editDepartmentElement ,editDepartmentValue);
    }
}
