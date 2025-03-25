package tests;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.WebFormPage;
import sharedData.SharedData;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnElementsMenu();
        indexPage.enterOnWebTablesMenu();
        indexPage.enterOnAddElement();

        String firstNameValue = "Levente";
        String lastNameValue = "Cornea";
        String userEmailValue = "cornealevente13@gmail.com";
        String ageValue = "29";
        String salaryValue = "3500";
        String departmentValue = "Calculatoare";
        String editFirstNameValue = "Alin";
        String editLastNameValue = "Oprescu";
        String editUserEmailValue = "alin.oprescu@mail.ru";
        String editAgeValue = "55";
        String editSalaryValue = "4000";
        String editDepartmentValue = "Vanzari";
        WebFormPage webFormPage = new WebFormPage(driver);
        webFormPage.fillFirstNameElement(firstNameValue);
        webFormPage.fillLastNameElement(lastNameValue);
        webFormPage.fillUserEmailElement(userEmailValue);
        webFormPage.fillAgeElement(ageValue);
        webFormPage.fillSalaryElement(salaryValue);
        webFormPage.fillDepartmentElement(departmentValue);
        webFormPage.fillSubmitElement();
        webFormPage.fillEditElement();
        webFormPage.fillEditFirstNameElement(editFirstNameValue);
        webFormPage.fillEditLastNameElement(editLastNameValue);
        webFormPage.fillEditUserEmailElement(editUserEmailValue);
        webFormPage.fillEditAgeElement(editAgeValue);
        webFormPage.fillEditSalaryElement(editSalaryValue);
        webFormPage.fillEditDepartmentElement(editDepartmentValue);
    }
}
