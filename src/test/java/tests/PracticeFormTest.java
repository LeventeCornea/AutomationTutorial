package tests;

import helpMethods.ElementHelper;
import helpMethods.PageHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() throws InterruptedException {

        ElementHelper elementHelper = new ElementHelper(driver);

        By formsMenu = By.xpath("//h5[text()='Forms']");
        elementHelper.clickJSLocator(formsMenu);

        By practiceFormSubMenu = By.xpath("//span[text()='Practice Form']");
        elementHelper.clickJSLocator(practiceFormSubMenu);

        By firstNameElement = By.xpath("//input[@placeholder='First Name']");
        String firstNameValue = "Dan";
        elementHelper.fillLocator(firstNameElement, firstNameValue);

        By lastNameElement = By.xpath("//input[@placeholder='Last Name']");
        String lastNameValue = "Dudas";
        elementHelper.fillLocator(lastNameElement, lastNameValue);

        By emailElement = By.xpath("//input[@placeholder='name@example.com']");
        String emailValue = "dvdudas@yahoo.com";
        elementHelper.fillLocator(emailElement, emailValue);

        By genderValue = By.xpath("//label[@for='gender-radio-1']");
        elementHelper.clickLocator(genderValue);

        By mobileNumberElement = By.xpath("//input[@placeholder='Mobile Number']");
        String mobileNumberValue = "0359808779";
        elementHelper.fillLocator(mobileNumberElement, mobileNumberValue);


        By dateOfBirthElement = By.xpath("//input[@id='dateOfBirthInput']");
        elementHelper.clickLocator(dateOfBirthElement);
        elementHelper.fillLocator(dateOfBirthElement, Keys.CONTROL + "a");
        String dateOfBirthValue = "03 October,1961";
        elementHelper.fillLocator(dateOfBirthElement, dateOfBirthValue);

        By subjectsElement = By.xpath("//input[@id='subjectsInput']");

        List<String> subjects = Arrays.asList("Maths", "Arts", "English", "Biology");

        for (String subject : subjects) {
            elementHelper.fillPressLocator(subjectsElement, subject, Keys.ENTER);
        }

        By hobbiesStringValue = By.xpath("//label[@for='hobbies-checkbox-1']");
        elementHelper.clickJSLocator(hobbiesStringValue);

        By pictureElement = By.id("uploadPicture");
        File file = new File("src/test/resources/Capture.png");
        elementHelper.fillLocator(pictureElement, file.getAbsolutePath());

        By currentAddressElement = By.id("currentAddress");
        String currentAddressValue = "Satu Mare, jud. Satu Mare";
        elementHelper.fillLocator(currentAddressElement, currentAddressValue);

        By stateElement = By.xpath("//div[text()='Select State']");
        elementHelper.clickJSLocator(stateElement);

        By stateInputElement = By.id("react-select-3-input");
        String stateValue = "NCR";
        elementHelper.fillPressLocator(stateInputElement, stateValue, Keys.ENTER);

        By cityElement = By.xpath("//div[text()='Select City']");
        elementHelper.clickJSLocator(cityElement);

        By cityInputElement = By.id("react-select-4-input");
        String cityValue = "Delhi";
        elementHelper.fillPressLocator(cityInputElement, cityValue, Keys.ENTER);

        By submitElement = By.id("submit");
        elementHelper.clickLocator(submitElement);

        By thankYouLocator = By.id("example-modal-sizes-title-lg");
        WebElement thankYouElement = driver.findElement(thankYouLocator);
        String actualMessage = thankYouElement.getText();
        String expectedMessage = "Thanks for submitting the form";
        Assert.assertEquals(actualMessage.trim(), expectedMessage.trim());

        By rowsLocator = By.xpath("//tbody/tr");
        List<WebElement> rowsList = driver.findElements(rowsLocator);

        Assert.assertTrue(rowsList.get(0).getText().trim().contains("Student Name"));
        Assert.assertTrue(rowsList.get(0).getText().trim().contains(firstNameValue.trim()));
        Assert.assertTrue(rowsList.get(0).getText().trim().contains(lastNameValue.trim()));

        Assert.assertTrue(rowsList.get(1).getText().trim().contains("Student Email"));
        Assert.assertTrue(rowsList.get(1).getText().trim().contains(emailValue.trim()));

        Assert.assertTrue(rowsList.get(2).getText().trim().contains("Gender"));
        Assert.assertTrue(rowsList.get(2).getText().trim().contains("Male"));

        Assert.assertTrue(rowsList.get(3).getText().trim().contains("Mobile"));
        Assert.assertTrue(rowsList.get(3).getText().trim().contains(mobileNumberValue.trim()));

        Assert.assertTrue(rowsList.get(4).getText().trim().contains("Date of Birth"));
        Assert.assertTrue(rowsList.get(4).getText().trim().contains(dateOfBirthValue.trim()));

        String subjectStringValue = String.join(", ", subjects);
        Assert.assertTrue(rowsList.get(5).getText().trim().contains("Subjects"));
        Assert.assertTrue(rowsList.get(5).getText().trim().contains(subjectStringValue.trim()));

        Assert.assertTrue(rowsList.get(6).getText().trim().contains("Hobbies"));
        Assert.assertTrue(rowsList.get(6).getText().trim().contains("Sports"));

        Assert.assertTrue(rowsList.get(7).getText().trim().contains("Picture"));
        Assert.assertTrue(rowsList.get(7).getText().trim().contains("Capture.png"));

        Assert.assertTrue(rowsList.get(8).getText().trim().contains("Address"));
        Assert.assertTrue(rowsList.get(8).getText().trim().contains(currentAddressValue.trim()));

        String expectedStateAndCity = stateValue + " " + cityValue;
        Assert.assertTrue(rowsList.get(9).getText().trim().contains("State and City"));
        Assert.assertTrue(rowsList.get(9).getText().trim().contains(expectedStateAndCity.trim()));
    }
}