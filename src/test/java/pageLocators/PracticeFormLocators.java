package pageLocators;

import org.openqa.selenium.By;

public class PracticeFormLocators {
    public static final By firstNameElement = By.xpath("//input[@placeholder='First Name']");
    public static final By lastNameElement = By.xpath("//input[@placeholder='Last Name']");
    public static final By emailElement = By.xpath("//input[@placeholder='name@example.com']");
    public static final By genderValue = By.xpath("//label[@for='gender-radio-1']");
    public static final By mobileNumberElement = By.xpath("//input[@placeholder='Mobile Number']");
    public static final By dateOfBirthElement = By.xpath("//input[@id='dateOfBirthInput']");
    public static final By subjectsElement = By.xpath("//input[@id='subjectsInput']");
    public static final By hobbiesStringValue = By.xpath("//label[@for='hobbies-checkbox-1']");
    public static final By pictureElement = By.id("uploadPicture");
    public static final By currentAddressElement = By.id("currentAddress");
    public static final By stateElement = By.xpath("//div[text()='Select State']");
    public static final By stateInputElement = By.id("react-select-3-input");
    public static final By cityElement = By.xpath("//div[text()='Select City']");
    public static final By cityInputElement = By.id("react-select-4-input");
    public static final By submitElement = By.id("submit");
    public static final By thankYouLocator = By.id("example-modal-sizes-title-lg");
    public static final By rowsLocator = By.xpath("//tbody/tr");
}
