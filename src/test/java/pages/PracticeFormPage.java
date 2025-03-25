package pages;

import helpMethods.ElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.util.List;

import static pageLocators.PracticeFormLocators.*;

public class PracticeFormPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void fillFirstName(String firstNameValue) {
        elementHelper.fillLocator(firstNameElement, firstNameValue);
    }

    public void fillLastName(String lastNameValue){
        elementHelper.fillLocator(lastNameElement, lastNameValue);
    }

    public void fillEmail(String emailValue){
        elementHelper.fillLocator(emailElement, emailValue);
    }

    public void fillGender(){
        elementHelper.clickJSLocator(genderValue);
    }

    public void fillMobilePhoneNumber(String mobileNumberValue){
        elementHelper.fillLocator(mobileNumberElement, mobileNumberValue);
    }

    public void filldateOfBirth(String dateOfBirthValue){
        elementHelper.clickJSLocator(dateOfBirthElement);
        elementHelper.fillLocator(dateOfBirthElement, Keys.CONTROL + "a");
        elementHelper.fillLocator(dateOfBirthElement, dateOfBirthValue);
    }

    public void fillSubjects(List<String> subjects){
        for (String subject : subjects) {
            elementHelper.fillPressLocator(subjectsElement, subject, Keys.ENTER);
        }
    }

    public void fillHobbies(){
        elementHelper.clickJSLocator(hobbiesStringValue);
    }

    public void fillPicture(){
        File file = new File("src/test/resources/Capture.png");
        elementHelper.fillLocator(pictureElement, file.getAbsolutePath());
    }

    public void fillAddress(String currentAddressValue){
        elementHelper.fillLocator(currentAddressElement, currentAddressValue);
    }

    public void fillStateElement(){
        elementHelper.clickJSLocator(stateElement);
    }

    public void fillStateInputElement(String stateValue){
        elementHelper.fillPressLocator(stateInputElement, stateValue, Keys.ENTER);
    }

    public void fillCityElement(){
        elementHelper.clickJSLocator(cityElement);
    }

    public void fillCityInputElement(String cityValue){
        elementHelper.fillPressLocator(cityInputElement, cityValue, Keys.ENTER);
    }

    public void fillSubmitButton(){
        elementHelper.clickJSLocator(submitElement);
    }

    public void fillThankYouMessage(){
        WebElement thankYouElement = driver.findElement(thankYouLocator);
        String actualMessage = thankYouElement.getText();
        String expectedMessage = "Thanks for submitting the form";
        Assert.assertEquals(actualMessage.trim(), expectedMessage.trim());
    }

    public void validateEntireTable(String firstNameValue, String lastNameValue, String emailValue, String mobileNumberValue, String dateOfBirthValue, List<String> subjects, String currentAddressValue, String stateValue, String cityValue){
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
