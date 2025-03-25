package tests;

import helpMethods.ElementHelper;
import helpMethods.PageHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.PracticeFormPage;
import sharedData.SharedData;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() throws InterruptedException {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterOnFormsMenu();
        indexPage.enterOnPracticeFormsSubMenu();


        String firstNameValue = "Dan";
        String lastNameValue = "Dudas";
        String emailValue = "dvdudas@yahoo.com";
        String mobileNumberValue = "0359808779";
        String dateOfBirthValue = "03 October,1961";
        List<String> subjects = Arrays.asList("Maths", "Arts", "English", "Biology");
        String currentAddressValue = "Satu Mare, jud. Satu Mare";
        String stateValue = "NCR";
        String cityValue = "Delhi";
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillFirstName(firstNameValue);
        practiceFormPage.fillLastName(lastNameValue);
        practiceFormPage.fillEmail(emailValue);
        practiceFormPage.fillGender();
        practiceFormPage.fillMobilePhoneNumber(mobileNumberValue);
        practiceFormPage.filldateOfBirth(dateOfBirthValue);
        practiceFormPage.fillSubjects(subjects);
        practiceFormPage.fillHobbies();
        practiceFormPage.fillPicture();
        practiceFormPage.fillAddress(currentAddressValue);
        practiceFormPage.fillStateElement();
        practiceFormPage.fillStateInputElement(stateValue);
        practiceFormPage.fillCityElement();
        practiceFormPage.fillCityInputElement(cityValue);
        practiceFormPage.fillSubmitButton();
        practiceFormPage.fillThankYouMessage();
        practiceFormPage.validateEntireTable(firstNameValue, lastNameValue, emailValue, mobileNumberValue, dateOfBirthValue, subjects, currentAddressValue, stateValue, cityValue);
    }
}